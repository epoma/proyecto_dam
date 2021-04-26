CREATE database if not exists `db_proyecto_dawii`;
use `db_proyecto_dawii`;

drop table if exists `tb_alumnos`;
create table `tb_alumnos`(
id int (8) not null primary key,
nombre varchar(50) not null,
estado char not null
);

drop table if exists `tb_profesores`;
create table `tb_profesores`(
id int (8) not null primary key,
nombre varchar(50) not null,
estado char not null
);


drop table if exists `tb_administrador`;
create table `tb_administrador`(
id int (8) not null primary key,
nombre varchar(50) not null,
estado char not null
);


drop table if exists `tb_hernan`;
create table `tb_hernan`(
id int (8) not null primary key,
nombre varchar(50) not null,
estado char not null
);