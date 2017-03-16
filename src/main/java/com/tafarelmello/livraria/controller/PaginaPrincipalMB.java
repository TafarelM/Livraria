package com.tafarelmello.livraria.controller;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import com.tafarelmello.livraria.dao.LivroDAO;

@ManagedBean
public class PaginaPrincipalMB implements Serializable {	
	private static final long serialVersionUID = -9134019514966308245L;	
	
	private String msg = "Olá Mundo";
	
	@EJB
	private LivroDAO livroDAO;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}	

}
