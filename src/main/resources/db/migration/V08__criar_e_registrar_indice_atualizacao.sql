
CREATE TABLE indice_atualizacao (
	codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	
	fator VARCHAR(50) NOT NULL,
	subfator VARCHAR(50) NOT NULL,
	indice_atualiz_iptu DECIMAL(10,2) NOT NULL,
	indice_atualiz_cub DECIMAL(10,2) NOT NULL
	
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO indice_atualizacao (fator, subfator, indice_atualiz_iptu, indice_atualiz_cub) values ('terreno_topografia','plano',1.00,1.00);
INSERT INTO indice_atualizacao (fator, subfator, indice_atualiz_iptu, indice_atualiz_cub) values ('terreno_topografia','aclive',0.90,0.90);
INSERT INTO indice_atualizacao (fator, subfator, indice_atualiz_iptu, indice_atualiz_cub) values ('terreno_topografia','declive',0.80,0.80);
INSERT INTO indice_atualizacao (fator, subfator, indice_atualiz_iptu, indice_atualiz_cub) values ('terreno_topografia','irregular',0.70,0.70);

INSERT INTO indice_atualizacao (fator, subfator, indice_atualiz_iptu, indice_atualiz_cub) values ('terreno_pedologia','inundável',0.95,0.95);
INSERT INTO indice_atualizacao (fator, subfator, indice_atualiz_iptu, indice_atualiz_cub) values ('terreno_pedologia','firme',1.00,1.00);
INSERT INTO indice_atualizacao (fator, subfator, indice_atualiz_iptu, indice_atualiz_cub) values ('terreno_pedologia','alagado',0.90,0.90);

INSERT INTO indice_atualizacao (fator, subfator, indice_atualiz_iptu,indice_atualiz_cub) values ('terreno_posicao','meio da quadra',1.00,1.00);
INSERT INTO indice_atualizacao (fator, subfator, indice_atualiz_iptu,indice_atualiz_cub) values ('terreno_posicao','esquina',1.10,1.10);
INSERT INTO indice_atualizacao (fator, subfator, indice_atualiz_iptu,indice_atualiz_cub) values ('terreno_posicao','vila',1.00,1.00);
INSERT INTO indice_atualizacao (fator, subfator, indice_atualiz_iptu,indice_atualiz_cub) values ('terreno_posicao','encravado',0.95,0.95);

INSERT INTO indice_atualizacao (fator, subfator, indice_atualiz_iptu,indice_atualiz_cub) values ('construcao_posicao','isolada',1.00,1.40);
INSERT INTO indice_atualizacao (fator, subfator, indice_atualiz_iptu,indice_atualiz_cub) values ('construcao_posicao','conjugada',0.95,1.30);
INSERT INTO indice_atualizacao (fator, subfator, indice_atualiz_iptu,indice_atualiz_cub) values ('construcao_posicao','germinada',0.95,1.20);

INSERT INTO indice_atualizacao (fator, subfator, indice_atualiz_iptu,indice_atualiz_cub) values ('quantidade_pavimento','0 a 1',1.00,1.20);
INSERT INTO indice_atualizacao (fator, subfator, indice_atualiz_iptu,indice_atualiz_cub) values ('quantidade_pavimento','2 a 3',1.10,1.60);
INSERT INTO indice_atualizacao (fator, subfator, indice_atualiz_iptu,indice_atualiz_cub) values ('quantidade_pavimento','4 a 5',1.20,1.80);
INSERT INTO indice_atualizacao (fator, subfator, indice_atualiz_iptu,indice_atualiz_cub) values ('quantidade_pavimento','6 a 8',1.30,2.00);
INSERT INTO indice_atualizacao (fator, subfator, indice_atualiz_iptu,indice_atualiz_cub) values ('quantidade_pavimento','9 a 12',1.60,2.20);
INSERT INTO indice_atualizacao (fator, subfator, indice_atualiz_iptu,indice_atualiz_cub) values ('quantidade_pavimento','13 ou mais',1.90,2.40);

INSERT INTO indice_atualizacao (fator, subfator, indice_atualiz_iptu,indice_atualiz_cub) values ('depreciacao','0 a 5',1.00,1.00);
INSERT INTO indice_atualizacao (fator, subfator, indice_atualiz_iptu,indice_atualiz_cub) values ('depreciacao','6 a 10',0.95,1.00);
INSERT INTO indice_atualizacao (fator, subfator, indice_atualiz_iptu,indice_atualiz_cub) values ('depreciacao','11 a 15',0.90,0.98);
INSERT INTO indice_atualizacao (fator, subfator, indice_atualiz_iptu,indice_atualiz_cub) values ('depreciacao','16 ou mais',0.85,0.95);

INSERT INTO indice_atualizacao (fator, subfator, indice_atualiz_iptu,indice_atualiz_cub) values ('estrutura','aço',1.20,1.30);
INSERT INTO indice_atualizacao (fator, subfator, indice_atualiz_iptu,indice_atualiz_cub) values ('estrutura','madeira',0.95,1.00);
INSERT INTO indice_atualizacao (fator, subfator, indice_atualiz_iptu,indice_atualiz_cub) values ('estrutura','alvenaria',1.10,1.30);
INSERT INTO indice_atualizacao (fator, subfator, indice_atualiz_iptu,indice_atualiz_cub) values ('estrutura','concreto',1.00,1.40);
INSERT INTO indice_atualizacao (fator, subfator, indice_atualiz_iptu,indice_atualiz_cub) values ('estrutura','combinacao dos demais',1.00,1.40);
INSERT INTO indice_atualizacao (fator, subfator, indice_atualiz_iptu,indice_atualiz_cub) values ('estrutura','outras',1.00,1.40);

INSERT INTO indice_atualizacao (fator, subfator, indice_atualiz_iptu,indice_atualiz_cub) values ('quantidade_garagem','não possui',1.00,1.00);
INSERT INTO indice_atualizacao (fator, subfator, indice_atualiz_iptu,indice_atualiz_cub) values ('quantidade_garagem','1',1.10,1.30);
INSERT INTO indice_atualizacao (fator, subfator, indice_atualiz_iptu,indice_atualiz_cub) values ('quantidade_garagem','2',1.15,1.35);
INSERT INTO indice_atualizacao (fator, subfator, indice_atualiz_iptu,indice_atualiz_cub) values ('quantidade_garagem','3',1.20,1.45);
INSERT INTO indice_atualizacao (fator, subfator, indice_atualiz_iptu,indice_atualiz_cub) values ('quantidade_garagem','4 ou mais',1.40,1.55);

INSERT INTO indice_atualizacao (fator, subfator, indice_atualiz_iptu,indice_atualiz_cub) values ('tipo_piso','vinilico',1.10,1.50);
INSERT INTO indice_atualizacao (fator, subfator, indice_atualiz_iptu,indice_atualiz_cub) values ('tipo_piso','taco',1.10,1.50);
INSERT INTO indice_atualizacao (fator, subfator, indice_atualiz_iptu,indice_atualiz_cub) values ('tipo_piso','madeira',1.00,1.00);
INSERT INTO indice_atualizacao (fator, subfator, indice_atualiz_iptu,indice_atualiz_cub) values ('tipo_piso','cimento',1.00,1.50);
INSERT INTO indice_atualizacao (fator, subfator, indice_atualiz_iptu,indice_atualiz_cub) values ('tipo_piso','laminado',1.10,1.30);
INSERT INTO indice_atualizacao (fator, subfator, indice_atualiz_iptu,indice_atualiz_cub) values ('tipo_piso','porcelana',1.10,1.30);
INSERT INTO indice_atualizacao (fator, subfator, indice_atualiz_iptu,indice_atualiz_cub) values ('tipo_piso','ceramica',1.00,1.30);
INSERT INTO indice_atualizacao (fator, subfator, indice_atualiz_iptu,indice_atualiz_cub) values ('tipo_piso','combinação dos demais',1.10,1.30);

INSERT INTO indice_atualizacao (fator, subfator, indice_atualiz_iptu,indice_atualiz_cub) values ('conservacao','bom',1.05,1.30);
INSERT INTO indice_atualizacao (fator, subfator, indice_atualiz_iptu,indice_atualiz_cub) values ('conservacao','regular',1.00,1.20);
INSERT INTO indice_atualizacao (fator, subfator, indice_atualiz_iptu,indice_atualiz_cub) values ('conservacao','mal',0.98,1.00);

INSERT INTO indice_atualizacao (fator, subfator, indice_atualiz_iptu,indice_atualiz_cub) values ('piscina','sim',1.20,1.40);
INSERT INTO indice_atualizacao (fator, subfator, indice_atualiz_iptu,indice_atualiz_cub) values ('piscina','não',1.00,1.00);

INSERT INTO indice_atualizacao (fator, subfator, indice_atualiz_iptu,indice_atualiz_cub) values ('quantidade_quartos','1',1.00,1.00);
INSERT INTO indice_atualizacao (fator, subfator, indice_atualiz_iptu,indice_atualiz_cub) values ('quantidade_quartos','2',1.10,1.30);
INSERT INTO indice_atualizacao (fator, subfator, indice_atualiz_iptu,indice_atualiz_cub) values ('quantidade_quartos','3',1.20,1.60);
INSERT INTO indice_atualizacao (fator, subfator, indice_atualiz_iptu,indice_atualiz_cub) values ('quantidade_quartos','4 ou mais',1.40,1.80);

INSERT INTO indice_atualizacao (fator, subfator, indice_atualiz_iptu,indice_atualiz_cub) values ('CUB_inicial','unifamiliar',1.00,1310.47);
INSERT INTO indice_atualizacao (fator, subfator, indice_atualiz_iptu,indice_atualiz_cub) values ('CUB_inicial','multifamiliar',1.00,1206.39);
INSERT INTO indice_atualizacao (fator, subfator, indice_atualiz_iptu,indice_atualiz_cub) values ('CUB_inicial','comercial',1.00,1206.39);

INSERT INTO indice_atualizacao (fator, subfator, indice_atualiz_iptu,indice_atualiz_cub) values ('coeficiente_atualizacao_iptu','Belem', 3.19, 3.19);
INSERT INTO indice_atualizacao (fator, subfator, indice_atualiz_iptu,indice_atualiz_cub) values ('coeficiente_atualizacao_iptu','Interior', 6.00, 6.00);

INSERT INTO indice_atualizacao (fator, subfator, indice_atualiz_iptu,indice_atualiz_cub) values ('valor_metro_quadrado','Belem', 400.00, 400.00);
INSERT INTO indice_atualizacao (fator, subfator, indice_atualiz_iptu,indice_atualiz_cub) values ('valor_metro_quadrado','Interior', 200.00, 200.00);






