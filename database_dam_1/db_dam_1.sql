USE master ;
GO
CREATE DATABASE PROYECTO

CREATE TABLE PROYECTO_usuario(
usuario_cod INT(8),
usuario_tipo varchar(10),
usuario_nivel bit);

CREATE TABLE PROYECTO_curso(
curso_codigo  INT(8) NOT NULL PRIMARY KEY,
curso_nombre   VARCHAR(50) NOT NULL);

CREATE TABLE PROYECTO_alumno(
alumno_cod          int(8) NOT NULL PRIMARY KEY,
alumno_nombre       VARCHAR(100) NOT NULL,
alumno_edad         INT(2) NOT NULL,
codigo_curso        INT NOT NULL,
alumno_estado       bit);

CREATE TABLE PROYECTO_profesor(
profesor_cod        VARCHAR(10) NOT NULL PRIMARY KEY,
profesor_nombre     VARCHAR(100) NOT NULL);


CREATE TABLE PROYECTO_asignatura(
asignatura_codigo   INT NOT NULL PRIMARY KEY,
asignatura_nombre   VARCHAR(100) NOT NULL);

CREATE TABLE PROYECTO_reporte(
Filtro_grupo        char(8),
filtro_fecha        datetime,
filtro_dispositivo  char(8),
filtro_sede         varchar(8),
filtro_codigo       int(8));

CREATE TABLE PROYECTO_sede(
sede_cod            int(8),
sede_nom            varchar(4));

CREATE TABLE PROYECTO_dispositivo(
dispositos_cod      int(8),
dispositivo_nom     varchar(20)
dispositos_tipo     varchar(20)
dispositivo_alias   varchar(20));

CREATE TABLE PROYECTO_profesor_curso(
rut_profesor VARCHAR(10) NOT NULL,
codigo_curso INT NOT NULL,
FOREIGN KEY(rut_profesor) REFERENCES colegio_profesor(profesor_rut),
FOREIGN KEY(codigo_curso) REFERENCES colegio_curso(curso_codigo));

CREATE TABLE colegio_alumno_asignatura(
rut_alumno VARCHAR(10) NOT NULL,
codigo_asignatura INT NOT NULL,
FOREIGN KEY(rut_alumno) REFERENCES colegio_alumno(alumno_rut),
FOREIGN KEY(codigo_asignatura) REFERENCES colegio_asignatura(asignatura_codigo));

CREATE TABLE colegio_profesor_asignatura(
rut_profesor VARCHAR(10) NOT NULL,
codigo_asignatura INT NOT NULL,
FOREIGN KEY(rut_profesor) REFERENCES colegio_profesor(profesor_rut),
FOREIGN KEY(codigo_asignatura) REFERENCES colegio_asignatura(asignatura_codigo));
