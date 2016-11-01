/*==============================================================*/
/* DBMS name:      Sybase SQL Anywhere 12                       */
/* Created on:     01/11/2016 04:15:08 p.m.                     */
/*==============================================================*/


if exists(select 1 from sys.sysforeignkey where role='FK_ASIGANDO_RELATIONS_EMPLEADO') then
    alter table ASIGANDO_AUTOMOVIL
       delete foreign key FK_ASIGANDO_RELATIONS_EMPLEADO
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_ASIGANDO_RELATIONS_AUTOMOVI') then
    alter table ASIGANDO_AUTOMOVIL
       delete foreign key FK_ASIGANDO_RELATIONS_AUTOMOVI
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_ASIGNA_R_RELATIONS_USUARIO') then
    alter table ASIGNA_ROL
       delete foreign key FK_ASIGNA_R_RELATIONS_USUARIO
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_ASIGNA_R_RELATIONS_ROL') then
    alter table ASIGNA_ROL
       delete foreign key FK_ASIGNA_R_RELATIONS_ROL
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_ASIGNA_U_RELATIONS_EMPLEADO') then
    alter table ASIGNA_USUARIO
       delete foreign key FK_ASIGNA_U_RELATIONS_EMPLEADO
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_ASIGNA_U_RELATIONS_USUARIO') then
    alter table ASIGNA_USUARIO
       delete foreign key FK_ASIGNA_U_RELATIONS_USUARIO
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_AUTOMOVI_RELATIONS_ESTADO') then
    alter table AUTOMOVIL
       delete foreign key FK_AUTOMOVI_RELATIONS_ESTADO
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_AUTOMOVI_RELATIONS_TIPO_AUT') then
    alter table AUTOMOVIL
       delete foreign key FK_AUTOMOVI_RELATIONS_TIPO_AUT
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_AUTOMOVI_RELATIONS_MARCA') then
    alter table AUTOMOVIL
       delete foreign key FK_AUTOMOVI_RELATIONS_MARCA
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_FUNCION__RELATIONS_FUNCION') then
    alter table FUNCION_VISTA
       delete foreign key FK_FUNCION__RELATIONS_FUNCION
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_FUNCION__RELATIONS_VISTA') then
    alter table FUNCION_VISTA
       delete foreign key FK_FUNCION__RELATIONS_VISTA
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_REGISTRO_RELATIONS_CLIENTE') then
    alter table REGISTRO_COMPRA_VENTA
       delete foreign key FK_REGISTRO_RELATIONS_CLIENTE
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_REGISTRO_RELATIONS_ESTADIST') then
    alter table REGISTRO_COMPRA_VENTA
       delete foreign key FK_REGISTRO_RELATIONS_ESTADIST
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_REGISTRO_RELATIONS_AUTOMOVI') then
    alter table REGISTRO_COMPRA_VENTA
       delete foreign key FK_REGISTRO_RELATIONS_AUTOMOVI
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_ROL_FUNC_RELATIONS_ROL') then
    alter table ROL_FUNCION
       delete foreign key FK_ROL_FUNC_RELATIONS_ROL
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_ROL_FUNC_RELATIONS_FUNCION') then
    alter table ROL_FUNCION
       delete foreign key FK_ROL_FUNC_RELATIONS_FUNCION
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_SESION_RELATIONS_USUARIO') then
    alter table SESION
       delete foreign key FK_SESION_RELATIONS_USUARIO
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_TELEFONO_RELATIONS_CLIENTE') then
    alter table TELEFONO
       delete foreign key FK_TELEFONO_RELATIONS_CLIENTE
end if;

drop index if exists ASIGANDO_AUTOMOVIL.RELATIONSHIP_14_FK;

drop index if exists ASIGANDO_AUTOMOVIL.RELATIONSHIP_6_FK;

drop index if exists ASIGANDO_AUTOMOVIL.ASIGANDO_AUTOMOVIL_PK;

drop table if exists ASIGANDO_AUTOMOVIL;

drop index if exists ASIGNA_ROL.RELATIONSHIP_19_FK;

drop index if exists ASIGNA_ROL.RELATIONSHIP_18_FK;

drop index if exists ASIGNA_ROL.ASIGNA_ROL_PK;

drop table if exists ASIGNA_ROL;

drop index if exists ASIGNA_USUARIO.RELATIONSHIP_16_FK;

drop index if exists ASIGNA_USUARIO.RELATIONSHIP_12_FK;

drop index if exists ASIGNA_USUARIO.ASIGNA_USUARIO_PK;

drop table if exists ASIGNA_USUARIO;

