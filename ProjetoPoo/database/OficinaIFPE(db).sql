drop database dboficina;

-- esta linha abaixo cria um banco de dados

create database dbOficina;

-- a linha abaixo escolhe o banco de dados

use dbOficina;

/*Os codigos abaixo criam as tabelas*/

-- Usuários
create table tbUsuarios(
	id bigint not null auto_increment,
    nomeUser varchar(45) not null,
    numeroUser varchar(15),
    cargo varchar(15) not null,
    perfil varchar(15) not null,
    loginUser varchar(15) not null unique,
    senhaUser varchar(15) not null,
    primary key (id)
);

-- Cliente
create table tbCliente(	
	id bigint not null auto_increment,
    nomeCliente varchar(45) not null,
    endCliente varchar(80),
    numeroCliente varchar(15) not null,
    emailCliente varchar(45),
	primary key (id)
);

-- Ordem de Seriviço 
create table tbOs(
	id bigint not null auto_increment,
    -- quando um insert for feito o dataOs recebe o horario atual do servidor
    dataOs timestamp default current_timestamp,
    veiculo varchar(45) not null,
    defeito varchar(100) not null, 
    servico varchar(45) not null,
    idMecanico bigint not null,
    valorServico decimal(6,2),
    idCliente bigint not null,
    primary key (id),
    foreign key (idMecanico) references tbUsuarios(id),
    foreign key (idCliente) references tbCliente(id)
);

/*Os comandos abaixo descrevem as tabelas*/

describe tbUsuarios;
describe tbCliente;
describe tbOs;

/*As linhas abaixo inserem alguns dados na tabela*/

-- Insere valores na tabela de Usuários
insert into tbUsuarios (nomeUser, numeroUser, cargo, perfil, loginUser, senhaUser)
values ('Ronado Daniel', '81999717049', 'Gerente', 'admin', 'ronaldodaniel', '123'),
		('Rosinaldo Daniel', '81999889609', 'Mecanico', 'user', 'rosinaldodaniel', '1234'),
		('Gabriela Jose', '81986761215', 'Mecanico', 'user',  'gabrielajose', '12345');

-- Insere valores na tabela de Clientes
insert into tbCliente (nomeCliente, numeroCli, emailClie)
values ('Joao Jose', '81993275837' ,'seila@gmail.com'),
	   ('Paulo Joao', '81995435472' ,'seila2@gmail.com'),
	   ('Gustavo Pereira', '819857621232' ,'seila3@gmail.com');
       
-- Insere valores na tabela de Ordem de Seriviço
insert into tbOs(veiculo, defeito, servico, idMecanico, valorServico, idCliente)
values('prisma', 'arcondicionado quebrado', 'Troca do Filtro', '2', 500.45, 3);

/* As linhas abaixo exibem os dados das tabelas */

select * from tbUsuarios;
select * from tbCliente;
select * from tbOs;

-- a linha abaixo modifica dados na tabela

update tbUsuarios set numeroUser = '81999707149' where idUser=1;
update tbCliente set endCliente='Rua da Gloria, 197 - Boa vista' where idCliente=2 ;

-- a linha abaixo deleta dados da tabela

delete from tbUsuarios where idUser=3;

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


