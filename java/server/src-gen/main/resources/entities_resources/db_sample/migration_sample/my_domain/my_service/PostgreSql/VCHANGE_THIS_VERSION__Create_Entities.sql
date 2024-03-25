/* Database: PostgreSql. Generation date: 2024-03-25 11:04:38:145 */
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
alter table ingresso add constraint fko6cjly6atlhuu5xrrrsxi0dyuciv foreign key (convidado) references convidado (id);
alter table ingresso add constraint fkvrkqruumhbl9trebkdgt3t7k4jxb foreign key (evento) references evento (id);
alter table atracao add constraint fkyg7ppt5bnfobibdrjjk7qt9i3khg foreign key (evento) references evento (id);

/* Unique Key Constraints */

/* Sequences for auto increment entity ids */
