package com.tafarelmello.livraria.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Livro implements Serializable {
	private static final long serialVersionUID = 8986913023134064099L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty(message = "Titulo não pode ser vazio.")
	private String titulo;
	
	private Long IBSN;
	
	@DecimalMin(message = "Valor deve ser maior que 0", value = "0.0")
	private BigDecimal valor;
	
	@Min(value = 0, message = "A Quantidade de paginas deve ser maior que 0.")
	private int qtPaginas;
	
	private Boolean capadura;
	
	@Past(message = "A data deve ser menor que o dia atual.")
	private Date dataLancamento;

	@ManyToOne
	private Estado estado;

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

	public Date getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(Date dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

}
