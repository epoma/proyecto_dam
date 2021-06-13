DROP DATABASE `db_dam_1`;
CREATE database `db_dam_1`;
use `db_dam_1`;
-------------------------------------------------------------------------------------------------------------
/*CREATE TABLAS*/

drop table if exists `tb_carrera`;
create table `tb_carrera`(
COD_CAR int (8) not null auto_increment primary key,
DES_CAR varchar(250) not null,
EST_REG varchar(25) not null
);

drop table if exists `tb_clase`;
create table `tb_clase`(
COD_CLA int(8) not null auto_increment primary key,
COD_SEC int(8)  not null,
EST_REG varchar(25) not null
);

drop table if exists `tb_seccion`;
create table `tb_seccion`(
COD_SEC int(8)  not null auto_increment primary key,
DES_SEC char(4) not null,
DES_CURS varchar(50) not null,
COD_PRO int(8) not null,
COD_HOR int(8) not null,
LFAL_SEC int(2) not null,
LCLA_SEC int(2) not null,
EST_REG varchar(25) not null
);

drop table if exists `tb_horario`;
create table `tb_horario`(
COD_HOR int(8) not null auto_increment primary key,
DES_HOR datetime not null
);

drop table if exists `tb_rol`;
create table `tb_rol`(
COD_ROL int (8) not null auto_increment primary key,
DES_ROL varchar(250) not null
);

drop table if exists `tb_administrador`;
create table `tb_administrador`(
COD_ADMIN int (8) not null auto_increment primary key,
NOM_ADMIN varchar(150) not null,
APE_ADMIN varchar(150) not null,
USU_ADMIN char(10) not null,
PASS_ADMIN char(16) not null,
COD_ROL int (8)  not null,
EST_REG varchar(25) not null
);

drop table if exists `tb_profesor`;
create table `tb_profesor`(
COD_PRO int (8) not null auto_increment primary key,
NOM_PRO varchar(150) not null,
APE_PRO varchar(150) not null,
USU_PRO char(10) not null,
PASS_PRO char(16) not null,
EDAD_PRO int not null,
CEL_PRO char(9) not null,
DIR_PRO varchar(250) not null,
COD_ROL int (8)  not null,
EST_REG varchar(25) not null
);

drop table if exists `tb_alumno`;
create table `tb_alumno`(
COD_ALU int (8) not null auto_increment primary key,
NOM_ALU varchar(150) not null,
APE_ALU varchar(150) not null,
USU_ALU char(10) not null,
PASS_ALU char(16) not null,
COD_CAR int(8) not null,
EDAD_ALU int not null,
CEL_ALU char(9) not null,
DIR_ALU varchar(250) not null,
COD_ROL int (8)  not null,
EST_REG varchar(25) not null
);

drop table if exists `tb_det_sec_alu`;
create table `tb_det_sec_alu`(
COD_SEC int(8) not null,
COD_ALU int(8) not null,
primary key (COD_SEC,COD_ALU)
);


drop table if exists `tb_asistencia`;
create table `tb_asistencia`(
COD_ASI int (8) not null auto_increment primary key,
COD_ALU int(8) not null,
COD_CLA int(8) not null,
EST_REG varchar(25) not null
);


-------------------------------------------------------------------------------------------------------------
/*-- ALTER CONSTRAINT --*/
ALTER TABLE tb_carrera
	ADD CONSTRAINT CHK_EST_REG_CAR CHECK (EST_REG IN ('A','I'));

ALTER TABLE tb_alumno
	ADD	CONSTRAINT FK_ALU_COD_CAR_ID FOREIGN KEY (COD_CAR) REFERENCES tb_carrera (COD_CAR),
	ADD	CONSTRAINT FK_ALU_COD_ROL_ID FOREIGN KEY (COD_ROL) REFERENCES tb_rol (COD_ROL),
	ADD CONSTRAINT CHK_PASS_ALU CHECK (char_length(PASS_ALU) > 2 and char_length(PASS_ALU) < 16),
	ADD CONSTRAINT CHK_EST_REG_ALU CHECK (EST_REG IN ('ACTIVO', 'RETIRADO', 'SUSPENDIDO', 'INACTIVO')),
	ADD CONSTRAINT UNQ_USU_ALU UNIQUE (USU_ALU),
	ALTER CEL_ALU SET DEFAULT 'NO';    
    
