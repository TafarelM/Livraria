package com.tafarelmello.livraria.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.tafarelmello.livraria.dao.LivroDAO;
import com.tafarelmello.livraria.model.Livro;

@Named
@ViewScoped
public class LivroController implements Serializable {
	private static final long serialVersionUID = -5270301360621074754L;

	@Inject
	private LivroDAO livroDAO;

	private Livro livro;

	@PostConstruct
	public void init() {
		livro = new Livro();
	}

	public List<Livro> getLivros() {
		return livroDAO.listarTodos();
	}

	public void salvar() {

		try {
			livroDAO.salvar(livro);

			livro = new Livro();

			FacesContext.getCurrentInstance().addMessage("",
					new FacesMessage("Salvo com sucesso.", "Salvo com sucesso"));
		} catch (RuntimeException erro) {
			FacesContext.getCurrentInstance().addMessage("",
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro ao Salvar.", "Erro ao Salvar"));
		}
	}

	public void editar() {
		FacesContext.getCurrentInstance().addMessage("",
				new FacesMessage("Não implementado.", "Não implementado"));
	}
	
	public void excluir(){
		FacesContext.getCurrentInstance().addMessage("",
				new FacesMessage("Não implementado.", "Não implementado"));
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

}
