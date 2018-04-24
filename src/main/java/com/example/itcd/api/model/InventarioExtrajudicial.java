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
@Table(name = "declaracao_inventario_extrajudicial")
public class InventarioExtrajudicial {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	private String identificacao;

	@ManyToOne
	@JoinColumn(name="cartorio_id")
	private Cartorio cartorio;

	@OneToMany(mappedBy = "declaracao", cascade = CascadeType.ALL)
	private List<Contribuinte> contribuinte = new ArrayList<>();

	@OneToMany(mappedBy = "declaracao", cascade = CascadeType.ALL)
	private List<ImovelUrbano> imoveUrbano = new ArrayList<>();

	@OneToMany(mappedBy = "declaracao", cascade = CascadeType.ALL)
	private List<ImovelRural> imovelRural = new ArrayList<>();

	@OneToMany(mappedBy = "declaracao", cascade = CascadeType.ALL)
	private List<Veiculo> veiculo = new ArrayList<>();

	@OneToMany(mappedBy = "declaracao", cascade = CascadeType.ALL)
	private List<Semovente> semovente = new ArrayList<>();

	@OneToMany(mappedBy = "declaracao", cascade = CascadeType.ALL)
	private List<AcaoNaoNegociadaBolsa> acaoNaoNegociadaBolsa = new ArrayList<>();

	@OneToMany(mappedBy = "declaracao", cascade = CascadeType.ALL)
	private List<AcaoNegociadaBolsa> acaoNegociadaBolsa = new ArrayList<>();

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

	public List<Contribuinte> getContribuinte() {
		return contribuinte;
	}

	public void setContribuinte(List<Contribuinte> contribuinte) {
		this.contribuinte = contribuinte;
	}

	public List<ImovelUrbano> getImoveUrbano() {
		return imoveUrbano;
	}

	public void setImoveUrbano(List<ImovelUrbano> imoveUrbano) {
		this.imoveUrbano = imoveUrbano;
	}

	public List<ImovelRural> getImovelRural() {
		return imovelRural;
	}

	public void setImovelRural(List<ImovelRural> imovelRural) {
		this.imovelRural = imovelRural;
	}

	public List<Veiculo> getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(List<Veiculo> veiculo) {
		this.veiculo = veiculo;
	}

	public List<Semovente> getSemovente() {
		return semovente;
	}

	public void setSemovente(List<Semovente> semovente) {
		this.semovente = semovente;
	}

	public List<AcaoNaoNegociadaBolsa> getAcaoNaoNegociadaBolsa() {
		return acaoNaoNegociadaBolsa;
	}

	public void setAcaoNaoNegociadaBolsa(List<AcaoNaoNegociadaBolsa> acaoNaoNegociadaBolsa) {
		this.acaoNaoNegociadaBolsa = acaoNaoNegociadaBolsa;
	}

	public List<AcaoNegociadaBolsa> getAcaoNegociadaBolsa() {
		return acaoNegociadaBolsa;
	}

	public void setAcaoNegociadaBolsa(List<AcaoNegociadaBolsa> acaoNegociadaBolsa) {
		this.acaoNegociadaBolsa = acaoNegociadaBolsa;
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
