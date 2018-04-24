CREATE TABLE imovel_urbano_indice_atualizacao (
	imovel_urbano_codigo BIGINT(20),
	indice_atualizacao_codigo BIGINT(20),
	
	FOREIGN KEY (imovel_urbano_codigo) REFERENCES imovel_urbano(codigo),
	FOREIGN KEY (indice_atualizacao_codigo) REFERENCES indice_atualizacao(codigo)
	
	
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO imovel_urbano_indice_atualizacao (imovel_urbano_codigo,indice_atualizacao_codigo) values (1,1);
INSERT INTO imovel_urbano_indice_atualizacao (imovel_urbano_codigo,indice_atualizacao_codigo) values (1,6);
INSERT INTO imovel_urbano_indice_atualizacao (imovel_urbano_codigo,indice_atualizacao_codigo) values (1,9);
INSERT INTO imovel_urbano_indice_atualizacao (imovel_urbano_codigo,indice_atualizacao_codigo) values (1,12);