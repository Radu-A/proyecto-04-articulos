package com.github.Radu_A.proyecto_04.service;

import java.util.List;

import com.github.Radu_A.proyecto_04.entity.Articulo;

public interface IArticuloService {

	List<Articulo> findAll();
	Articulo findById(Long id);
	void deleteById(Long id);
	Articulo save(Articulo articulo);
}
