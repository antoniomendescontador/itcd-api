CREATE TABLE contribuinte (
	codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	
	nome VARCHAR(50) NOT NULL,
	cpf VARCHAR(18) NOT NULL,
    email VARCHAR(50),
    telefone VARCHAR(18),
    tipo VARCHAR(50),
    
    logradouro VARCHAR(30),
	numero VARCHAR(8),
	complemento VARCHAR(30),
	bairro VARCHAR(30),
	cep VARCHAR(30),
	cidade VARCHAR(30),
	estado VARCHAR(2),
	inventario_extrajudicial_id BIGINT(20),
	FOREIGN KEY (inventario_extrajudicial_id) REFERENCES inventario_extrajudicial(codigo)
	
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO contribuinte (nome, cpf, email, telefone, tipo, logradouro, numero, complemento, bairro, cep, cidade, estado,inventario_extrajudicial_id) values ('Maria das Couves','80634109200','maria@gmail.com','(91)3039-8555', 'Inventariante', 'Av. Jose Bonifácio', '1130', 'Ap 402', 'São Bras', '66.063-075', 'Belem', 'PA',1);

