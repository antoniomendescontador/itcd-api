package com.example.itcd.api.model;

import java.math.BigDecimal;

import javax.persistence.Embeddable;

@Embeddable
public class Iptu {

	private String iptu_inscricao;
	private BigDecimal iptu_terreno;
	private BigDecimal iptu_edificacao;
	private BigDecimal iptu_total;

	public String getIptu_inscricao() {
		return iptu_inscricao;
	}

	public void setIptu_inscricao(String iptu_inscricao) {
		this.iptu_inscricao = iptu_inscricao;
	}

	public BigDecimal getIptu_terreno() {
		return iptu_terreno;
	}

	public void setIptu_terreno(BigDecimal iptu_terreno) {
		this.iptu_terreno = iptu_terreno;
	}

	public BigDecimal getIptu_edificacao() {
		return iptu_edificacao;
	}

	public void setIptu_edificacao(BigDecimal iptu_edificacao) {
		this.iptu_edificacao = iptu_edificacao;
	}

	public BigDecimal getIptu_total() {
		return iptu_total;
	}

	public void setIptu_total(BigDecimal iptu_total) {
		this.iptu_total = iptu_total;
	}

}
