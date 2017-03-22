package com.tafarelmello.livraria.dao;

import javax.ejb.Stateless;

import com.tafarelmello.livraria.model.Estado;

@Stateless
public class EstadoDAO extends GenericDAO<Estado> {
	public EstadoDAO() {
		super(Estado.class);
	}
}
