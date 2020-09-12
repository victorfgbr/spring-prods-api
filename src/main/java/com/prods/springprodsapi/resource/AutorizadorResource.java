package com.prods.springprodsapi.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prods.springprodsapi.model.Autorizador;
import com.prods.springprodsapi.repository.AutorizadorRepository;

@RestController
@RequestMapping(value="/autorizador")
public class AutorizadorResource {

	@Autowired
	AutorizadorRepository autorizadorRepository;
	
	@GetMapping
	public List<Autorizador> list () {
		return autorizadorRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Autorizador read (@PathVariable(value="id") long id) {
		return autorizadorRepository.findById(id);
	}
	
	@PostMapping
	public Autorizador save (@RequestBody Autorizador autorizador) {
		return autorizadorRepository.save(autorizador);
	}
	
	@DeleteMapping("/{id}")
	public void delete (@PathVariable(value="id") long id) {
		autorizadorRepository.deleteById(id);
	}
}