ALTER TABLE tb_profesor 
	ADD CONSTRAINT CHK_PASS_PRO CHECK (char_length(PASS_PRO) > 2 and char_length(PASS_PRO) < 16),
	ADD	CONSTRAINT FK_PRO_COD_ROL_ID FOREIGN KEY (COD_ROL) REFERENCES tb_rol (COD_ROL),
	ADD CONSTRAINT CHK_EST_REG_PRO CHECK (EST_REG IN ('ACTIVO', 'RETIRADO', 'SUSPENDIDO')),
	ADD CONSTRAINT UNQ_USU_PRO UNIQUE (USU_PRO),
	ALTER CEL_PRO SET DEFAULT 'NO';
	 
ALTER TABLE tb_seccion
	ADD	CONSTRAINT FK_SEC_COD_PRO_ID FOREIGN KEY (COD_PRO) REFERENCES tb_profesor (COD_PRO),
    ADD	CONSTRAINT FK_SEC_COD_HOR_ID FOREIGN KEY (COD_HOR) REFERENCES tb_horario (COD_HOR),
	ADD CONSTRAINT CHK_LFAL_SEC CHECK (char_length(LFAL_SEC) < 4),
	ADD CONSTRAINT CHK_LCLA_SEC CHECK (char_length(LCLA_SEC) < 15),
	ADD CONSTRAINT CHK_EST_REG_SEC CHECK (EST_REG IN ('ACTIVO','INACTIVO')),
	ALTER NOTA_1 SET DEFAULT 0,
	ALTER NOTA_2 SET DEFAULT 0;
   
ALTER TABLE tb_clase
	ADD	CONSTRAINT FK_CLA_COD_SEC_ID FOREIGN KEY (COD_SEC) REFERENCES tb_seccion (COD_SEC),
	ADD CONSTRAINT CHK_EST_REG_CLA CHECK (EST_REG IN ('ACTIVO', 'INACTIVO'));
    
ALTER TABLE tb_asistencia
	ADD	CONSTRAINT FK_ASI_COD_ALU_ID FOREIGN KEY (COD_ALU) REFERENCES tb_alumno (COD_ALU),
    ADD	CONSTRAINT FK_ASI_COD_CLA_ID FOREIGN KEY (COD_CLA) REFERENCES tb_clase (COD_CLA),
	ADD CONSTRAINT CHK_EST_REG_CLA CHECK (EST_REG IN ('ASISTIDO', 'INASISTIDO'));
    
ALTER TABLE tb_administrador 
	ADD	CONSTRAINT FK_ADMIN_COD_ROL_ID FOREIGN KEY (COD_ROL) REFERENCES tb_rol (COD_ROL),
	ADD CONSTRAINT CHK_PASS_ADMIN CHECK (char_length(PASS_ADMIN) > 2 and char_length(PASS_ADMIN) < 16),
	ADD CONSTRAINT CHK_EST_REG_ADMIN CHECK (EST_REG IN ('ACTIVO', 'INACTIVO')),
	ADD CONSTRAINT UNQ_USU_ADMIN UNIQUE (USU_ADMIN);
	 
ALTER TABLE tb_geolocalizacion
	ADD	CONSTRAINT FK_GEO_COD_ALU_ID FOREIGN KEY (COD_ALU) REFERENCES tb_alumno (COD_ALU);
    
ALTER TABLE tb_det_sec_alu
	ADD	CONSTRAINT FK_DET_SEC_ALU_COD_SEC_ID FOREIGN KEY (COD_SEC) REFERENCES tb_seccion (COD_SEC),
    ADD	CONSTRAINT FK_DET_SEC_ALU_COD_ALU_ID FOREIGN KEY (COD_ALU) REFERENCES tb_alumno (COD_ALU);   

/*ROL_USU 			
1 = Administrador 
2 = Docente
3 = Estudiante
*/

/* EST_REG
A = ACTIVO 
I = INACTIVO 
R = RETIRADO 
S = SUSPENDIDO  

tb_asistencia
EST_REG
A = ASISTIDO 
I = INASISTIDO 
*/

/*---------------------------------------------------------------------------------------------------------------*/
    
/*INSERT*/
insert into tb_rol values (1,'Administrador');
insert into tb_rol values (2,'Docente');
insert into tb_rol values (3,'Alumno');

