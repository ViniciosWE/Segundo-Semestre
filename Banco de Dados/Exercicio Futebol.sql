---1---

---2---

CREATE TABLE clubes(
codigo serial PRIMARY KEY,
nome varchar(100) not null,
site varchar(100) not null,
telefone varchar(50) not null
);

CREATE TABLE jogadores(
codigo serial PRIMARY KEY,
nome varchar(100) not null,
dataNasc date not null
);

CREATE TABLE patrocinadores(
codigo serial PRIMARY KEY,
nome varchar(100) not null,
areaAtuacao Varchar(100) not null
);

CREATE TABLE contratos(
codClube int not null,
codJogador int not null,
dataInicial date not null,
dataFinal date not null,
posicao varchar(100) not null,
salario decimal(8,2),
PRIMARY KEY(codClube, codJogador, dataInicial),
FOREIGN KEY (codClube) REFERENCES clubes,
FOREIGN KEY (codJogador) REFERENCES jogadores 
);

CREATE TABLE confrontos(
codClubeCasa int not null,
codClubeVist int not null,
data date not null,
golsClubeCasa smallint not null,
golsClubeVist smallint not null,
PRIMARY KEY(codClubeCasa, codClubeVist, data),
FOREIGN KEY (codClubeCasa) REFERENCES clubes,
FOREIGN KEY (codClubeVist) REFERENCES clubes
);

CREATE TABLE patrocinios(
codClube int not null,
codPatrocinador int not null,
PRIMARY KEY(codClube, codPatrocinador),
FOREIGN KEY(CodClube) REFERENCES clubes,
FOREIGN KEY (codPatrocinador) REFERENCES patrocinadores
);

---3---

CREATE INDEX index1 ON jogadores(nome);

---4---

ALTER TABLE jogadores ADD COLUMN CPF char(11) UNIQUE;

---5---

ALTER TABLE jogadores ADD COLUMN nomeFantasia varchar(100);

---6---

ALTER TABLE patrocinadores ADD CONSTRAINT modUniq UNIQUE(nome); 

---7---

ALTER TABLE contratos ALTER COLUMN salario SET DEFAULT 1200;

---8---

ALTER TABLE confrontos ADD CONSTRAINT golsClubeCasa_ck CHECK(golsClubeCasa>=0);
ALTER TABLE confrontos ADD CONSTRAINT golsClubVist_ck CHECK(golsClubeVist>=0);