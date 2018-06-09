CREATE TABLE imovel_urbano (
	codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	
	metro_quadrado DECIMAL(10,2) not null,
	
	matricula VARCHAR(15),
	livro VARCHAR(10),
	folha VARCHAR(10),
	descricao TEXT(200) NOT NULL,
	
	iptu_inscricao VARCHAR(40),
	iptu_terreno DECIMAL(10,2),
	iptu_edificacao DECIMAL(10,2),
	iptu_total DECIMAL(10,2),
	
	logradouro VARCHAR(30) NOT NULL,
	numero VARCHAR(8),
	complemento VARCHAR(30),
	bairro VARCHAR(30) NOT NULL,
	cep VARCHAR(30) NOT NULL,
	cidade VARCHAR(30) NOT NULL,
	estado VARCHAR(2) NOT NULL,
	
	valor_avaliado_iptu DECIMAL(10,2),
	valor_avaliado_cub DECIMAL(10,2),
	valor_avaliado_mt_quadr DECIMAL(10,2),
	
	inventario_extrajudicial_id BIGINT(20),
	FOREIGN KEY (inventario_extrajudicial_id) REFERENCES inventario_extrajudicial(codigo)
			
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO imovel_urbano (metro_quadrado,matricula,livro,folha,descricao,iptu_inscricao,iptu_terreno,iptu_edificacao,iptu_total,logradouro,numero,complemento,bairro,cep,cidade,estado,valor_avaliado_iptu,valor_avaliado_cub,valor_avaliado_mt_quadr,inventario_extrajudicial_id) 
values (120.00,'34.900','200','123','adiquirido pela escritura númerdo 200','33489876',20000.00,60000.00,80000.00,'rua das merces','345','casa 3','canudus','66.986-098','Belem','PA',150000.00,137000.00,230000.00,1);
INSERT INTO imovel_urbano (metro_quadrado,matricula,livro,folha,descricao,iptu_inscricao,iptu_terreno,iptu_edificacao,iptu_total,logradouro,numero,complemento,bairro,cep,cidade,estado,valor_avaliado_iptu,valor_avaliado_cub,valor_avaliado_mt_quadr,inventario_extrajudicial_id) 
values (130.00,'34.900','200','123','adiquirido pela escritura númerdo 200','33489876',20000.00,60000.00,80000.00,'rua das merces','345','casa 3','canudus','66.986-098','Belem','PA',150000.00,137000.00,230000.00,1);
INSERT INTO imovel_urbano (metro_quadrado,matricula,livro,folha,descricao,iptu_inscricao,iptu_terreno,iptu_edificacao,iptu_total,logradouro,numero,complemento,bairro,cep,cidade,estado,valor_avaliado_iptu,valor_avaliado_cub,valor_avaliado_mt_quadr,inventario_extrajudicial_id) 
values (160.00,'34.900','200','123','adiquirido pela escritura númerdo 200','33489876',20000.00,60000.00,80000.00,'rua das merces','345','casa 3','canudus','66.986-098','Belem','PA',150000.00,137000.00,230000.00,1);
INSERT INTO imovel_urbano (metro_quadrado,matricula,livro,folha,descricao,iptu_inscricao,iptu_terreno,iptu_edificacao,iptu_total,logradouro,numero,complemento,bairro,cep,cidade,estado,valor_avaliado_iptu,valor_avaliado_cub,valor_avaliado_mt_quadr,inventario_extrajudicial_id) 
values (200.00,'34.900','200','123','adiquirido pela escritura númerdo 200','33489876',20000.00,60000.00,80000.00,'rua das merces','345','casa 3','canudus','66.986-098','Belem','PA',150000.00,137000.00,230000.00,2);
INSERT INTO imovel_urbano (metro_quadrado,matricula,livro,folha,descricao,iptu_inscricao,iptu_terreno,iptu_edificacao,iptu_total,logradouro,numero,complemento,bairro,cep,cidade,estado,valor_avaliado_iptu,valor_avaliado_cub,valor_avaliado_mt_quadr,inventario_extrajudicial_id) 
values (50.00,'34.900','200','123','adiquirido pela escritura númerdo 200','33489876',20000.00,60000.00,80000.00,'rua das merces','345','casa 3','canudus','66.986-098','Belem','PA',150000.00,137000.00,230000.00,2);
INSERT INTO imovel_urbano (metro_quadrado,matricula,livro,folha,descricao,iptu_inscricao,iptu_terreno,iptu_edificacao,iptu_total,logradouro,numero,complemento,bairro,cep,cidade,estado,valor_avaliado_iptu,valor_avaliado_cub,valor_avaliado_mt_quadr,inventario_extrajudicial_id) 
values (90.00,'34.900','200','123','adiquirido pela escritura númerdo 200','33489876',20000.00,60000.00,80000.00,'rua das merces','345','casa 3','canudus','66.986-098','Belem','PA',150000.00,137000.00,230000.00,3);
