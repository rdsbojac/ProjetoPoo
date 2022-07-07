drop database dbOficina;
-- Cria o Banco de Dados dbOficina

create database dbOficina;

-- Seleciona o Banco de Dados ------------------
use dbOficina;

-- Cria a tabela de usuários -------------------
create table tbUsuarios(
	idUser int  primary key,
    nomeUser varchar(45) not null,
    numeroUser varchar(15),
    cargo varchar(15) not null,
    loginUser varchar(15) not null unique,
    senhaUser varchar(15) not null
);

-- Cria a tabela de Clientes --------------------
create table tbCliente(	
	idCliente int primary key auto_increment,
    nomeCliente varchar(45) not null,
    endCliente varchar(80),
    numeroCli varchar(15) not null,
    emailClie varchar(45) 

);

-- Cria a tabela de Ordens de Serviço
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

-- Descreve as tabelas --------------------------
describe tbUsuarios;
describe tbCliente;
describe tbOs;

-- Insere valores nas tabelas -------------------
insert into tbUsuarios (idUser, nomeUser, numeroUser, cargo, loginUser, senhaUser)
values (1, 'Ronado Daniel', '81999717049', 'Gerente', 'ronaldodaniel', '123'),
		(2, 'Rosinaldo Daniel', '81999889609', 'Mecanico','rosinaldodaniel', '1234'),
		(3, 'Gabriela Jose', '81986761215', 'Mecanico',  'gabrielajose', '12345');
        
insert into tbCliente (nomeCliente, numeroCli, emailClie)
values ('Joao Jose', '81993275837' ,'seila@gmail.com'),
	   ('Paulo Joao', '81995435472' ,'seila2@gmail.com'),
	   ('Gustavo Pereira', '819857621232' ,'seila3@gmail.com');
       
insert into tbOs(veiculo, defeito, servico, mecanico, valorServico, idCliente)
values('prisma', 'arcondicionado quebrado', 'Troca do Filtro', 'Gabriel', 500.45, 3);
        
-- Exibe os valores nas tabelas
select * from tbUsuarios;
select * from tbCliente;
select * from tbOs;