drop index if exists AUTOMOVIL.RELATIONSHIP_13_FK;

drop index if exists AUTOMOVIL.RELATIONSHIP_3_FK;

drop index if exists AUTOMOVIL.RELATIONSHIP_2_FK;

drop index if exists AUTOMOVIL.AUTOMOVIL_PK;

drop table if exists AUTOMOVIL;

drop index if exists CLIENTE.CLIENTE_PK;

drop table if exists CLIENTE;

drop index if exists EMPLEADO.EMPLEADO_PK;

drop table if exists EMPLEADO;

drop index if exists ESTADISTICAS.ESTADISTICAS_PK;

drop table if exists ESTADISTICAS;

drop index if exists ESTADO.ESTADO_PK;

drop table if exists ESTADO;

drop index if exists FUNCION.FUNCION_PK;

drop table if exists FUNCION;

drop index if exists FUNCION_VISTA.RELATIONSHIP_23_FK;

drop index if exists FUNCION_VISTA.RELATIONSHIP_22_FK;

drop index if exists FUNCION_VISTA.FUNCION_VISTA_PK;

drop table if exists FUNCION_VISTA;

drop index if exists MARCA.MARCA_PK;

drop table if exists MARCA;

drop index if exists REGISTRO_COMPRA_VENTA.RELATIONSHIP_11_FK;

drop index if exists REGISTRO_COMPRA_VENTA.RELATIONSHIP_8_FK;

drop index if exists REGISTRO_COMPRA_VENTA.RELATIONSHIP_7_FK;

drop index if exists REGISTRO_COMPRA_VENTA.REGISTRO_COMPRA_VENTA_PK;

drop table if exists REGISTRO_COMPRA_VENTA;

drop index if exists ROL.ROL_PK;

drop table if exists ROL;

drop index if exists ROL_FUNCION.RELATIONSHIP_21_FK;

drop index if exists ROL_FUNCION.RELATIONSHIP_20_FK;

drop index if exists ROL_FUNCION.ROL_FUNCION_PK;

drop table if exists ROL_FUNCION;

drop index if exists SESION.RELATIONSHIP_17_FK;

drop index if exists SESION.SESION_PK;

drop table if exists SESION;

drop index if exists TELEFONO.RELATIONSHIP_9_FK;

drop index if exists TELEFONO.TELEFONO_PK;

drop table if exists TELEFONO;

drop index if exists TIPO_AUTO.TIPO_AUTO_PK;

drop table if exists TIPO_AUTO;

drop index if exists USUARIO.USUARIO_PK;

drop table if exists USUARIO;

drop index if exists VISTA.VISTA_PK;

drop table if exists VISTA;

/*==============================================================*/
/* Table: ASIGANDO_AUTOMOVIL                                    */
/*==============================================================*/
create table ASIGANDO_AUTOMOVIL 
(
   ID_AUTO              smallint                       not null,
   ID_EMP               integer                        not null,
   FECHA                date                           not null,
   constraint PK_ASIGANDO_AUTOMOVIL primary key clustered (ID_AUTO, ID_EMP)
);

/*==============================================================*/
/* Index: ASIGANDO_AUTOMOVIL_PK                                 */
/*==============================================================*/
create unique clustered index ASIGANDO_AUTOMOVIL_PK on ASIGANDO_AUTOMOVIL (
ID_AUTO ASC,
ID_EMP ASC
);

/*==============================================================*/
/* Index: RELATIONSHIP_6_FK                                     */
/*==============================================================*/
create index RELATIONSHIP_6_FK on ASIGANDO_AUTOMOVIL (
ID_AUTO ASC
);

/*==============================================================*/
/* Index: RELATIONSHIP_14_FK                                    */
/*==============================================================*/
create index RELATIONSHIP_14_FK on ASIGANDO_AUTOMOVIL (
ID_EMP ASC
);

/*==============================================================*/
/* Table: ASIGNA_ROL                                            */
/*==============================================================*/
create table ASIGNA_ROL 
(
   ID_USUARIO           integer                        not null,
   ID_ROL               smallint                       not null,
   constraint PK_ASIGNA_ROL primary key clustered (ID_USUARIO, ID_ROL)
);

/*==============================================================*/
/* Index: ASIGNA_ROL_PK                                         */
/*==============================================================*/
create unique clustered index ASIGNA_ROL_PK on ASIGNA_ROL (
ID_USUARIO ASC,
ID_ROL ASC
);

