/* Database: Oracle. Generation date: 2024-03-25 13:50:36:864 */
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


/* Enum List tipoentradaevento table */
create table tipoentradaevento_evento (
	evento_id RAW(16) NOT NULL,
	tipoentradaevento VARCHAR(255) NOT NULL
);
/* Creating index for customization column */
CREATE INDEX evento_ext ON evento (ext) INDEXTYPE IS CTXSYS.CONTEXT PARAMETERS ('section group CTXSYS.JSON_SECTION_GROUP SYNC (ON COMMIT)');

/* Entity Ingresso */
create table ingresso (
	id RAW(16) NOT NULL,
	data_hora TIMESTAMP /* dataHora */,
	convidado RAW(16),
	quantidade_acompanhantes NUMBER(19) NOT NULL /* quantidadeAcompanhantes */,
	evento RAW(16) NOT NULL,
	ext CLOB,
	CONSTRAINT ingresso_JSON_ext CHECK (ext IS JSON)
);


/* Creating index for customization column */
CREATE INDEX ingresso_ext ON ingresso (ext) INDEXTYPE IS CTXSYS.CONTEXT PARAMETERS ('section group CTXSYS.JSON_SECTION_GROUP SYNC (ON COMMIT)');

/* Entity Atracao */
create table atracao (
	id RAW(16) NOT NULL,
	nome VARCHAR(255) NOT NULL,
	data_hora TIMESTAMP /* dataHora */,
	local VARCHAR(30) NOT NULL,
	evento RAW(16),
	ext CLOB,
	CONSTRAINT atracao_JSON_ext CHECK (ext IS JSON)
);


/* Creating index for customization column */
CREATE INDEX atracao_ext ON atracao (ext) INDEXTYPE IS CTXSYS.CONTEXT PARAMETERS ('section group CTXSYS.JSON_SECTION_GROUP SYNC (ON COMMIT)');

/* Join Tables */

/* Primary Key Constraints */
alter table convidado add constraint pk_convidado_id primary key(id);
alter table evento add constraint pk_evento_id primary key(id);
alter table ingresso add constraint pk_ingresso_id primary key(id);
alter table atracao add constraint pk_atracao_id primary key(id);

/* Foreign Key Constraints */
alter table ingresso add constraint fkantdgzqqc6usvylimgmti5mzj80j foreign key (convidado) references convidado (id);
alter table ingresso add constraint fktb5s6zd7zvydgimf9fhsfi2zy6zq foreign key (evento) references evento (id);
alter table atracao add constraint fkbsyhusyqbqao2ohtj978xrdyyolx foreign key (evento) references evento (id);

/* Unique Key Constraints */

/* Sequences for auto increment entity ids */
