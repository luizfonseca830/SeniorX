/* Entity Evento */
create table evento (
                        id UUID NOT NULL,
                        nome VARCHAR(30) NOT NULL,
                        lotacao_maxima NUMERIC(19) NOT NULL /* lotacaoMaxima */,
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
alter table evento add constraint pk_evento_id primary key(id);

/* Foreign Key Constraints */

/* Unique Key Constraints */

/* Sequences for auto increment entity ids */