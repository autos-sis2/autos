/*==============================================================*/
/* DBMS name:      Sybase SQL Anywhere 12                       */
/* Created on:     10/11/2016 04:27:21 p.m.                     */
/*==============================================================*/


if exists(select 1 from sys.sysforeignkey where role='FK_ASIGANDO_RELATIONS_EMPLEADO') then
    alter table ASIGANDO_AUTO
       delete foreign key FK_ASIGANDO_RELATIONS_EMPLEADO
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_ASIGANDO_RELATIONS_AUTO') then
    alter table ASIGANDO_AUTO
       delete foreign key FK_ASIGANDO_RELATIONS_AUTO
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_ASIGNADO_RELATIONS_ROL') then
    alter table ASIGNADO_FUNCION
       delete foreign key FK_ASIGNADO_RELATIONS_ROL
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_ASIGNADO_RELATIONS_FUNCION') then
    alter table ASIGNADO_FUNCION
       delete foreign key FK_ASIGNADO_RELATIONS_FUNCION
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_ASIGNADO_RELATIONS_USUARIO') then
    alter table ASIGNADO_ROL
       delete foreign key FK_ASIGNADO_RELATIONS_USUARIO
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_ASIGNADO_RELATIONS_ROL') then
    alter table ASIGNADO_ROL
       delete foreign key FK_ASIGNADO_RELATIONS_ROL
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_ASIGNADO_RELATIONS_EMPLEADO') then
    alter table ASIGNADO_USUARIO
       delete foreign key FK_ASIGNADO_RELATIONS_EMPLEADO
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_ASIGNADO_RELATIONS_USUARIO') then
    alter table ASIGNADO_USUARIO
       delete foreign key FK_ASIGNADO_RELATIONS_USUARIO
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_AUTO_RELATIONS_TIPO_AUT') then
    alter table AUTO
       delete foreign key FK_AUTO_RELATIONS_TIPO_AUT
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_AUTO_RELATIONS_MARCA') then
    alter table AUTO
       delete foreign key FK_AUTO_RELATIONS_MARCA
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_AUTO_RELATIONS_ESTADO_A') then
    alter table AUTO
       delete foreign key FK_AUTO_RELATIONS_ESTADO_A
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_COMPRAR_RELATIONS_CLIENTE') then
    alter table COMPRAR
       delete foreign key FK_COMPRAR_RELATIONS_CLIENTE
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_COMPRAR_RELATIONS_AUTO') then
    alter table COMPRAR
       delete foreign key FK_COMPRAR_RELATIONS_AUTO
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_FUNCION__RELATIONS_FUNCION') then
    alter table FUNCION_VISTA
       delete foreign key FK_FUNCION__RELATIONS_FUNCION
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_FUNCION__RELATIONS_VISTA') then
    alter table FUNCION_VISTA
       delete foreign key FK_FUNCION__RELATIONS_VISTA
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_PERTENEC_RELATIONS_REPUESTO') then
    alter table PERTENECE
       delete foreign key FK_PERTENEC_RELATIONS_REPUESTO
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_PERTENEC_RELATIONS_AUTO') then
    alter table PERTENECE
       delete foreign key FK_PERTENEC_RELATIONS_AUTO
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_REPUESTO_RELATIONS_TIPO_REP') then
    alter table REPUESTO_AUTOMOVIL
       delete foreign key FK_REPUESTO_RELATIONS_TIPO_REP
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_SESION_RELATIONS_USUARIO') then
    alter table SESION
       delete foreign key FK_SESION_RELATIONS_USUARIO
end if;

drop index if exists ASIGANDO_AUTO.RELATIONSHIP_6_FK;

drop index if exists ASIGANDO_AUTO.RELATIONSHIP_5_FK;

drop index if exists ASIGANDO_AUTO.ASIGANDO_AUTO_PK;

drop table if exists ASIGANDO_AUTO;

drop index if exists ASIGNADO_FUNCION.RELATIONSHIP_18_FK;

