/*CREATE TABLE nome_tabela(
coluna1 tipo null/not null, 
coluno2 tipo null/not null,
......
colunaN tipo null/not null,
PRIMARY KEY(colunaX)
);
*/

-----TABELA AUTOR-----

CREATE TABLE autor(
codautor int not null,
nome varchar(100) not null,
nascimento date,
PRIMARY KEY(codautor)
);