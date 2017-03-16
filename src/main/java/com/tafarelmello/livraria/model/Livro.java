package com.tafarelmello.livraria.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Livro implements Serializable {
	private static final long serialVersionUID = 8986913023134064099L;

	@Id
	private Long id;
	private String titulo;
	private Long IBSN;
	private BigDecimal valor;
	private int qtPaginas;
	private Boolean capadura;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Long getIBSN() {
		return IBSN;
	}

	public void setIBSN(Long iBSN) {
		IBSN = iBSN;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public int getQtPaginas() {
		return qtPaginas;
	}

	public void setQtPaginas(int qtPaginas) {
		this.qtPaginas = qtPaginas;
	}

	public Boolean getCapadura() {
		return capadura;
	}

	public void setCapadura(Boolean capadura) {
		this.capadura = capadura;
	}

}
