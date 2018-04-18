package com.example.itcd.api.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "contribuinte")
public class Contribuinte {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	@Embedded
	private Pessoa contribuinte;
	@Enumerated(EnumType.STRING)
	private TipoContribuinte tipo;
	@Embedded
	private Endereco endereco;
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "declaracao_inventario_extrajudicial_id", nullable = false)
	private DeclarInventExtr declaracao;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public Pessoa getContribuinte() {
		return contribuinte;
	}

	public void setContribuinte(Pessoa contribuinte) {
		this.contribuinte = contribuinte;
	}

	public TipoContribuinte getTipo() {
		return tipo;
	}

	public void setTipo(TipoContribuinte tipo) {
		this.tipo = tipo;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
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
		Contribuinte other = (Contribuinte) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

}
