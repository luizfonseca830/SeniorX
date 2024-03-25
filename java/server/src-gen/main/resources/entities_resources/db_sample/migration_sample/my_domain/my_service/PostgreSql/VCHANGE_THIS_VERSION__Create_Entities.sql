/* Database: PostgreSql. Generation date: 2024-03-25 17:31:19:943 */
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
	lotacao_maxima NUMERIC(19) NOT NULL /* lotacaoMaxima */,
	data_hora TIMESTAMP NOT NULL /* dataHora */,
	endereco VARCHAR(50) NOT NULL,
	ext JSONB
);


/* Enum List tipoentradaevento table */
create table tipoentradaevento_evento (
	evento_id UUID NOT NULL,
	tipoentradaevento VARCHAR(255) NOT NULL
);
/* Creating index for customization column */
create index evento_ext on evento using gin (ext);

/* Entity Ingresso */
create table ingresso (
	id UUID NOT NULL,
	data_hora TIMESTAMP /* dataHora */,
	convidado UUID,
	quantidade_acompanhantes NUMERIC(19) NOT NULL /* quantidadeAcompanhantes */,
	evento UUID NOT NULL,
	ext JSONB
);


/* Creating index for customization column */
create index ingresso_ext on ingresso using gin (ext);

/* Entity Atracao */
create table atracao (
	id UUID NOT NULL,
	nome VARCHAR(255) NOT NULL,
	data_hora TIMESTAMP /* dataHora */,
	local VARCHAR(30) NOT NULL,
	evento UUID,
	ext JSONB
);


/* Creating index for customization column */
create index atracao_ext on atracao using gin (ext);

/* Join Tables */

/* Primary Key Constraints */
alter table convidado add constraint pk_convidado_id primary key(id);
alter table evento add constraint pk_evento_id primary key(id);
alter table ingresso add constraint pk_ingresso_id primary key(id);
alter table atracao add constraint pk_atracao_id primary key(id);

/* Foreign Key Constraints */
alter table ingresso add constraint fkqgnonijuhctlfavbzxb0mwhrn48q foreign key (convidado) references convidado (id);
alter table ingresso add constraint fkpbfp6ecnfejble843mg0ze2fictm foreign key (evento) references evento (id);
alter table atracao add constraint fkefgd22cylnxbedkbfgeis8inrgku foreign key (evento) references evento (id);

/* Unique Key Constraints */

/* Sequences for auto increment entity ids */
