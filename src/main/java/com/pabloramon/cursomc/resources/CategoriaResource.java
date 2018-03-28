package com.pabloramon.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pabloramon.cursomc.domain.Categoria;
import com.pabloramon.cursomc.services.CategoriaService;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
	@Autowired
	private CategoriaService service;
	
	@RequestMapping (value="/{id}", method=RequestMethod.GET)
	public	ResponseEntity<?> find(@PathVariable Integer id) {
		Categoria obj = service.buscar(id);
		
//		Categoria cat1 = new Categoria(1, "Informática");
//		Categoria cat2 = new Categoria(2, "Escritório");
//		
//		List<Categoria> lista = new ArrayList<>();
//		lista.add(cat1);
//		lista.add(cat2);
		return ResponseEntity.ok().body(obj);
	}
}

//A annotation @PathVariable p/que o Id da URL 'value=/{id}' vá para o ID da variável 