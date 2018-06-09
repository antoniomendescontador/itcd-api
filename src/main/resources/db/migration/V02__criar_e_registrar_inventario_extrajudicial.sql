CREATE TABLE inventario_extrajudicial (
	codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	identificacao VARCHAR(50) NOT NULL,
	
	cartorio_id BIGINT(20),
	FOREIGN KEY (cartorio_id) REFERENCES cartorio(codigo)
	
			
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO inventario_extrajudicial (identificacao, cartorio_id) values ('11111111111',1);
INSERT INTO inventario_extrajudicial (identificacao, cartorio_id) values ('22222222222',1);
INSERT INTO inventario_extrajudicial (identificacao, cartorio_id) values ('33333333333',2);
INSERT INTO inventario_extrajudicial (identificacao, cartorio_id) values ('44444444444',2);
INSERT INTO inventario_extrajudicial (identificacao, cartorio_id) values ('55555555555',3);