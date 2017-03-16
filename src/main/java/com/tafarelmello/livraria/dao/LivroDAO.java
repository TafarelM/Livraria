package com.tafarelmello.livraria.dao;

import javax.ejb.Stateless;

import com.tafarelmello.livraria.model.Livro;

@Stateless
public class LivroDAO extends GenericDAO<Livro> {
	public LivroDAO(){
		super(Livro.class);
	}
}