drop index if exists ASIGNADO_FUNCION.RELATIONSHIP_17_FK;

drop index if exists ASIGNADO_FUNCION.ASIGNADO_FUNCION_PK;

drop table if exists ASIGNADO_FUNCION;

drop index if exists ASIGNADO_ROL.RELATIONSHIP_16_FK;

drop index if exists ASIGNADO_ROL.RELATIONSHIP_15_FK;

drop index if exists ASIGNADO_ROL.ASIGNADO_ROL_PK;

drop table if exists ASIGNADO_ROL;

drop index if exists ASIGNADO_USUARIO.RELATIONSHIP_21_FK;

drop index if exists ASIGNADO_USUARIO.RELATIONSHIP_13_FK;

drop index if exists ASIGNADO_USUARIO.ASIGNADO_USUARIO_PK;

drop table if exists ASIGNADO_USUARIO;

drop index if exists AUTO.RELATIONSHIP_23_FK;

drop index if exists AUTO.RELATIONSHIP_9_FK;

drop index if exists AUTO.RELATIONSHIP_3_FK;

drop index if exists AUTO.AUTO_PK;

drop table if exists AUTO;

drop index if exists CLIENTE.CLIENTE_PK;

drop table if exists CLIENTE;

drop index if exists COMPRAR.RELATIONSHIP_8_FK;

drop index if exists COMPRAR.RELATIONSHIP_7_FK;

drop index if exists COMPRAR.COMPRAR_PK;

drop table if exists COMPRAR;

drop index if exists EMPLEADO.EMPLEADO_PK;

drop table if exists EMPLEADO;

drop index if exists ESTADO_AUTOMOVIL.ESTADO_AUTOMOVIL_PK;

drop table if exists ESTADO_AUTOMOVIL;

drop index if exists FUNCION.FUNCION_PK;

drop table if exists FUNCION;

drop index if exists FUNCION_VISTA.RELATIONSHIP_20_FK;

drop index if exists FUNCION_VISTA.RELATIONSHIP_19_FK;

drop index if exists FUNCION_VISTA.FUNCION_VISTA_PK;

drop table if exists FUNCION_VISTA;

drop index if exists MARCA.MARCA_PK;

drop table if exists MARCA;

drop index if exists PERTENECE.RELATIONSHIP_25_FK;

drop index if exists PERTENECE.RELATIONSHIP_24_FK;

drop index if exists PERTENECE.PERTENECE_PK;

drop table if exists PERTENECE;

drop index if exists REPUESTO_AUTOMOVIL.RELATIONSHIP_22_FK;

drop index if exists REPUESTO_AUTOMOVIL.REPUESTO_AUTOMOVIL_PK;

drop table if exists REPUESTO_AUTOMOVIL;

drop index if exists ROL.ROL_PK;

drop table if exists ROL;

drop index if exists SESION.RELATIONSHIP_12_FK;

drop index if exists SESION.SESION_PK;

drop table if exists SESION;

drop index if exists TIPO_AUTO.TIPO_AUTO_PK;

drop table if exists TIPO_AUTO;

drop index if exists TIPO_REPUESTOAUTO.TIPO_REPUESTOAUTO_PK;

drop table if exists TIPO_REPUESTOAUTO;

drop index if exists USUARIO.USUARIO_PK;

drop table if exists USUARIO;

drop index if exists VISTA.VISTA_PK;

drop table if exists VISTA;

/*==============================================================*/
/* Table: ASIGANDO_AUTO                                         */
/*==============================================================*/
create table ASIGANDO_AUTO 
(
   ID_EMP               integer                        not null,
   ID_AUTO              smallint                       not null,
   FECHA                date                           not null,
   constraint PK_ASIGANDO_AUTO primary key (ID_EMP, ID_AUTO, FECHA)
);

