---1--- Por conta do referencia pois dessa maneira fica mais facil de executar de uma vez só

---2---

CREATE TABLE revendedoras(
CNPJ char(14) PRIMARY KEY,
nome varchar(100) not null,
telefone varchar(50) not null,
cidade varchar(100) not null,
estado char(2) not null
);

CREATE TABLE veiculos(
codigo serial PRIMARY KEY,
fabricante varchar(100) not null,
ano numeric(4) not null,
cor varchar(50) not null,
precoTabela decimal(10,2)
);

CREATE TABLE clientes(
CPF char(11) PRIMARY KEY,
nome varchar(100) not null,
telefone char(11) not null,
endereco varchar(100) not null,
cidade varchar(100) not null
);

CREATE TABLE anuncios(
codigo serial PRIMARY KEY,
revenda char(14) not null,
veiculo int not null,
ativo char(1) not null,
FOREIGN KEY (revenda) REFERENCES revendedoras,
FOREIGN KEY (veiculo) REFERENCES veiculos
);

CREATE TABLE vendas(
cdogio serial PRIMARY KEY,
comprador char(11) not null,
anuncio int not null,
dataVenda date not null,
pecoVenda decimal(10,2),
FOREIGN KEY (comprador) REFERENCES clientes,
FOREIGN KEY (anuncio) REFERENCES veiculos
);

---3---

ALTER TABLE clientes ADD COLUMN estado char(2) not null;

---4---

CREATE INDEX index1 ON revendedoras(nome);

---5---

ALTER TABLE veiculos ADD COLUMN modelo varchar(50) not null; --- ALTER TABLE veiculos ADD COLUMN modelo varchar(50) UNIQUE;
ALTER TABLE veiculos ADD CONSTRAINT modUniq UNIQUE(modelo);

---6---

ALTER TABLE veiculos ALTER COLUMN precoTabela SET DEFAULT 0;

---7---

ALTER TABLE anuncios ADD CONSTRAINT ativo_ck CHECK(ativo IN('A', 'I'));