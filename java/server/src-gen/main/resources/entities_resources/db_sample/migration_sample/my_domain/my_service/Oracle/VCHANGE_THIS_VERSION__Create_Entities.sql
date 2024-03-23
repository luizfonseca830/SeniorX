/* Database: Oracle. Generation date: 2024-03-22 17:22:35:349 */
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

/* Join Tables */

/* Primary Key Constraints */
alter table convidado add constraint pk_convidado_id primary key(id);

/* Foreign Key Constraints */

/* Unique Key Constraints */

/* Sequences for auto increment entity ids */