/*==============================================================*/
/* Index: ASIGANDO_AUTO_PK                                      */
/*==============================================================*/
create unique index ASIGANDO_AUTO_PK on ASIGANDO_AUTO (
ID_EMP ASC,
ID_AUTO ASC,
FECHA ASC
);

/*==============================================================*/
/* Index: RELATIONSHIP_5_FK                                     */
/*==============================================================*/
create index RELATIONSHIP_5_FK on ASIGANDO_AUTO (
ID_EMP ASC
);

/*==============================================================*/
/* Index: RELATIONSHIP_6_FK                                     */
/*==============================================================*/
create index RELATIONSHIP_6_FK on ASIGANDO_AUTO (
ID_AUTO ASC
);

/*==============================================================*/
/* Table: ASIGNADO_FUNCION                                      */
/*==============================================================*/
create table ASIGNADO_FUNCION 
(
   ID_ROL               smallint                       not null,
   ID_FUNCION           smallint                       not null,
   constraint PK_ASIGNADO_FUNCION primary key clustered (ID_ROL, ID_FUNCION)
);

/*==============================================================*/
/* Index: ASIGNADO_FUNCION_PK                                   */
/*==============================================================*/
create unique clustered index ASIGNADO_FUNCION_PK on ASIGNADO_FUNCION (
ID_ROL ASC,
ID_FUNCION ASC
);

/*==============================================================*/
/* Index: RELATIONSHIP_17_FK                                    */
/*==============================================================*/
create index RELATIONSHIP_17_FK on ASIGNADO_FUNCION (
ID_ROL ASC
);

/*==============================================================*/
/* Index: RELATIONSHIP_18_FK                                    */
/*==============================================================*/
create index RELATIONSHIP_18_FK on ASIGNADO_FUNCION (
ID_FUNCION ASC
);

/*==============================================================*/
/* Table: ASIGNADO_ROL                                          */
/*==============================================================*/
create table ASIGNADO_ROL 
(
   ID_USUARIO           integer                        not null,
   ID_ROL               smallint                       not null,
   constraint PK_ASIGNADO_ROL primary key clustered (ID_USUARIO, ID_ROL)
);

/*==============================================================*/
/* Index: ASIGNADO_ROL_PK                                       */
/*==============================================================*/
create unique clustered index ASIGNADO_ROL_PK on ASIGNADO_ROL (
ID_USUARIO ASC,
ID_ROL ASC
);

/*==============================================================*/
/* Index: RELATIONSHIP_15_FK                                    */
/*==============================================================*/
create index RELATIONSHIP_15_FK on ASIGNADO_ROL (
ID_USUARIO ASC
);

/*==============================================================*/
/* Index: RELATIONSHIP_16_FK                                    */
/*==============================================================*/
create index RELATIONSHIP_16_FK on ASIGNADO_ROL (
ID_ROL ASC
);

/*==============================================================*/
/* Table: ASIGNADO_USUARIO                                      */
/*==============================================================*/
create table ASIGNADO_USUARIO 
(
   ID_EMP               integer                        not null,
   ID_USUARIO           integer                        not null,
   constraint PK_ASIGNADO_USUARIO primary key clustered (ID_EMP, ID_USUARIO)
);

/*==============================================================*/
/* Index: ASIGNADO_USUARIO_PK                                   */
/*==============================================================*/
create unique clustered index ASIGNADO_USUARIO_PK on ASIGNADO_USUARIO (
ID_EMP ASC,
ID_USUARIO ASC
);

/*==============================================================*/
/* Index: RELATIONSHIP_13_FK                                    */
/*==============================================================*/
create index RELATIONSHIP_13_FK on ASIGNADO_USUARIO (
ID_EMP ASC
);

/*==============================================================*/
/* Index: RELATIONSHIP_21_FK                                    */
/*==============================================================*/
create index RELATIONSHIP_21_FK on ASIGNADO_USUARIO (
ID_USUARIO ASC
);

