CREATE TABLE declaracao_inventario_extrajudicial (
	codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	identificacao VARCHAR(50) NOT NULL,
	
	cartorio_id BIGINT(20) NOT NULL,
	FOREIGN KEY (cartorio_id) REFERENCES cartorio(codigo)
	
			
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO 
declaracao_inventario_extrajudicial (identificacao,cartorio_id) 
values ('192018730004565-7',1);

