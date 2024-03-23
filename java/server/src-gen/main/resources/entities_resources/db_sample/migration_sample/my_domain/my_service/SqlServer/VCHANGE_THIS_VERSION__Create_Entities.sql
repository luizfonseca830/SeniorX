/* Database: SqlServer. Generation date: 2024-03-23 14:35:09:331 */
/* Entity Convidado */
create table convidado (
	id UNIQUEIDENTIFIER NOT NULL,
	nome VARCHAR(255) NOT NULL,
	nome_social VARCHAR(255) /* nomeSocial */,
	cpf VARCHAR(255) NOT NULL,
	data_nascimneto DATE NOT NULL /* dataNascimneto */,
	ext VARCHAR(4000)
);


/* Creating index for customization column */
/* column type JSON not supported */

/* Entity Evento */
create table evento (
	id UNIQUEIDENTIFIER NOT NULL,
	nome VARCHAR(30) NOT NULL,
	data_hora DATETIME NOT NULL /* dataHora */,
	endereco VARCHAR(50) NOT NULL,
	ext VARCHAR(4000)
);


/* Enum List tipoEntradaEvento table */
create table tipoEntradaEvento_evento (
	evento_id UNIQUEIDENTIFIER NOT NULL,
	tipoEntradaEvento VARCHAR(255) NOT NULL
);
/* Creating index for customization column */
/* column type JSON not supported */

/* Join Tables */

/* Primary Key Constraints */
alter table convidado add constraint pk_convidado_id primary key(id);
alter table evento add constraint pk_evento_id primary key(id);

/* Foreign Key Constraints */

/* Unique Key Constraints */

/* Sequences for auto increment entity ids */