/*==============================================================*/
/* Table: AUTO                                                  */
/*==============================================================*/
create table AUTO 
(
   ID_AUTO              smallint                       not null,
   ID_MARCA             smallint                       not null,
   ID_ESTADO            integer                        not null,
   ID_TIPOAUTO          smallint                       not null,
   MATRICULA            varchar(15)                    not null,
   COLOR                varchar(15)                    not null,
   PRECIO               varchar(10)                    not null,
   MODELO               varchar(16)                    null,
   ANO                  varchar(4)                     null,
   IMAGEN               varchar(100)                   null,
   constraint PK_AUTO primary key (ID_AUTO)
);

/*==============================================================*/
/* Index: AUTO_PK                                               */
/*==============================================================*/
create unique index AUTO_PK on AUTO (
ID_AUTO ASC
);

/*==============================================================*/
/* Index: RELATIONSHIP_3_FK                                     */
/*==============================================================*/
create index RELATIONSHIP_3_FK on AUTO (
ID_MARCA ASC
);

/*==============================================================*/
/* Index: RELATIONSHIP_9_FK                                     */
/*==============================================================*/
create index RELATIONSHIP_9_FK on AUTO (
ID_ESTADO ASC
);

/*==============================================================*/
/* Index: RELATIONSHIP_23_FK                                    */
/*==============================================================*/
create index RELATIONSHIP_23_FK on AUTO (
ID_TIPOAUTO ASC
);

/*==============================================================*/
/* Table: CLIENTE                                               */
/*==============================================================*/
create table CLIENTE 
(
   ID_CLIENTE           char(10)                       not null,
   constraint PK_CLIENTE primary key (ID_CLIENTE)
);

/*==============================================================*/
/* Index: CLIENTE_PK                                            */
/*==============================================================*/
create unique index CLIENTE_PK on CLIENTE (
ID_CLIENTE ASC
);

/*==============================================================*/
/* Table: COMPRAR                                               */
/*==============================================================*/
create table COMPRAR 
(
   ID_CLIENTE           char(10)                       not null,
   ID_AUTO              smallint                       not null,
   FECHA_COMPRAA        date                           not null,
   constraint PK_COMPRAR primary key clustered (ID_CLIENTE, ID_AUTO)
);

/*==============================================================*/
/* Index: COMPRAR_PK                                            */
/*==============================================================*/
create unique clustered index COMPRAR_PK on COMPRAR (
ID_CLIENTE ASC,
ID_AUTO ASC
);

/*==============================================================*/
/* Index: RELATIONSHIP_7_FK                                     */
/*==============================================================*/
create index RELATIONSHIP_7_FK on COMPRAR (
ID_CLIENTE ASC
);

/*==============================================================*/
/* Index: RELATIONSHIP_8_FK                                     */
/*==============================================================*/
create index RELATIONSHIP_8_FK on COMPRAR (
ID_AUTO ASC
);

/*==============================================================*/
/* Table: EMPLEADO                                              */
/*==============================================================*/
create table EMPLEADO 
(
   ID_EMP               integer                        not null,
   NOMBRE               varchar(25)                    not null,
   APELLIDOS            varchar(50)                    not null,
   SEXO                 char(1)                        not null,
   CORREO               varchar(30)                    not null,
   CI                   varchar(10)                    not null,
   constraint PK_EMPLEADO primary key (ID_EMP)
);

/*==============================================================*/
/* Index: EMPLEADO_PK                                           */
/*==============================================================*/
create unique index EMPLEADO_PK on EMPLEADO (
ID_EMP ASC
);

/*==============================================================*/
/* Table: ESTADO_AUTOMOVIL                                      */
/*==============================================================*/
create table ESTADO_AUTOMOVIL 
(
   ID_ESTADO            integer                        not null,
   NOMBRE_ESTADO        varchar(20)                    not null,
   constraint PK_ESTADO_AUTOMOVIL primary key (ID_ESTADO)
);

