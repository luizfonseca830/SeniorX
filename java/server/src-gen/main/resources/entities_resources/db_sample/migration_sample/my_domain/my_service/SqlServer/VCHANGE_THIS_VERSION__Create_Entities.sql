/* Database: SqlServer. Generation date: 2024-03-27 10:36:20:262 */
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
	lotacao_maxima NUMERIC(19) NOT NULL /* lotacaoMaxima */,
	data_hora DATETIME NOT NULL /* dataHora */,
	endereco VARCHAR(50) NOT NULL,
	ext VARCHAR(4000)
);


/* Enum List tipoentradaevento table */
create table tipoentradaevento_evento (
	evento_id UNIQUEIDENTIFIER NOT NULL,
	tipoentradaevento VARCHAR(255) NOT NULL
);
/* Creating index for customization column */
/* column type JSON not supported */

/* Entity Ingresso */
create table ingresso (
	id UNIQUEIDENTIFIER NOT NULL,
	data_hora DATETIME /* dataHora */,
	convidado UNIQUEIDENTIFIER,
	quantidade_acompanhantes NUMERIC(19) NOT NULL /* quantidadeAcompanhantes */,
	evento UNIQUEIDENTIFIER NOT NULL,
	ext VARCHAR(4000)
);


/* Creating index for customization column */
/* column type JSON not supported */

/* Entity Atracao */
create table atracao (
	id UNIQUEIDENTIFIER NOT NULL,
	nome VARCHAR(255) NOT NULL,
	data_hora DATETIME /* dataHora */,
	local VARCHAR(30) NOT NULL,
	evento UNIQUEIDENTIFIER,
	ext VARCHAR(4000)
);


/* Creating index for customization column */
/* column type JSON not supported */

/* Join Tables */

/* Primary Key Constraints */
alter table convidado add constraint pk_convidado_id primary key(id);
alter table evento add constraint pk_evento_id primary key(id);
alter table ingresso add constraint pk_ingresso_id primary key(id);
alter table atracao add constraint pk_atracao_id primary key(id);

/* Foreign Key Constraints */
alter table ingresso add constraint fk6qbnhjdqyvbkpxfhmbo20mwvuu9d foreign key (convidado) references convidado (id);
alter table ingresso add constraint fk0aru5cidmud24xe2etevssgl6h1s foreign key (evento) references evento (id);
alter table atracao add constraint fkghvggoilx1sbpb9go1qwc7qseal7 foreign key (evento) references evento (id);

/* Unique Key Constraints */

/* Sequences for auto increment entity ids */
