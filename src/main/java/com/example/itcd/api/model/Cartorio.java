package com.example.itcd.api.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "cartorio")
public class Cartorio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	private String nome_cartorio;
	private String cnpj;
	private String oficio;
	private String comarca;
	private Boolean ativo;
	private String observacao;
	@Embedded
	private Pessoa oficialTitular;
	@Embedded
	private Endereco endereco;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "declaracao_inventario_extrajudicial_id", nullable = true)
	private DeclarInventExtr declaracao;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getOficio() {
		return oficio;
	}

	public void setOficio(String oficio) {
		this.oficio = oficio;
	}

	public String getNome_cartorio() {
		return nome_cartorio;
	}

	public void setNome_cartorio(String nome_cartorio) {
		this.nome_cartorio = nome_cartorio;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getComarca() {
		return comarca;
	}

	public void setComarca(String comarca) {
		this.comarca = comarca;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Pessoa getOficialTitular() {
		return oficialTitular;
	}

	public void setOficialTitular(Pessoa oficialTitular) {
		this.oficialTitular = oficialTitular;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
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
		Cartorio other = (Cartorio) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

}