/*==============================================================*/
/* Index: ESTADO_AUTOMOVIL_PK                                   */
/*==============================================================*/
create unique index ESTADO_AUTOMOVIL_PK on ESTADO_AUTOMOVIL (
ID_ESTADO ASC
);

/*==============================================================*/
/* Table: FUNCION                                               */
/*==============================================================*/
create table FUNCION 
(
   ID_FUNCION           smallint                       not null,
   constraint PK_FUNCION primary key (ID_FUNCION)
);

/*==============================================================*/
/* Index: FUNCION_PK                                            */
/*==============================================================*/
create unique index FUNCION_PK on FUNCION (
ID_FUNCION ASC
);

/*==============================================================*/
/* Table: FUNCION_VISTA                                         */
/*==============================================================*/
create table FUNCION_VISTA 
(
   ID_FUNCION           smallint                       not null,
   ID_VISTA             smallint                       not null,
   constraint PK_FUNCION_VISTA primary key clustered (ID_FUNCION, ID_VISTA)
);

/*==============================================================*/
/* Index: FUNCION_VISTA_PK                                      */
/*==============================================================*/
create unique clustered index FUNCION_VISTA_PK on FUNCION_VISTA (
ID_FUNCION ASC,
ID_VISTA ASC
);

/*==============================================================*/
/* Index: RELATIONSHIP_19_FK                                    */
/*==============================================================*/
create index RELATIONSHIP_19_FK on FUNCION_VISTA (
ID_FUNCION ASC
);

/*==============================================================*/
/* Index: RELATIONSHIP_20_FK                                    */
/*==============================================================*/
create index RELATIONSHIP_20_FK on FUNCION_VISTA (
ID_VISTA ASC
);

/*==============================================================*/
/* Table: MARCA                                                 */
/*==============================================================*/
create table MARCA 
(
   ID_MARCA             smallint                       not null,
   NOMBRE_MARCA         varchar(15)                    not null,
   constraint PK_MARCA primary key (ID_MARCA)
);

/*==============================================================*/
/* Index: MARCA_PK                                              */
/*==============================================================*/
create unique index MARCA_PK on MARCA (
ID_MARCA ASC
);

/*==============================================================*/
/* Table: PERTENECE                                             */
/*==============================================================*/
create table PERTENECE 
(
   ID_REPAUTO           integer                        not null,
   ID_AUTO              smallint                       not null,
   constraint PK_PERTENECE primary key clustered (ID_REPAUTO, ID_AUTO)
);

/*==============================================================*/
/* Index: PERTENECE_PK                                          */
/*==============================================================*/
create unique clustered index PERTENECE_PK on PERTENECE (
ID_REPAUTO ASC,
ID_AUTO ASC
);

/*==============================================================*/
/* Index: RELATIONSHIP_24_FK                                    */
/*==============================================================*/
create index RELATIONSHIP_24_FK on PERTENECE (
ID_REPAUTO ASC
);

/*==============================================================*/
/* Index: RELATIONSHIP_25_FK                                    */
/*==============================================================*/
create index RELATIONSHIP_25_FK on PERTENECE (
ID_AUTO ASC
);

/*==============================================================*/
/* Table: REPUESTO_AUTOMOVIL                                    */
/*==============================================================*/
create table REPUESTO_AUTOMOVIL 
(
   ID_REPAUTO           integer                        not null,
   ID_TIPOREPUESTO      integer                        not null,
   NOMBRE_REP           varchar(50)                    not null,
   MODELO               varchar(16)                    not null,
   PRECIO               varchar(10)                    not null,
   constraint PK_REPUESTO_AUTOMOVIL primary key (ID_REPAUTO)
);

/*==============================================================*/
/* Index: REPUESTO_AUTOMOVIL_PK                                 */
/*==============================================================*/
create unique index REPUESTO_AUTOMOVIL_PK on REPUESTO_AUTOMOVIL (
ID_REPAUTO ASC
);

