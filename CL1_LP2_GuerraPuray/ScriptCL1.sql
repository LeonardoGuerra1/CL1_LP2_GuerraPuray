#Autor: Leonardo Guerra
#Codigo: i202215626
#Seccion: T4HB

create database bd_cibertec;
use bd_cibertec;

drop table empleado;
create table empleado (
Id					int not null primary key auto_increment,
apellidos			varchar(50) not null,
nombres				varchar(50) not null,
edad				int not null,
sexo				char(1) not null,
salario				decimal,
check(edad >= 18),
check(sexo in ('M', 'F')),
check(salario between 1500 and 2500)
);

insert into empleado values (1, 'Torres', 'Jose', 22, 'M', 1500);
insert into empleado values (2, 'Garcia', 'Maria', 21, 'F', 1700);
insert into empleado (apellidos, nombres, edad, sexo, salario) values ('Casas', 'Ana', 23, 'F', 2000);
select * from empleado;