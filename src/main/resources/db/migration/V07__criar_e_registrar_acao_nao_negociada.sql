
CREATE TABLE acao_nao_negociada_bolsa (
	codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	
	quantidade_total DECIMAL(10,2) NOT NULL,
	quantidade_transmitida DECIMAL(10,2) NOT NULL,
	valor_ativo_total DECIMAL(10,2) NOT NULL,
	valor_passivo_exigivel DECIMAL(10,2) NOT NULL,
	valor_patrimonio_liquido DECIMAL(10,2) NOT NULL,
	valor_avaliado DECIMAL(10,2) NOT NULL,
	valor_declarado DECIMAL(10,2) NOT NULL,
	inventario_extrajudicial_id BIGINT(20),
	FOREIGN KEY (inventario_extrajudicial_id) REFERENCES inventario_extrajudicial(codigo)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO acao_nao_negociada_bolsa (quantidade_total,quantidade_transmitida,valor_ativo_total,valor_passivo_exigivel,valor_patrimonio_liquido,valor_avaliado,valor_declarado,inventario_extrajudicial_id) 
values (1000.00, 250.00, 200000.00, 100000.00, 100000.00,25000.00,3000.00,1);
