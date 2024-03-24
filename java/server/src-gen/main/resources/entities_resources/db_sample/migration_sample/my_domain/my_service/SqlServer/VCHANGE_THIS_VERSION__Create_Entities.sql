/* Database: SqlServer. Generation date: 2024-03-24 15:09:14:912 */
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
alter table ingresso add constraint fk8wswvigja3lnsnr3pnkbsp4ihl0y foreign key (convidado) references convidado (id);
alter table ingresso add constraint fkadwqgvc5mkjjyrji5ssgcgi5g0qv foreign key (evento) references evento (id);
alter table atracao add constraint fkuijnzecrkusjq5gvk4hjhgu6fxvs foreign key (evento) references evento (id);

/* Unique Key Constraints */

/* Sequences for auto increment entity ids */
