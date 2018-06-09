package com.example.itcd.api.model;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "imovel_urbano")
public class ImovelUrbano {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	@Column(name = "metro_quadrado")
	private BigDecimal metroQuadrado;
	@Embedded
	private Propriedade propriedade;
	@Embedded
	private Iptu iptu;
	@Embedded
	private Endereco endereco;
	@Column(name = "valor_avaliado_iptu")
	private BigDecimal valorAvaliadoIptu;
	@Column(name = "valor_avaliado_cub")
	private BigDecimal valorAvaliadoCub;
	@Column(name = "valor_avaliado_mt_quadr")
	private BigDecimal valorAvaliadoMetroQuad;

	@ManyToMany
	@JoinTable(name = "imovel_urbano_indice_atualizacao", joinColumns = @JoinColumn(name = "imovel_urbano_codigo"), inverseJoinColumns = @JoinColumn(name = "indice_atualizacao_codigo"))
	private List<IndiceAtualizacao> indices;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "inventario_extrajudicial_id")
	private InventarioExtrajudicial declaracao;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public BigDecimal getMetroQuadrado() {
		return metroQuadrado;
	}

	public void setMetroQuadrado(BigDecimal metroQuadrado) {
		this.metroQuadrado = metroQuadrado;
	}

	public Propriedade getPropriedade() {
		return propriedade;
	}

	public void setPropriedade(Propriedade propriedade) {
		this.propriedade = propriedade;
	}

	public Iptu getIptu() {
		return iptu;
	}

	public void setIptu(Iptu iptu) {
		this.iptu = iptu;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public BigDecimal getValorAvaliadoIptu() {
		return valorAvaliadoIptu;
	}

	public void setValorAvaliadoIptu(BigDecimal valorAvaliadoIptu) {
		this.valorAvaliadoIptu = valorAvaliadoIptu;
	}

	public BigDecimal getValorAvaliadoCub() {
		return valorAvaliadoCub;
	}

	public void setValorAvaliadoCub(BigDecimal valorAvaliadoCub) {
		this.valorAvaliadoCub = valorAvaliadoCub;
	}

	public BigDecimal getValorAvaliadoMetroQuad() {
		return valorAvaliadoMetroQuad;
	}

	public void setValorAvaliadoMetroQuad(BigDecimal valorAvaliadoMetroQuad) {
		this.valorAvaliadoMetroQuad = valorAvaliadoMetroQuad;
	}

	public List<IndiceAtualizacao> getIndices() {
		return indices;
	}

	public void setIndices(List<IndiceAtualizacao> indices) {
		this.indices = indices;
	}

	public InventarioExtrajudicial getDeclaracao() {
		return declaracao;
	}

	public void setDeclaracao(InventarioExtrajudicial declaracao) {
		this.declaracao = declaracao;
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
		ImovelUrbano other = (ImovelUrbano) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

}
