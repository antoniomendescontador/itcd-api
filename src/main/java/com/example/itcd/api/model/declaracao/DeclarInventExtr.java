package com.example.itcd.api.model.declaracao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.example.itcd.api.model.cartorio.Cartorio;
import com.example.itcd.api.model.imovel.rural.ImovelRural;
import com.example.itcd.api.model.imovel.urbano.ImovelUrbano;
import com.example.itcd.api.model.movel.AcaoNaoNegociadaBolsa;
import com.example.itcd.api.model.movel.AcaoNegociadaBolsa;
import com.example.itcd.api.model.movel.Semovente;
import com.example.itcd.api.model.movel.Veiculo;
import com.example.itcd.api.model.partes.Contribuinte;

@Entity
@Table(name = "declaracao_inventario_extrajudicial")
public class DeclarInventExtr {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	private String identificacao;

	@OneToMany(mappedBy = "declaracao", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Cartorio> cartorios;

	@OneToMany(mappedBy = "declaracao", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Contribuinte> contribuinte = new ArrayList<>();

	@OneToMany(mappedBy = "declaracao", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<ImovelUrbano> imoveUrbano = new ArrayList<>();

	@OneToMany(mappedBy = "declaracao", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<ImovelRural> imovelRural = new ArrayList<>();

	@OneToMany(mappedBy = "declaracao", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Veiculo> veiculo = new ArrayList<>();

	@OneToMany(mappedBy = "declaracao", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Semovente> semovente = new ArrayList<>();

	@OneToMany(mappedBy = "declaracao", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<AcaoNaoNegociadaBolsa> acaoNaoNegociadaBolsa = new ArrayList<>();

	@OneToMany(mappedBy = "declaracao", cascade = CascadeType.ALL, orphanRemoval = true)
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

	public List<Cartorio> getCartorios() {
		return cartorios;
	}

	public void setCartorios(List<Cartorio> cartorios) {
		this.cartorios = cartorios;
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
		DeclarInventExtr other = (DeclarInventExtr) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

}