CREATE TABLE imovel_rural (
	codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	
	codigo_nirf VARCHAR(15),
	codigo_incra VARCHAR(15),
	nome VARCHAR(50) NOT NULL,
	area_total DECIMAL(10,2) NOT NULL,
	valor_terra_nua DECIMAL(10,2) NOT NULL,
	valor_edificacao DECIMAL(10,2) NOT NULL,
	valor_instalacao DECIMAL(10,2) NOT NULL,
	valor_culturas DECIMAL(10,2) NOT NULL,
	valor_pastagem DECIMAL(10,2) NOT NULL,
	valor_floresta DECIMAL(10,2) NOT NULL,
	
	logradouro VARCHAR(30) NOT NULL,
	numero VARCHAR(8) NOT NULL,
	complemento VARCHAR(30),
	bairro VARCHAR(30),
	cep VARCHAR(30) NOT NULL,
	cidade VARCHAR(30) NOT NULL,
	estado VARCHAR(2) NOT NULL,
	
	valor_avaliado_mt_quadr DECIMAL(10,2) NOT NULL,
	valor_declarado DECIMAL(10,2) NOT NULL,
	
	declaracao_inventario_extrajudicial_id BIGINT(20),
	FOREIGN KEY (declaracao_inventario_extrajudicial_id) REFERENCES declaracao_inventario_extrajudicial(codigo)
	
			
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO 
imovel_rural (codigo_nirf,codigo_incra,nome,area_total,valor_terra_nua,valor_edificacao,valor_instalacao,valor_culturas,valor_pastagem,valor_floresta,logradouro,numero,complemento,bairro,cep,cidade,estado,valor_avaliado_mt_quadr,valor_declarado,declaracao_inventario_extrajudicial_id) 
values ('123','321','Fazenda modelo',400.00,20000.00,10000.00,10000.00,5000.00,3000.00,4000.00,'br 360','34','em frente pagagurai','rural','66.090-890','paragominas','PA',200000.00,150000.00,1);

