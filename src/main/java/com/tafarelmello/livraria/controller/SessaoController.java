package com.tafarelmello.livraria.controller;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named
@SessionScoped
public class SessaoController implements Serializable {

	private static final long serialVersionUID = 5443211930746769005L;

	private String usuario;
	private String senha;

	public void login() {
		if (usuario.equalsIgnoreCase("teste") && senha.equals("1234")) {
			FacesContext.getCurrentInstance().addMessage("", new FacesMessage("Usuario logado", "Usuario logado"));
		} else {
			FacesContext.getCurrentInstance().addMessage("", new FacesMessage(FacesMessage.SEVERITY_ERROR,
					"Usuario e senha errados", "Usuario e senha errados"));
		}
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
