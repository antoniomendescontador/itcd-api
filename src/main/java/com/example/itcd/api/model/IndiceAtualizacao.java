package com.example.itcd.api.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "indice_atualizacao")
public class IndiceAtualizacao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	private String fator;
	private String subfator;
	@Column(name = "indice_atualiz_iptu")
	private BigDecimal indiceAtualizIptu;
	@Column(name = "indice_atualiz_cub")
	private BigDecimal indiceAtualizCub;

	@JsonIgnore
	@ManyToMany
	@JoinTable(name = "imovel_urbano_indice_atualizacao", joinColumns = @JoinColumn(name = "indice_atualizacao_codigo"), inverseJoinColumns = @JoinColumn(name = "imovel_urbano_codigo"))
	private List<ImovelUrbano> imovelUrbanos = new ArrayList<>();

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getFator() {
		return fator;
	}

	public void setFator(String fator) {
		this.fator = fator;
	}

	public String getSubfator() {
		return subfator;
	}

	public void setSubfator(String subfator) {
		this.subfator = subfator;
	}

	public BigDecimal getIndiceAtualizIptu() {
		return indiceAtualizIptu;
	}

	public void setIndiceAtualizIptu(BigDecimal indiceAtualizIptu) {
		this.indiceAtualizIptu = indiceAtualizIptu;
	}

	public BigDecimal getIndiceAtualizCub() {
		return indiceAtualizCub;
	}

	public void setIndiceAtualizCub(BigDecimal indiceAtualizCub) {
		this.indiceAtualizCub = indiceAtualizCub;
	}

	public List<ImovelUrbano> getImovelUrbanos() {
		return imovelUrbanos;
	}

	public void setImovelUrbanos(List<ImovelUrbano> imovelUrbanos) {
		this.imovelUrbanos = imovelUrbanos;
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
		IndiceAtualizacao other = (IndiceAtualizacao) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

}
