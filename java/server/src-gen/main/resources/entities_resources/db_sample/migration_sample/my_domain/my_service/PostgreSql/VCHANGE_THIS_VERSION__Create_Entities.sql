/* Database: PostgreSql. Generation date: 2024-03-23 14:35:09:321 */
/* Entity Convidado */
create table convidado (
	id UUID NOT NULL,
	nome VARCHAR(255) NOT NULL,
	nome_social VARCHAR(255) /* nomeSocial */,
	cpf VARCHAR(255) NOT NULL,
	data_nascimneto DATE NOT NULL /* dataNascimneto */,
	ext JSONB
);


/* Creating index for customization column */
create index convidado_ext on convidado using gin (ext);

/* Entity Evento */
create table evento (
	id UUID NOT NULL,
	nome VARCHAR(30) NOT NULL,
	data_hora TIMESTAMP NOT NULL /* dataHora */,
	endereco VARCHAR(50) NOT NULL,
	ext JSONB
);


/* Enum List tipoEntradaEvento table */
create table tipoEntradaEvento_evento (
	evento_id UUID NOT NULL,
	tipoEntradaEvento VARCHAR(255) NOT NULL
);
/* Creating index for customization column */
create index evento_ext on evento using gin (ext);

/* Join Tables */

/* Primary Key Constraints */
alter table convidado add constraint pk_convidado_id primary key(id);
alter table evento add constraint pk_evento_id primary key(id);

/* Foreign Key Constraints */

/* Unique Key Constraints */

/* Sequences for auto increment entity ids */
