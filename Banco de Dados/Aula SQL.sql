---Tabela Autor---

CREATE TABLE autor(
codAutor serial PRIMARY KEY,
nome varchar(100) not null,
nascimento date not null
);

---Tabela Editora--

CREATE TABLE editora(
codEditora serial PRIMARY KEY,
razao varchar(100) not null,
cnpj char(12) UNIQUE,
endereco varchar(100) not null,
cidade varchar(100) DEFAULT 'SPS'
);

---Tabela Livro---

CREATE TABLE livro(
isbn char(13) PRIMARY KEY,
titulo varchar(100) not null,
valor decimal(6,2),
anoPublicacao numeric(4,0),
volume numeric(3),
codEditora int not null,
FOREIGN KEY(codEditora) REFERENCES editora
);

---Tabela Escreve---

CREATE TABLE escreve(
codAutor int not null,
isbn char(13) not null,
PRIMARY KEY(codAutor, isbn),
FOREIGN KEY(codAutor) REFERENCES autor,
FOREIGN KEY(isbn) REFERENCES livro 
);

---Excluir Tabelas---

/*
DROP TABLE escreve;

DROP TABLE livro;

DROP TABLE editora;

DROP TABLE autor;
*/

---Adicionar uma coluna em uma tabela---

ALTER TABLE autor ADD COLUMN sexo char(1) not null;
ALTER TABLE autor ADD COLUMN titulacao varchar(15) not null;

---Excluir uma coluna em uma tabela---

ALTER TABLE autor DROP COLUMN titulacao;

---Adicionar uma restruição CHECK---

ALTER TABLE autor ADD CONSTRAINT sexo_ck CHECK(sexo IN('M', 'F', 'm', 'f'));

---Excluir uma restrição CHECK---

ALTER TABLE autor DROP CONSTRAINT sexo_ck;

---Excluir a restrição da PK 'escreve'---

ALTER TABLE escreve DROP CONSTRAINT escreve_pkey; 

---Adicionar a restrição da PK 'escreve'---

ALTER TABLE escreve ADD CONSTRAINT escreve_pkey PRIMARY KEY(isbn, codAutor);
