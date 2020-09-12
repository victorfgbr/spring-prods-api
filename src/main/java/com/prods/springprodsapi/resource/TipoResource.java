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

import com.prods.springprodsapi.model.Tipo;
import com.prods.springprodsapi.repository.TipoRepository;


@RestController
@RequestMapping(value="/tipo")
public class TipoResource {
	
	@Autowired
	TipoRepository tipoRepository;
	
	@GetMapping
	public List<Tipo> list () {
		return tipoRepository.findAll();
	}

	@GetMapping("/{id}")
	public Tipo read (@PathVariable(value="id") long id) {
		return tipoRepository.findById(id);
	}
	
	@PostMapping
	public Tipo save (@RequestBody Tipo tipo) {
		return tipoRepository.save(tipo);
	}
	
	@DeleteMapping("/{id}")
	public void delete (@PathVariable(value="id") long id) {
		tipoRepository.deleteById(id);
	}
}
