package com.github.Radu_A.proyecto_04.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.github.Radu_A.proyecto_04.entity.Articulo;
import com.github.Radu_A.proyecto_04.repository.IArticuloRepository;

@Service
public class ArticuloServiceImpl implements IArticuloService {
	
	private IArticuloRepository articuloRepository;

	public ArticuloServiceImpl(IArticuloRepository articuloRepository) {
		this.articuloRepository = articuloRepository;
	}

	@Override
	public List<Articulo> findAll() {
		return articuloRepository.findAll();
	}

	@Override
	public Articulo findById(Long id) {
		return articuloRepository.findById(id).orElse(null);
	}

	@Override
	public void deleteById(Long id) {
		articuloRepository.deleteById(id);
	}

	@Override
	public Articulo save(Articulo articulo) {
		return articuloRepository.save(articulo);
	}

}
