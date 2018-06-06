package com.example.itcd.api.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.itcd.api.model.AcaoNaoNegociadaBolsa;
import com.example.itcd.api.model.AcaoNegociadaBolsa;
import com.example.itcd.api.model.Contribuinte;
import com.example.itcd.api.model.ImovelRural;
import com.example.itcd.api.model.ImovelUrbano;
import com.example.itcd.api.model.InventarioExtrajudicial;
import com.example.itcd.api.model.Semovente;
import com.example.itcd.api.model.Veiculo;
import com.example.itcd.api.repository.InventarioExtrajudicialRepository;

@Service
public class InventarioExtrajudicialService {

	@Autowired
	private InventarioExtrajudicialRepository repo;
	
	public InventarioExtrajudicial find(Long codigo) {
		InventarioExtrajudicial obj = repo.findOne(codigo);
		return obj;
	}

	public InventarioExtrajudicial insert(InventarioExtrajudicial inventario) {
		for (Contribuinte contribuinte : inventario.getContribuintes()){
			contribuinte.setDeclaracao(inventario);
		}
		for (ImovelUrbano imovelUrbano : inventario.getImoveisUrbanos()){
			imovelUrbano.setDeclaracao(inventario);
			}
					
		for(ImovelRural imovelRural : inventario.getImoveisRurais()){
			imovelRural.setDeclaracao(inventario);
		}
		for(Veiculo veiculo : inventario.getVeiculos()){
			veiculo.setDeclaracao(inventario);
		}
		for(Semovente semovente : inventario.getSemoventes()){
			semovente.setDeclaracao(inventario);
		}
		for(AcaoNaoNegociadaBolsa acaoNaoNegociada : inventario.getAcaoNaoNegociadaBolsas()){
			acaoNaoNegociada.setDeclaracao(inventario);
		}
		for(AcaoNegociadaBolsa acaoNegociadaBolsa : inventario.getAcaoNegociadaBolsas()){
			acaoNegociadaBolsa.setDeclaracao(inventario);
		}
		repo.save(inventario);
				
		return inventario;
	}
	
	public InventarioExtrajudicial atualizar(Long codigo, InventarioExtrajudicial inventario) {
		InventarioExtrajudicial inventarioSalvo = find(codigo);
		BeanUtils.copyProperties(inventario, inventarioSalvo, "codigo");
		for (Contribuinte contribuinte : inventarioSalvo.getContribuintes()){
			contribuinte.setDeclaracao(inventarioSalvo);
		}
		for (ImovelUrbano imovelUrbano : inventarioSalvo.getImoveisUrbanos()){
			imovelUrbano.setDeclaracao(inventarioSalvo);
			}
					
		for(ImovelRural imovelRural : inventarioSalvo.getImoveisRurais()){
			imovelRural.setDeclaracao(inventarioSalvo);
		}
		for(Veiculo veiculo : inventarioSalvo.getVeiculos()){
			veiculo.setDeclaracao(inventarioSalvo);
		}
		for(Semovente semovente : inventarioSalvo.getSemoventes()){
			semovente.setDeclaracao(inventarioSalvo);
		}
		for(AcaoNaoNegociadaBolsa acaoNaoNegociada : inventarioSalvo.getAcaoNaoNegociadaBolsas()){
			acaoNaoNegociada.setDeclaracao(inventarioSalvo);
		}
		for(AcaoNegociadaBolsa acaoNegociadaBolsa : inventarioSalvo.getAcaoNegociadaBolsas()){
			acaoNegociadaBolsa.setDeclaracao(inventarioSalvo);
		}
		return repo.save(inventarioSalvo);
	}
	
	
}
