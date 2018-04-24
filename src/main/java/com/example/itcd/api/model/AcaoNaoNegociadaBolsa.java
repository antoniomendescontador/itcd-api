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
@Table(name = "acao_nao_negociada_bolsa")
public class AcaoNaoNegociadaBolsa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	@Column(name = "quantidade_total")
	private BigDecimal quantidadeTotal;
	@Column(name = "quantidade_transmitida")
	private BigDecimal quantidadeTransmitida;
	@Column(name = "valor_ativo_total")
	private BigDecimal valorAtivoTotal;
	@Column(name = "valor_passivo_exigivel")
	private BigDecimal valorPassivoExigivel;
	@Column(name = "valor_patrimonio_liquido")
	private BigDecimal valorPatrimLiquido;
	@Column(name = "valor_avaliado")
	private BigDecimal valorAvaliado;
	@Column(name = "valor_declarado")
	private BigDecimal valorDeclarado;
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

	public BigDecimal getQuantidadeTotal() {
		return quantidadeTotal;
	}

	public void setQuantidadeTotal(BigDecimal quantidadeTotal) {
		this.quantidadeTotal = quantidadeTotal;
	}

	public BigDecimal getQuantidadeTransmitida() {
		return quantidadeTransmitida;
	}

	public void setQuantidadeTransmitida(BigDecimal quantidadeTransmitida) {
		this.quantidadeTransmitida = quantidadeTransmitida;
	}

	public BigDecimal getValorAtivoTotal() {
		return valorAtivoTotal;
	}

	public void setValorAtivoTotal(BigDecimal valorAtivoTotal) {
		this.valorAtivoTotal = valorAtivoTotal;
	}

	public BigDecimal getValorPassivoExigivel() {
		return valorPassivoExigivel;
	}

	public void setValorPassivoExigivel(BigDecimal valorPassivoExigivel) {
		this.valorPassivoExigivel = valorPassivoExigivel;
	}

	public BigDecimal getValorPatrimLiquido() {
		return valorPatrimLiquido;
	}

	public void setValorPatrimLiquido(BigDecimal valorPatrimLiquido) {
		this.valorPatrimLiquido = valorPatrimLiquido;
	}

	public BigDecimal getValorAvaliado() {
		return valorAvaliado;
	}

	public void setValorAvaliado(BigDecimal valorAvaliado) {
		this.valorAvaliado = valorAvaliado;
	}

	public BigDecimal getValorDeclarado() {
		return valorDeclarado;
	}

	public void setValorDeclarado(BigDecimal valorDeclarado) {
		this.valorDeclarado = valorDeclarado;
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
		AcaoNaoNegociadaBolsa other = (AcaoNaoNegociadaBolsa) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

}
