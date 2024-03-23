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

alter table ingresso add constraint pk_ingresso_id primary key(id);

/* Foreign Key Constraints */
alter table ingresso add constraint fkip8jbakoazvbvrx76jzhbl1oi6i1 foreign key (convidado) references convidado (id);
alter table ingresso add constraint fk7pjb8vvtqbcb6xd4p82sqmv2kypj foreign key (evento) references evento (id);

/* Unique Key Constraints */

/* Sequences for auto increment entity ids */