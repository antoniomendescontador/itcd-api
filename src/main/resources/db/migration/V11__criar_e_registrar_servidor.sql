
CREATE TABLE servidor (
	codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	
	nome VARCHAR(50) NOT NULL,
	cpf VARCHAR(18) NOT NULL,
    email VARCHAR(50) NOT NULL,
    telefone VARCHAR(18) NOT NULL,
    
    ativo BOOLEAN NOT NULL,
    cargo VARCHAR(50) NOT NULL,
    matricula VARCHAR(18),
    
    logradouro VARCHAR(30),
	numero VARCHAR(8),
	complemento VARCHAR(30),
	bairro VARCHAR(30),
	cep VARCHAR(30),
	cidade VARCHAR(30),
	estado VARCHAR(2)
	
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO servidor (nome, cpf, email, telefone, ativo, cargo, matricula, logradouro, numero, complemento, bairro, cep, cidade, estado) values ('Antonio Mendes','80634109200','antonio.mendes@sefa.pa.gov.br','(91)3039-8555',true,'Auditor_Fiscal_De_Tributos_Estaduais_AFRE','0591479701','Av. Jose Bonifácio', '1130', 'Ap 402', 'São Bras', '66.063-075', 'Belem', 'PA');

