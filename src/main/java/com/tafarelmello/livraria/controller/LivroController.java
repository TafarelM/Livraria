package com.tafarelmello.livraria.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import com.tafarelmello.livraria.dao.LivroDAO;
import com.tafarelmello.livraria.model.Livro;

@ManagedBean
public class LivroController implements Serializable {
	private static final long serialVersionUID = -5270301360621074754L;

	@EJB
	private LivroDAO livroDAO;

	private Livro livro;

	public List<Livro> getLivros() {
		return livroDAO.listarTodos();
	}

	@PostConstruct
	public void init() {
		livro = new Livro();
	}

	public void salvar() {
		livroDAO.salvar(livro);
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

}
