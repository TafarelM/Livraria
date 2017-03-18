package com.tafarelmello.livraria.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import com.tafarelmello.livraria.dao.LivroDAO;
import com.tafarelmello.livraria.model.Livro;

@ManagedBean
@ViewScoped
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

		try {
			livroDAO.salvar(livro);

			livro = new Livro();
			
			FacesContext.getCurrentInstance().addMessage("", new FacesMessage("Editado com sucesso.", "Editado com sucesso"));
		} catch (RuntimeException erro) {
			FacesContext.getCurrentInstance().addMessage("", new FacesMessage(FacesMessage.SEVERITY_ERROR,
					"Erro ao editar.", "Erro ao edita"));
		}
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

}
