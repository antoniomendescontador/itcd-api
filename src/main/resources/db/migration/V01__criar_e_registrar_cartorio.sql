	CREATE TABLE cartorio (
		codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
		oficio VARCHAR(15) NOT NULL,
		nome_cartorio VARCHAR(50) NOT NULL,
		comarca VARCHAR(15) NOT NULL,
		cnpj VARCHAR(18) NOT NULL,
		ativo BOOLEAN NOT NULL,
		observacao TEXT(200),
	    
	    nome VARCHAR(50) NOT NULL,
	    cpf VARCHAR(18) NOT NULL,
	    email VARCHAR(50) NOT NULL,
	    telefone VARCHAR(18) NOT NULL,
	    
	    logradouro VARCHAR(30),
		numero VARCHAR(8),
		complemento VARCHAR(30),
		bairro VARCHAR(30),
		cep VARCHAR(30),
		cidade VARCHAR(30),
		estado VARCHAR(2)
		
	) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO cartorio (oficio, nome_cartorio, comarca, cnpj, ativo, observacao, nome, cpf, email, telefone, logradouro, numero, complemento, bairro, cep, cidade, estado)
 values 
('1º Ofício','Conduru','Belem','12009233000132', true,'Cartório nota 10','joão','888444555','joao@gmail','9199456', 'Av. tres de maio', '400', 'casa 5', 'nazare', '66.063-075', 'Belem', 'PA');
