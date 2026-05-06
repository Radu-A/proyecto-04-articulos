package com.github.Radu_A.proyecto_04.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.Radu_A.proyecto_04.entity.Articulo;
import com.github.Radu_A.proyecto_04.service.IArticuloService;

@Controller
@RequestMapping("/articulos")
public class ArticuloController {
	
	private IArticuloService articuloService;
	
	public ArticuloController(IArticuloService articuloService) {
		this.articuloService = articuloService;
	}

	@ModelAttribute("titulo")
	private String titulo() {
		return "Articulos";
	}
	
	@GetMapping("/listado")
	public String listado(Model model) {
		model.addAttribute("cabecera", "Listado de articulos");
		model.addAttribute("articulos", articuloService.findAll());
		model.addAttribute("accion1", "Detalles");
		model.addAttribute("accion2", "Borrar");
		model.addAttribute("accion3", "Actualizar");
		return "articulos/listado";
	}
	
	@GetMapping("/detalles/{id}")
	public String findById(Model model, @PathVariable Long id) {
		model.addAttribute("cabecera", "Detalles del artículo");
		model.addAttribute("articulo", articuloService.findById(id));
		return "articulos/detalles";
	}
	
	@GetMapping("/borrar/{id}")
	public String deleteById(Model model, @PathVariable Long id) {
		articuloService.deleteById(id);
		return "redirect:/articulos/listado";
	}
	
	@GetMapping("/form/{id}")
	public String actualizar(Model model, @PathVariable Long id) {
		Articulo articulo = articuloService.findById(id);
		model.addAttribute("cabecera", "Editar");
		model.addAttribute("articulo", articulo);
		model.addAttribute("boton", "Actualizar");
		return "articulos/form";
	}
	
	@PostMapping("/guardar")
	public String guardar(Articulo articulo) {
		articuloService.save(articulo);
		return "redirect:/articulos/listado";
	}
	
	@GetMapping("/nuevo")
	public String nuevo(Model model) {
		model.addAttribute("cabecera", "Crear nuevo cliente");
		model.addAttribute("articulo", new Articulo());
		model.addAttribute("boton", "Crear nuevo");
		return "articulos/form";
	}
}
