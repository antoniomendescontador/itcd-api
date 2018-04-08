package com.example.itcd.api.model.imovel.rural;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.example.itcd.api.model.declaracao.DeclarInventExtr;
import com.example.itcd.api.model.utils.Endereco;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "imovel_rural")
public class ImovelRural {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	@Column(name = "codigo_nirf")
	private String codigoNIRF;
	@Column(name = "codigo_incra")
	private String codigoINCRA;
	private String nome;
	@Column(name = "area_total")
	private BigDecimal areaTotal;// em ha-Hequitare
	@Column(name = "valor_terra_nua")
	private BigDecimal valorTerraNua;
	@Column(name = "valor_edificacao")
	private BigDecimal valorEdificacao;
	@Column(name = "valor_instalacao")
	private BigDecimal valorInstalacao;
	@Column(name = "valor_culturas")
	private BigDecimal valorCulturas;
	@Column(name = "valor_pastagem")
	private BigDecimal valorPastagem;
	@Column(name = "valor_floresta")
	private BigDecimal valorFloresta;
	@Embedded
	private Endereco endereco;
	@Column(name = "valor_avaliado_mt_quadr")
	private BigDecimal valorAvaliadoMetroQuad;
	@Column(name = "valor_declarado")
	private BigDecimal valorDeclarado;
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "declaracao_inventario_extrajudicial_id")
	private DeclarInventExtr declaracao;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getCodigoNIRF() {
		return codigoNIRF;
	}

	public void setCodigoNIRF(String codigoNIRF) {
		this.codigoNIRF = codigoNIRF;
	}

	public String getCodigoINCRA() {
		return codigoINCRA;
	}

	public void setCodigoINCRA(String codigoINCRA) {
		this.codigoINCRA = codigoINCRA;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getAreaTotal() {
		return areaTotal;
	}

	public void setAreaTotal(BigDecimal areaTotal) {
		this.areaTotal = areaTotal;
	}

	public BigDecimal getValorTerraNua() {
		return valorTerraNua;
	}

	public void setValorTerraNua(BigDecimal valorTerraNua) {
		this.valorTerraNua = valorTerraNua;
	}

	public BigDecimal getValorEdificacao() {
		return valorEdificacao;
	}

	public void setValorEdificacao(BigDecimal valorEdificacao) {
		this.valorEdificacao = valorEdificacao;
	}

	public BigDecimal getValorInstalacao() {
		return valorInstalacao;
	}

	public void setValorInstalacao(BigDecimal valorInstalacao) {
		this.valorInstalacao = valorInstalacao;
	}

	public BigDecimal getValorCulturas() {
		return valorCulturas;
	}

	public void setValorCulturas(BigDecimal valorCulturas) {
		this.valorCulturas = valorCulturas;
	}

	public BigDecimal getValorPastagem() {
		return valorPastagem;
	}

	public void setValorPastagem(BigDecimal valorPastagem) {
		this.valorPastagem = valorPastagem;
	}

	public BigDecimal getValorFloresta() {
		return valorFloresta;
	}

	public void setValorFloresta(BigDecimal valorFloresta) {
		this.valorFloresta = valorFloresta;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public BigDecimal getValorAvaliadoMetroQuad() {
		return valorAvaliadoMetroQuad;
	}

	public void setValorAvaliadoMetroQuad(BigDecimal valorAvaliadoMetroQuad) {
		this.valorAvaliadoMetroQuad = valorAvaliadoMetroQuad;
	}

	public BigDecimal getValorDeclarado() {
		return valorDeclarado;
	}

	public void setValorDeclarado(BigDecimal valorDeclarado) {
		this.valorDeclarado = valorDeclarado;
	}

	public DeclarInventExtr getDeclaracao() {
		return declaracao;
	}

	public void setDeclaracao(DeclarInventExtr declaracao) {
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
		ImovelRural other = (ImovelRural) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

}
