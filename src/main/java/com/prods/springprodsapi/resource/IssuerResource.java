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

import com.prods.springprodsapi.model.Issuer;
import com.prods.springprodsapi.repository.IssuerRepository;

@RestController
@RequestMapping(value="/issuer")
public class IssuerResource {

	@Autowired
	IssuerRepository issuerRepository;
	
	@GetMapping
	public List<Issuer> list () {
		return issuerRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Issuer read (@PathVariable(value="id") long id) {
		return issuerRepository.findById(id);
	}
	
	@PostMapping
	public Issuer save (@RequestBody Issuer issuer) {
		return issuerRepository.save(issuer);
	}
	
	@DeleteMapping("/{id}")
	public void delete (@PathVariable(value="id") long id) {
		issuerRepository.deleteById(id);
	}
}
