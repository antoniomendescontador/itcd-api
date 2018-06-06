package com.example.itcd.api.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "inventario_extrajudicial")
public class InventarioExtrajudicial {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	private String identificacao;
	
	@ManyToOne
	@JoinColumn(name="cartorio_id")
	private Cartorio cartorio;

	@OneToMany(mappedBy = "declaracao", cascade = CascadeType.ALL)
	private List<Contribuinte> contribuintes = new ArrayList<>();

	@OneToMany(mappedBy = "declaracao", cascade = CascadeType.ALL)
	private List<ImovelUrbano> imoveisUrbanos = new ArrayList<>();

	@OneToMany(mappedBy = "declaracao", cascade = CascadeType.ALL)
	private List<ImovelRural> imoveisRurais = new ArrayList<>();

	@OneToMany(mappedBy = "declaracao", cascade = CascadeType.ALL)
	private List<Veiculo> veiculos = new ArrayList<>();

	@OneToMany(mappedBy = "declaracao", cascade = CascadeType.ALL)
	private List<Semovente> semoventes = new ArrayList<>();

	@OneToMany(mappedBy = "declaracao", cascade = CascadeType.ALL)
	private List<AcaoNaoNegociadaBolsa> acaoNaoNegociadaBolsas = new ArrayList<>();

	@OneToMany(mappedBy = "declaracao", cascade = CascadeType.ALL)
	private List<AcaoNegociadaBolsa> acaoNegociadaBolsas = new ArrayList<>();

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getIdentificacao() {
		return identificacao;
	}

	public void setIdentificacao(String identificacao) {
		this.identificacao = identificacao;
	}

	public Cartorio getCartorio() {
		return cartorio;
	}
	
	public void setCartorio(Cartorio cartorio) {
		this.cartorio = cartorio;
	}

	public List<Contribuinte> getContribuintes() {
		return contribuintes;
	}
	
	public void setContribuintes(List<Contribuinte> contribuintes) {
		this.contribuintes = contribuintes;
	}

	public List<ImovelUrbano> getImoveisUrbanos() {
		return imoveisUrbanos;
	}

	public void setImoveisUrbanos(List<ImovelUrbano> imoveisUrbanos) {
		this.imoveisUrbanos = imoveisUrbanos;
	}

	public List<ImovelRural> getImoveisRurais() {
		return imoveisRurais;
	}

	public void setImoveisRurais(List<ImovelRural> imoveisRurais) {
		this.imoveisRurais = imoveisRurais;
	}

	public List<Veiculo> getVeiculos() {
		return veiculos;
	}

	public void setVeiculos(List<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}

	public List<Semovente> getSemoventes() {
		return semoventes;
	}

	public void setSemoventes(List<Semovente> semoventes) {
		this.semoventes = semoventes;
	}

	public List<AcaoNaoNegociadaBolsa> getAcaoNaoNegociadaBolsas() {
		return acaoNaoNegociadaBolsas;
	}

	public void setAcaoNaoNegociadaBolsas(List<AcaoNaoNegociadaBolsa> acaoNaoNegociadaBolsas) {
		this.acaoNaoNegociadaBolsas = acaoNaoNegociadaBolsas;
	}

	public List<AcaoNegociadaBolsa> getAcaoNegociadaBolsas() {
		return acaoNegociadaBolsas;
	}

	public void setAcaoNegociadaBolsas(List<AcaoNegociadaBolsa> acaoNegociadaBolsas) {
		this.acaoNegociadaBolsas = acaoNegociadaBolsas;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InventarioExtrajudicial other = (InventarioExtrajudicial) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

}
