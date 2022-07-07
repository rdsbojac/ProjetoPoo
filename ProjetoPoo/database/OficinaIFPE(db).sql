drop database dboficina;

-- esta linha abaixo cria um banco de dados

create database dbOficina;

-- a linha abaixo escolhe o banco de dados

use dbOficina;

-- os codigos abaixo cria um tabela de usuarios

create table tbUsuarios(
	id int not null auto_increment,
    nomeUser varchar(45) not null,
    numeroUser varchar(15),
    cargo varchar(15) not null,
    loginUser varchar(15) not null unique,
    senhaUser varchar(15) not null,
    primary key (id)
);

-- o Comando abaixo descreve a tabela

describe tbUsuarios;

-- a linha abaixo insere dados na tabela

insert into tbUsuarios (nomeUser, numeroUser, cargo, loginUser, senhaUser)
values ('Ronado Daniel', '81999717049', 'Gerente', 'ronaldodaniel', '123');


-- a linha abaixo exibe os dados da tabela

select * from tbUsuarios;

insert into tbUsuarios (nomeUser, numeroUser, cargo, loginUser, senhaUser)
values ('Rosinaldo Daniel', '81999889609', 'Mecanico','rosinaldodaniel', '1234'),
	   ('Gabriela Jose', '81986761215', 'Mecanico',  'gabrielajose', '12345');
       
select * from tbUsuarios;

-- a linha abaixo modifica dados na tabela

update tbUsuarios set numeroUser = '81999707149' where idUser=1;

-- a linha abaixo deleta dados da tabela

delete from tbUsuarios where idUser=3;

select * from tbUsuarios;

-- esta linha criara uma tabela para clientes

create table tbCliente(	
	idCliente int not null auto_increment,
    nomeCliente varchar(45) not null,
    endCliente varchar(80),
    numeroCli varchar(15) not null,
    emailClie varchar(45),
	primary key (idCliente)
);

describe tbCliente;

insert into tbCliente (nomeCliente, numeroCli, emailClie)
values ('Joao Jose', '81993275837' ,'seila@gmail.com'),
	   ('Paulo Joao', '81995435472' ,'seila2@gmail.com'),
	   ('Gustavo Pereira', '819857621232' ,'seila3@gmail.com');
       
select * from tbCliente;

update tbCliente set endCliente='Rua da Gloria, 197 - Boa vista' where idCliente=2 ;

select * from tbCliente;

use dbOficina;

create table tbOs(
	os int primary key auto_increment,
    -- quando um insert for feito o dataOs recebe o horario atual do servidor
    dataOs timestamp default current_timestamp,
    veiculo varchar(45) not null,
    defeito varchar(100) not null, 
    servico varchar(45),
    mecanico varchar(50),
    valorServico decimal(6,2),
    idCliente int not null,
    foreign key (idCliente) references tbCliente(idCliente)
);

describe tbOs; 

insert into tbOs(veiculo, defeito, servico, mecanico, valorServico, idCliente)
values('prisma', 'arcondicionado quebrado', 'Troca do Filtro', 'Gabriel', 500.45, 3);

select * from tbOs;

-- o codigo abaixo tras informacoes de duas tabelas

-- Referenciar o atributo colocando A VARIAVEL na frente
-- ENTENDER TBOS COMO O
-- entender tbcliente como c
-- onde a chave estrangeira de O é a chave primaria de C
select
O.os,O.veiculo,O.defeito,O.servico,O.mecanico,O.valorServico,O.idCliente,
C.nomeCliente,C.numeroCli,C.emailClie
from tbOs as O 
inner join tbCliente as C 
on O.idCliente = C.idCliente; 