/*==============================================================*/
/* Index: RELATIONSHIP_18_FK                                    */
/*==============================================================*/
create index RELATIONSHIP_18_FK on ASIGNA_ROL (
ID_USUARIO ASC
);

/*==============================================================*/
/* Index: RELATIONSHIP_19_FK                                    */
/*==============================================================*/
create index RELATIONSHIP_19_FK on ASIGNA_ROL (
ID_ROL ASC
);

/*==============================================================*/
/* Table: ASIGNA_USUARIO                                        */
/*==============================================================*/
create table ASIGNA_USUARIO 
(
   ID_EMP               integer                        not null,
   ID_USUARIO           integer                        not null,
   constraint PK_ASIGNA_USUARIO primary key clustered (ID_EMP, ID_USUARIO)
);

/*==============================================================*/
/* Index: ASIGNA_USUARIO_PK                                     */
/*==============================================================*/
create unique clustered index ASIGNA_USUARIO_PK on ASIGNA_USUARIO (
ID_EMP ASC,
ID_USUARIO ASC
);

/*==============================================================*/
/* Index: RELATIONSHIP_12_FK                                    */
/*==============================================================*/
create index RELATIONSHIP_12_FK on ASIGNA_USUARIO (
ID_EMP ASC
);

/*==============================================================*/
/* Index: RELATIONSHIP_16_FK                                    */
/*==============================================================*/
create index RELATIONSHIP_16_FK on ASIGNA_USUARIO (
ID_USUARIO ASC
);

/*==============================================================*/
/* Table: AUTOMOVIL                                             */
/*==============================================================*/
create table AUTOMOVIL 
(
   ID_AUTO              smallint                       not null,
   ID_MARCA             smallint                       not null,
   ID_ESTADO            smallint                       not null,
   ID_TIPOAUTO          smallint                       null,
   MATRICULA            varchar(15)                    not null,
   COLOR                varchar(15)                    not null,
   PRECIO               varchar(10)                    not null,
   constraint PK_AUTOMOVIL primary key (ID_AUTO)
);

/*==============================================================*/
/* Index: AUTOMOVIL_PK                                          */
/*==============================================================*/
create unique index AUTOMOVIL_PK on AUTOMOVIL (
ID_AUTO ASC
);

/*==============================================================*/
/* Index: RELATIONSHIP_2_FK                                     */
/*==============================================================*/
create index RELATIONSHIP_2_FK on AUTOMOVIL (
ID_TIPOAUTO ASC
);

/*==============================================================*/
/* Index: RELATIONSHIP_3_FK                                     */
/*==============================================================*/
create index RELATIONSHIP_3_FK on AUTOMOVIL (
ID_MARCA ASC
);

/*==============================================================*/
/* Index: RELATIONSHIP_13_FK                                    */
/*==============================================================*/
create index RELATIONSHIP_13_FK on AUTOMOVIL (
ID_ESTADO ASC
);

/*==============================================================*/
/* Table: CLIENTE                                               */
/*==============================================================*/
create table CLIENTE 
(
   ID_CLIENTE           smallint                       not null,
   CORREO               varchar(30)                    null,
   constraint PK_CLIENTE primary key (ID_CLIENTE)
);

/*==============================================================*/
/* Index: CLIENTE_PK                                            */
/*==============================================================*/
create unique index CLIENTE_PK on CLIENTE (
ID_CLIENTE ASC
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
   CI                   varchar(10)                    not null,
   SALARIO              integer                        not null,
   DESCUENTO            integer                        not null,
   BONOS                integer                        not null,
   constraint PK_EMPLEADO primary key (ID_EMP)
);

/*==============================================================*/
/* Index: EMPLEADO_PK                                           */
/*==============================================================*/
create unique index EMPLEADO_PK on EMPLEADO (
ID_EMP ASC
);

/*==============================================================*/
/* Table: ESTADISTICAS                                          */
/*==============================================================*/
create table ESTADISTICAS 
(
   ID_EST               integer                        not null,
   ANO                  varchar(4)                     not null,
   constraint PK_ESTADISTICAS primary key (ID_EST)
);

/*==============================================================*/
/* Index: ESTADISTICAS_PK                                       */
/*==============================================================*/
create unique index ESTADISTICAS_PK on ESTADISTICAS (
ID_EST ASC
);

/*==============================================================*/
/* Table: ESTADO                                                */
/*==============================================================*/
create table ESTADO 
(
   ID_ESTADO            smallint                       not null,
   NOMBRE_ESTADO        varchar(20)                    not null,
   constraint PK_ESTADO primary key (ID_ESTADO)
);

