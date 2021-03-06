
CREATE TABLE veiculo (
	codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	
	renavan VARCHAR(15),
	placa VARCHAR(15) NOT NULL,
	marca VARCHAR(15) NOT NULL,
	modelo VARCHAR(50) NOT NULL,
	ano VARCHAR(10) NOT NULL,
	valor_declarado DECIMAL(10,2) NOT NULL,
	valor_avaliado DECIMAL(10,2) NOT NULL,
	
	inventario_extrajudicial_id BIGINT(20),
	FOREIGN KEY (inventario_extrajudicial_id) REFERENCES inventario_extrajudicial(codigo)
	
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO veiculo (renavan, placa, marca, modelo, ano, valor_declarado, valor_avaliado,inventario_extrajudicial_id ) values ('7667776','AAA-5667','honda','Civic 1.8 mec 16v', '2008', 10000.00,20000.00,1);
INSERT INTO veiculo (renavan, placa, marca, modelo, ano, valor_declarado, valor_avaliado,inventario_extrajudicial_id ) values ('7667777','BBB-5667','honda','Civic 1.8 mec 16v', '2008', 10000.00,20000.00,1);
INSERT INTO veiculo (renavan, placa, marca, modelo, ano, valor_declarado, valor_avaliado,inventario_extrajudicial_id ) values ('7667778','CCC-5667','honda','Civic 1.8 mec 16v', '2008', 10000.00,20000.00,1);
INSERT INTO veiculo (renavan, placa, marca, modelo, ano, valor_declarado, valor_avaliado,inventario_extrajudicial_id ) values ('7667779','DDD-5667','honda','Civic 1.8 mec 16v', '2008', 10000.00,20000.00,1);
