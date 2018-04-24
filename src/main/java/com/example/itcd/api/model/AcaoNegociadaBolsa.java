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
@Table(name = "acao_negociada_bolsa")
public class AcaoNegociadaBolsa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	private String nome;
	@Column(name = "codigo_acao")
	private String codigoAcao;
	private BigDecimal quantidade;
	@Column(name = "valor_avaliado")
	private BigDecimal valorAvaliado;
	@Column(name = "valor_declarado")
	private BigDecimal valorDeclarado;
	@Column(name = "valor_total")
	private BigDecimal valorTotal;
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "declaracao_inventario_extrajudicial_id")
	private InventarioExtrajudicial declaracao;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigoAcao() {
		return codigoAcao;
	}

	public void setCodigoAcao(String codigoAcao) {
		this.codigoAcao = codigoAcao;
	}

	public BigDecimal getValorDeclarado() {
		return valorDeclarado;
	}

	public void setValorDeclarado(BigDecimal valorDeclarado) {
		this.valorDeclarado = valorDeclarado;
	}

	public BigDecimal getValorAvaliado() {
		return valorAvaliado;
	}

	public void setValorAvaliado(BigDecimal valorAvaliado) {
		this.valorAvaliado = valorAvaliado;
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
		AcaoNegociadaBolsa other = (AcaoNegociadaBolsa) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

}
