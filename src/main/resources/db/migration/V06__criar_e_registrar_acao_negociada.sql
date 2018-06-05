CREATE TABLE acao_negociada_bolsa (
	codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	
	nome VARCHAR(50) NOT NULL,
	codigo_acao VARCHAR(10) NOT NULL,
	quantidade DECIMAL(10,2) NOT NULL,
	valor_declarado DECIMAL(10,2) NOT NULL,
	valor_avaliado DECIMAL(10,2) NOT NULL,
	valor_total DECIMAL(10,2) NOT NULL,
	
	inventario_extrajudicial_id BIGINT(20),
	FOREIGN KEY (inventario_extrajudicial_id) REFERENCES inventario_extrajudicial(codigo)
	
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO acao_negociada_bolsa (nome,codigo_acao,quantidade,valor_declarado,valor_avaliado,valor_total,inventario_extrajudicial_id) values ('ABC BRASIL PN','ABCB4.SA', 400.00, 800.00, 1000.00, 400000.00,1);