/*==============================================================*/
/* Index: RELATIONSHIP_22_FK                                    */
/*==============================================================*/
create index RELATIONSHIP_22_FK on REPUESTO_AUTOMOVIL (
ID_TIPOREPUESTO ASC
);

/*==============================================================*/
/* Table: ROL                                                   */
/*==============================================================*/
create table ROL 
(
   ID_ROL               smallint                       not null,
   NOMBRE_ROL           varchar(30)                    not null,
   constraint PK_ROL primary key (ID_ROL)
);

/*==============================================================*/
/* Index: ROL_PK                                                */
/*==============================================================*/
create unique index ROL_PK on ROL (
ID_ROL ASC
);

/*==============================================================*/
/* Table: SESION                                                */
/*==============================================================*/
create table SESION 
(
   ID_SESION            integer                        not null,
   ID_USUARIO           integer                        not null,
   FECHA_SESION         date                           not null,
   ACTIVO               smallint                       null,
   PID                  integer                        not null,
   HORA                 time                           null,
   constraint PK_SESION primary key (ID_SESION)
);

/*==============================================================*/
/* Index: SESION_PK                                             */
/*==============================================================*/
create unique index SESION_PK on SESION (
ID_SESION ASC
);

/*==============================================================*/
/* Index: RELATIONSHIP_12_FK                                    */
/*==============================================================*/
create index RELATIONSHIP_12_FK on SESION (
ID_USUARIO ASC
);

/*==============================================================*/
/* Table: TIPO_AUTO                                             */
/*==============================================================*/
create table TIPO_AUTO 
(
   ID_TIPOAUTO          smallint                       not null,
   NOMBRE_TIPO          varchar(30)                    not null,
   constraint PK_TIPO_AUTO primary key (ID_TIPOAUTO)
);

/*==============================================================*/
/* Index: TIPO_AUTO_PK                                          */
/*==============================================================*/
create unique index TIPO_AUTO_PK on TIPO_AUTO (
ID_TIPOAUTO ASC
);

/*==============================================================*/
/* Table: TIPO_REPUESTOAUTO                                     */
/*==============================================================*/
create table TIPO_REPUESTOAUTO 
(
   ID_TIPOREPUESTO      integer                        not null,
   NOMBRE_REPUESTO      char(10)                       not null,
   constraint PK_TIPO_REPUESTOAUTO primary key (ID_TIPOREPUESTO)
);

/*==============================================================*/
/* Index: TIPO_REPUESTOAUTO_PK                                  */
/*==============================================================*/
create unique index TIPO_REPUESTOAUTO_PK on TIPO_REPUESTOAUTO (
ID_TIPOREPUESTO ASC
);

/*==============================================================*/
/* Table: USUARIO                                               */
/*==============================================================*/
create table USUARIO 
(
   ID_USUARIO           integer                        not null,
   LOGIN_               varchar(25)                    not null,
   PASSWORD             char(10)                       null,
   constraint PK_USUARIO primary key (ID_USUARIO)
);

/*==============================================================*/
/* Index: USUARIO_PK                                            */
/*==============================================================*/
create unique index USUARIO_PK on USUARIO (
ID_USUARIO ASC
);

/*==============================================================*/
/* Table: VISTA                                                 */
/*==============================================================*/
create table VISTA 
(
   ID_VISTA             smallint                       not null,
   constraint PK_VISTA primary key (ID_VISTA)
);

/*==============================================================*/
/* Index: VISTA_PK                                              */
/*==============================================================*/
create unique index VISTA_PK on VISTA (
ID_VISTA ASC
);

alter table ASIGANDO_AUTO
   add constraint FK_ASIGANDO_RELATIONS_EMPLEADO foreign key (ID_EMP)
      references EMPLEADO (ID_EMP)
      on update restrict
      on delete restrict;

alter table ASIGANDO_AUTO
   add constraint FK_ASIGANDO_RELATIONS_AUTO foreign key (ID_AUTO)
      references AUTO (ID_AUTO)
      on update restrict
      on delete restrict;

