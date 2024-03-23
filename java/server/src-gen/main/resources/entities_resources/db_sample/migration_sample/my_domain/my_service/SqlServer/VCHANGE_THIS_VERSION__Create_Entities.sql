/* Database: SqlServer. Generation date: 2024-03-22 17:22:35:348 */
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

/* Join Tables */

/* Primary Key Constraints */
alter table convidado add constraint pk_convidado_id primary key(id);

/* Foreign Key Constraints */

/* Unique Key Constraints */

/* Sequences for auto increment entity ids */
