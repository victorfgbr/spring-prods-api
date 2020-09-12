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

import com.prods.springprodsapi.model.Bandeira;
import com.prods.springprodsapi.repository.BandeiraRepository;

@RestController
@RequestMapping(value="/bandeira")
public class BandeiraResource {
	
	@Autowired
	BandeiraRepository bandeiraRepository;
	
	@GetMapping
	public List<Bandeira> list () {
		return bandeiraRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Bandeira read (@PathVariable(value="id") long id) {
		return bandeiraRepository.findById(id);
	}
	
	@PostMapping
	public Bandeira save (@RequestBody Bandeira bandeira) {
		return bandeiraRepository.save(bandeira);
	}
	
	@DeleteMapping("/{id}")
	public void delete (@PathVariable(value="id") long id) {
		bandeiraRepository.deleteById(id);
	}
}
