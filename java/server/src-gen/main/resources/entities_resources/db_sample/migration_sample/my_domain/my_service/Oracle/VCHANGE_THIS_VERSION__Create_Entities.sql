/* Database: Oracle. Generation date: 2024-03-23 14:22:36:829 */
/* Entity Convidado */
create table convidado (
	id RAW(16) NOT NULL,
	nome VARCHAR(255) NOT NULL,
	nome_social VARCHAR(255) /* nomeSocial */,
	cpf VARCHAR(255) NOT NULL,
	data_nascimneto DATE NOT NULL /* dataNascimneto */,
	ext CLOB,
	CONSTRAINT convidado_JSON_ext CHECK (ext IS JSON)
);


/* Creating index for customization column */
CREATE INDEX convidado_ext ON convidado (ext) INDEXTYPE IS CTXSYS.CONTEXT PARAMETERS ('section group CTXSYS.JSON_SECTION_GROUP SYNC (ON COMMIT)');

/* Entity Evento */
create table evento (
	id RAW(16) NOT NULL,
	nome VARCHAR(30) NOT NULL,
	lotacao_maxima NUMBER(19) NOT NULL /* lotacaoMaxima */,
	data_hora TIMESTAMP NOT NULL /* dataHora */,
	endereco VARCHAR(50) NOT NULL,
	ext CLOB,
	CONSTRAINT evento_JSON_ext CHECK (ext IS JSON)
);


/* Enum List tipoEntradaEvento table */
create table tipoEntradaEvento_evento (
	evento_id RAW(16) NOT NULL,
	tipoEntradaEvento VARCHAR(255) NOT NULL
);
/* Creating index for customization column */
CREATE INDEX evento_ext ON evento (ext) INDEXTYPE IS CTXSYS.CONTEXT PARAMETERS ('section group CTXSYS.JSON_SECTION_GROUP SYNC (ON COMMIT)');

/* Join Tables */

/* Primary Key Constraints */
alter table convidado add constraint pk_convidado_id primary key(id);
alter table evento add constraint pk_evento_id primary key(id);

/* Foreign Key Constraints */

/* Unique Key Constraints */

/* Sequences for auto increment entity ids */