INSERT INTO `db_dam_1`.`tb_carrera` (`COD_CAR`, `DES_CAR`, `EST_REG`) VALUES ('1', 'Computacion e Informatica', 'ACTIVO');
INSERT INTO `db_dam_1`.`tb_carrera` (`COD_CAR`, `DES_CAR`, `EST_REG`) VALUES ('2', 'Administracion de Empresas', 'ACTIVO');

INSERT INTO `db_dam_1`.`tb_administrador` (`COD_ADMIN`, `NOM_ADMIN`, `APE_ADMIN`, `USU_ADMIN`, `PASS_ADMIN`, `COD_ROL`, `EST_REG`) VALUES ('1', 'Manuel', 'Perez', 'mperez', '123', '1', 'ACTIVO');
INSERT INTO `db_dam_1`.`tb_administrador` (`COD_ADMIN`, `NOM_ADMIN`, `APE_ADMIN`, `USU_ADMIN`, `PASS_ADMIN`, `COD_ROL`, `EST_REG`) VALUES ('2', 'Juan', 'Balazar', 'jbalazar', '123', '1', 'ACTIVO');

INSERT INTO `db_dam_1`.`tb_alumno` (`COD_ALU`, `NOM_ALU`, `APE_ALU`, `USU_ALU`, `PASS_ALU`, `COD_CAR`, `EDAD_ALU`, `CEL_ALU`, `DIR_ALU`, `COD_ROL`, `EST_REG`) VALUES ('1', 'Juan', 'Perez', 'jperez', '123', '1', '20', '978457102', 'Av. 28 de Julio', '3', 'ACTIVO');
INSERT INTO `db_dam_1`.`tb_alumno` (`COD_ALU`, `NOM_ALU`, `APE_ALU`, `USU_ALU`, `PASS_ALU`, `COD_CAR`, `EDAD_ALU`, `CEL_ALU`, `DIR_ALU`, `COD_ROL`, `EST_REG`) VALUES ('2', 'Erick', 'Sanchez', 'esanchez', '123', '2', '24', '994102478', 'Av.Aviacion', '3', 'ACTIVO');

INSERT INTO `db_dam_1`.`tb_profesor` (`COD_PRO`, `NOM_PRO`, `APE_PRO`, `USU_PRO`, `PASS_PRO`, `EDAD_PRO`, `CEL_PRO`, `DIR_PRO`, `COD_ROL`, `EST_REG`) VALUES ('1', 'Carlos', 'Sotil', 'csolit', '123', '38', '945784578', 'Av. La Paz', '2', 'ACTIVO');
INSERT INTO `db_dam_1`.`tb_profesor` (`COD_PRO`, `NOM_PRO`, `APE_PRO`, `USU_PRO`, `PASS_PRO`, `EDAD_PRO`, `CEL_PRO`, `DIR_PRO`, `COD_ROL`, `EST_REG`) VALUES ('2', 'Cristian', 'Valdez', 'cvaldez', '123', '42', '999741247', 'Av. Brasil', '2', 'ACTIVO');

INSERT INTO `db_dam_1`.`tb_horario` (`COD_HOR`, `DES_HOR`) VALUES ('1', '2021-03-11 13:05');
INSERT INTO `db_dam_1`.`tb_horario` (`COD_HOR`, `DES_HOR`) VALUES ('2', '2021-03-11 15:05');
INSERT INTO `db_dam_1`.`tb_horario` (`COD_HOR`, `DES_HOR`) VALUES ('3', '2021-03-11 18:05');

INSERT INTO `db_dam_1`.`tb_seccion` (`COD_SEC`,`DES_SEC`, `DES_CURS`, `NOTA_1`, `NOTA_2`, `COD_PRO`, `COD_HOR`, `LFAL_SEC`, `LCLA_SEC`, `EST_REG`) VALUES (1,'T4BB', 'Lenguaje de Programacion', '16', '18', '1', '1', '3', '14', 'ACTIVO');
INSERT INTO `db_dam_1`.`tb_seccion` (`COD_SEC`,`DES_SEC`, `DES_CURS`, `NOTA_1`, `NOTA_2`, `COD_PRO`, `COD_HOR`, `LFAL_SEC`, `LCLA_SEC`, `EST_REG`) VALUES (2,'T4DB', 'Gestion de proyecto', '15', '19', '1', '2', '3', '7', 'ACTIVO');
