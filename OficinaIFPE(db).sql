-- esta linha abaixo cria um banco de dados

create database dbOficina;

-- a linha abaixo escolhe o banco de dados

use dbOficina

-- os codigos abaixo cria um tabela de usuarios

create table dbUsuarios(
	idUser int  primary key,
    nomeUser varchar(45) not null,
    numeroUser varchar(15),
    cargo varchar(15) not null,
    loginUser varchar(15) not null unique,
    senhaUser varchar(15) not null
);

-- o Comando abaixo descreve a tabela

describe dbUsuarios;

-- a linha abaixo insere dados na tabela

insert into dbUsuarios (idUser, nomeUser, numeroUser, cargo, loginUser, senhaUser)
values (1, 'Ronado Daniel', '81999717049', 'Gerente', 'ronaldodaniel', '123');


-- a linha abaixo exibe os dados da tabela

select * from dbUsuarios;

insert into dbUsuarios (idUser, nomeUser, numeroUser, cargo, loginUser, senhaUser)
values (2, 'Rosinaldo Daniel', '81999889609', 'Mecanico','rosinaldodaniel', '1234'),
	   (3, 'Gabriela Jose', '81986761215', 'Mecanico',  'gabrielajose', '12345');
       
select * from dbUsuarios;

-- a linha abaixo modifica dados na tabela

update dbUsuarios set numeroUser = '81999707149' where idUser=1;

-- a linha abaixo deleta dados da tabela

delete from dbUsuarios where idUser=3;

select * from dbUsuarios;

-- esta linha criara uma tabela para clientes

create table dbCliente(	
	idCliente int primary key auto_increment,
    nomeCliente varchar(45) not null,
    endCliente varchar(80),
    numeroCli varchar(15) not null,
    emailClie varchar(45) 

);

describe dbCliente;

insert into dbCliente (nomeCliente, numeroCli, emailClie)
values ('Joao Jose', '81993275837' ,'seila@gmail.com'),
	   ('Paulo Joao', '81995435472' ,'seila2@gmail.com'),
	   ('Gustavo Pereira', '819857621232' ,'seila3@gmail.com');
       
select * from dbCliente;

update dbCliente set endCliente='Rua da Gloria, 197 - Boa vista' where idCliente=2 ;

select * from dbCliente;