alter table ASIGNADO_FUNCION
   add constraint FK_ASIGNADO_RELATIONS_ROL foreign key (ID_ROL)
      references ROL (ID_ROL)
      on update restrict
      on delete restrict;

alter table ASIGNADO_FUNCION
   add constraint FK_ASIGNADO_RELATIONS_FUNCION foreign key (ID_FUNCION)
      references FUNCION (ID_FUNCION)
      on update restrict
      on delete restrict;

alter table ASIGNADO_ROL
   add constraint FK_ASIGNADO_RELATIONS_USUARIO foreign key (ID_USUARIO)
      references USUARIO (ID_USUARIO)
      on update restrict
      on delete restrict;

alter table ASIGNADO_ROL
   add constraint FK_ASIGNADO_RELATIONS_ROL foreign key (ID_ROL)
      references ROL (ID_ROL)
      on update restrict
      on delete restrict;

alter table ASIGNADO_USUARIO
   add constraint FK_ASIGNADO_RELATIONS_EMPLEADO foreign key (ID_EMP)
      references EMPLEADO (ID_EMP)
      on update restrict
      on delete restrict;

alter table ASIGNADO_USUARIO
   add constraint FK_ASIGNADO_RELATIONS_USUARIO foreign key (ID_USUARIO)
      references USUARIO (ID_USUARIO)
      on update restrict
      on delete restrict;

alter table AUTO
   add constraint FK_AUTO_RELATIONS_TIPO_AUT foreign key (ID_TIPOAUTO)
      references TIPO_AUTO (ID_TIPOAUTO)
      on update restrict
      on delete restrict;

alter table AUTO
   add constraint FK_AUTO_RELATIONS_MARCA foreign key (ID_MARCA)
      references MARCA (ID_MARCA)
      on update restrict
      on delete restrict;

alter table AUTO
   add constraint FK_AUTO_RELATIONS_ESTADO_A foreign key (ID_ESTADO)
      references ESTADO_AUTOMOVIL (ID_ESTADO)
      on update restrict
      on delete restrict;

alter table COMPRAR
   add constraint FK_COMPRAR_RELATIONS_CLIENTE foreign key (ID_CLIENTE)
      references CLIENTE (ID_CLIENTE)
      on update restrict
      on delete restrict;

alter table COMPRAR
   add constraint FK_COMPRAR_RELATIONS_AUTO foreign key (ID_AUTO)
      references AUTO (ID_AUTO)
      on update restrict
      on delete restrict;

alter table FUNCION_VISTA
   add constraint FK_FUNCION__RELATIONS_FUNCION foreign key (ID_FUNCION)
      references FUNCION (ID_FUNCION)
      on update restrict
      on delete restrict;

alter table FUNCION_VISTA
   add constraint FK_FUNCION__RELATIONS_VISTA foreign key (ID_VISTA)
      references VISTA (ID_VISTA)
      on update restrict
      on delete restrict;

alter table PERTENECE
   add constraint FK_PERTENEC_RELATIONS_REPUESTO foreign key (ID_REPAUTO)
      references REPUESTO_AUTOMOVIL (ID_REPAUTO)
      on update restrict
      on delete restrict;

alter table PERTENECE
   add constraint FK_PERTENEC_RELATIONS_AUTO foreign key (ID_AUTO)
      references AUTO (ID_AUTO)
      on update restrict
      on delete restrict;

alter table REPUESTO_AUTOMOVIL
   add constraint FK_REPUESTO_RELATIONS_TIPO_REP foreign key (ID_TIPOREPUESTO)
      references TIPO_REPUESTOAUTO (ID_TIPOREPUESTO)
      on update restrict
      on delete restrict;

alter table SESION
   add constraint FK_SESION_RELATIONS_USUARIO foreign key (ID_USUARIO)
      references USUARIO (ID_USUARIO)
      on update restrict
      on delete restrict;

