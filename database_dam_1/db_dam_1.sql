CREATE database if not exists `db_proyecto_dawii`;
use `db_proyecto_dawii`;

drop table if exists `tb_alumnos`;
create table `tb_alumnos`(
id int (8) not null primary key,
nombre varchar(50) not null,
estado char not null 
);


