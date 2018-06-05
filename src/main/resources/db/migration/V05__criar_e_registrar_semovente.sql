CREATE TABLE semovente (
	codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	produto VARCHAR(50) NOT NULL,
	unidade VARCHAR(5) NOT NULL,
	valor_declarado DECIMAL(10,2) NOT NULL,
	boletim_preco_minimo DECIMAL(10,2),
	quantidade DECIMAL(10,2) NOT NULL,
	valor_total DECIMAL(10,2),
	
	inventario_extrajudicial_id BIGINT(20),
	FOREIGN KEY (inventario_extrajudicial_id) REFERENCES inventario_extrajudicial(codigo)
	
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO semovente (produto, unidade, valor_declarado, boletim_preco_minimo, quantidade, valor_total,inventario_extrajudicial_id) values ('BOVINOS DE 0 A 12 MESES (MACHO)','cb', 400.00, 800.00, 10.00, 8000.00,1);
