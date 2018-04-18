package com.example.itcd.api.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "semovente")
public class Semovente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	private String produto;
	private String unidade;
	@Column(name = "boletim_preco_minimo")
	private BigDecimal boletimPrecoMinimo;
	@Column(name = "valor_declarado")
	private BigDecimal valorDeclarado;
	private BigDecimal quantidade;
	@Column(name = "valor_total")
	private BigDecimal valorTotal;
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

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	public BigDecimal getBoletimPrecoMinimo() {
		return boletimPrecoMinimo;
	}

	public void setBoletimPrecoMinimo(BigDecimal boletimPrecoMinimo) {
		this.boletimPrecoMinimo = boletimPrecoMinimo;
	}

	public BigDecimal getValorDeclarado() {
		return valorDeclarado;
	}

	public void setValorDeclarado(BigDecimal valorDeclarado) {
		this.valorDeclarado = valorDeclarado;
	}

	public BigDecimal getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(BigDecimal quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
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
		Semovente other = (Semovente) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

}