/*==============================================================*/
/* Index: ESTADO_PK                                             */
/*==============================================================*/
create unique index ESTADO_PK on ESTADO (
ID_ESTADO ASC
);

/*==============================================================*/
/* Table: FUNCION                                               */
/*==============================================================*/
create table FUNCION 
(
   ID_FUNCION           smallint                       not null,
   NOMBRE_FUNCION       varchar(25)                    not null,
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
/* Index: RELATIONSHIP_22_FK                                    */
/*==============================================================*/
create index RELATIONSHIP_22_FK on FUNCION_VISTA (
ID_FUNCION ASC
);

/*==============================================================*/
/* Index: RELATIONSHIP_23_FK                                    */
/*==============================================================*/
create index RELATIONSHIP_23_FK on FUNCION_VISTA (
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
/* Table: REGISTRO_COMPRA_VENTA                                 */
/*==============================================================*/
create table REGISTRO_COMPRA_VENTA 
(
   ID_EST               integer                        not null,
   ID_AUTO              smallint                       not null,
   ID_CLIENTE           smallint                       not null,
   FECHA_VENTA          date                           not null,
   ANO                  varchar(4)                     not null,
   constraint PK_REGISTRO_COMPRA_VENTA primary key clustered (ID_EST, ID_AUTO, ID_CLIENTE)
);

/*==============================================================*/
/* Index: REGISTRO_COMPRA_VENTA_PK                              */
/*==============================================================*/
create unique clustered index REGISTRO_COMPRA_VENTA_PK on REGISTRO_COMPRA_VENTA (
ID_EST ASC,
ID_AUTO ASC,
ID_CLIENTE ASC
);

/*==============================================================*/
/* Index: RELATIONSHIP_7_FK                                     */
/*==============================================================*/
create index RELATIONSHIP_7_FK on REGISTRO_COMPRA_VENTA (
ID_EST ASC
);

/*==============================================================*/
/* Index: RELATIONSHIP_8_FK                                     */
/*==============================================================*/
create index RELATIONSHIP_8_FK on REGISTRO_COMPRA_VENTA (
ID_AUTO ASC
);

/*==============================================================*/
/* Index: RELATIONSHIP_11_FK                                    */
/*==============================================================*/
create index RELATIONSHIP_11_FK on REGISTRO_COMPRA_VENTA (
ID_CLIENTE ASC
);

/*==============================================================*/
/* Table: ROL                                                   */
/*==============================================================*/
create table ROL 
(
   ID_ROL               smallint                       not null,
   NOMBRE_ROL           varchar(15)                    not null,
   constraint PK_ROL primary key (ID_ROL)
);

/*==============================================================*/
/* Index: ROL_PK                                                */
/*==============================================================*/
create unique index ROL_PK on ROL (
ID_ROL ASC
);

/*==============================================================*/
/* Table: ROL_FUNCION                                           */
/*==============================================================*/
create table ROL_FUNCION 
(
   ID_ROL               smallint                       not null,
   ID_FUNCION           smallint                       not null,
   constraint PK_ROL_FUNCION primary key clustered (ID_ROL, ID_FUNCION)
);

/*==============================================================*/
/* Index: ROL_FUNCION_PK                                        */
/*==============================================================*/
create unique clustered index ROL_FUNCION_PK on ROL_FUNCION (
ID_ROL ASC,
ID_FUNCION ASC
);

/*==============================================================*/
/* Index: RELATIONSHIP_20_FK                                    */
/*==============================================================*/
create index RELATIONSHIP_20_FK on ROL_FUNCION (
ID_ROL ASC
);

/*==============================================================*/
/* Index: RELATIONSHIP_21_FK                                    */
/*==============================================================*/
create index RELATIONSHIP_21_FK on ROL_FUNCION (
ID_FUNCION ASC
);

/*==============================================================*/
/* Table: SESION                                                */
/*==============================================================*/
create table SESION 
(
   ID_SESION            smallint                       not null,
   ID_USUARIO           integer                        not null,
   HORA_INGRESO         time                           not null,
   constraint PK_SESION primary key (ID_SESION)
);

/*==============================================================*/
/* Index: SESION_PK                                             */
/*==============================================================*/
create unique index SESION_PK on SESION (
ID_SESION ASC
);

/*==============================================================*/
/* Index: RELATIONSHIP_17_FK                                    */
/*==============================================================*/
create index RELATIONSHIP_17_FK on SESION (
ID_USUARIO ASC
);

/*==============================================================*/
/* Table: TELEFONO                                              */
/*==============================================================*/
create table TELEFONO 
(
   ID_TELEFONO          integer                        not null,
   ID_CLIENTE           smallint                       not null,
   NUMERO               varchar(15)                    not null,
   LOCALIZACION         varchar(20)                    not null,
   constraint PK_TELEFONO primary key (ID_TELEFONO)
);

/*==============================================================*/
/* Index: TELEFONO_PK                                           */
/*==============================================================*/
create unique index TELEFONO_PK on TELEFONO (
ID_TELEFONO ASC
);

/*==============================================================*/
/* Index: RELATIONSHIP_9_FK                                     */
/*==============================================================*/
create index RELATIONSHIP_9_FK on TELEFONO (
ID_CLIENTE ASC
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
/* Table: USUARIO                                               */
/*==============================================================*/
create table USUARIO 
(
   ID_USUARIO           integer                        not null,
   "LOGIN"              varchar(25)                    not null,
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

alter table ASIGANDO_AUTOMOVIL
   add constraint FK_ASIGANDO_RELATIONS_EMPLEADO foreign key (ID_EMP)
      references EMPLEADO (ID_EMP)
      on update restrict
      on delete restrict;

alter table ASIGANDO_AUTOMOVIL
   add constraint FK_ASIGANDO_RELATIONS_AUTOMOVI foreign key (ID_AUTO)
      references AUTOMOVIL (ID_AUTO)
      on update restrict
      on delete restrict;

alter table ASIGNA_ROL
   add constraint FK_ASIGNA_R_RELATIONS_USUARIO foreign key (ID_USUARIO)
      references USUARIO (ID_USUARIO)
      on update restrict
      on delete restrict;

alter table ASIGNA_ROL
   add constraint FK_ASIGNA_R_RELATIONS_ROL foreign key (ID_ROL)
      references ROL (ID_ROL)
      on update restrict
      on delete restrict;

alter table ASIGNA_USUARIO
   add constraint FK_ASIGNA_U_RELATIONS_EMPLEADO foreign key (ID_EMP)
      references EMPLEADO (ID_EMP)
      on update restrict
      on delete restrict;

alter table ASIGNA_USUARIO
   add constraint FK_ASIGNA_U_RELATIONS_USUARIO foreign key (ID_USUARIO)
      references USUARIO (ID_USUARIO)
      on update restrict
      on delete restrict;

alter table AUTOMOVIL
   add constraint FK_AUTOMOVI_RELATIONS_ESTADO foreign key (ID_ESTADO)
      references ESTADO (ID_ESTADO)
      on update restrict
      on delete restrict;

alter table AUTOMOVIL
   add constraint FK_AUTOMOVI_RELATIONS_TIPO_AUT foreign key (ID_TIPOAUTO)
      references TIPO_AUTO (ID_TIPOAUTO)
      on update restrict
      on delete restrict;

alter table AUTOMOVIL
   add constraint FK_AUTOMOVI_RELATIONS_MARCA foreign key (ID_MARCA)
      references MARCA (ID_MARCA)
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

alter table REGISTRO_COMPRA_VENTA
   add constraint FK_REGISTRO_RELATIONS_CLIENTE foreign key (ID_CLIENTE)
      references CLIENTE (ID_CLIENTE)
      on update restrict
      on delete restrict;

alter table REGISTRO_COMPRA_VENTA
   add constraint FK_REGISTRO_RELATIONS_ESTADIST foreign key (ID_EST)
      references ESTADISTICAS (ID_EST)
      on update restrict
      on delete restrict;

alter table REGISTRO_COMPRA_VENTA
   add constraint FK_REGISTRO_RELATIONS_AUTOMOVI foreign key (ID_AUTO)
      references AUTOMOVIL (ID_AUTO)
      on update restrict
      on delete restrict;

alter table ROL_FUNCION
   add constraint FK_ROL_FUNC_RELATIONS_ROL foreign key (ID_ROL)
      references ROL (ID_ROL)
      on update restrict
      on delete restrict;

alter table ROL_FUNCION
   add constraint FK_ROL_FUNC_RELATIONS_FUNCION foreign key (ID_FUNCION)
      references FUNCION (ID_FUNCION)
      on update restrict
      on delete restrict;

alter table SESION
   add constraint FK_SESION_RELATIONS_USUARIO foreign key (ID_USUARIO)
      references USUARIO (ID_USUARIO)
      on update restrict
      on delete restrict;

alter table TELEFONO
   add constraint FK_TELEFONO_RELATIONS_CLIENTE foreign key (ID_CLIENTE)
      references CLIENTE (ID_CLIENTE)
      on update restrict
      on delete restrict;

