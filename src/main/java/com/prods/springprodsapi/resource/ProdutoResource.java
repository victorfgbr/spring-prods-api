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

import com.prods.springprodsapi.model.Produto;
import com.prods.springprodsapi.repository.ProdutoRepository;

@RestController
@RequestMapping(value="/produto")
public class ProdutoResource {
	
	@Autowired
	ProdutoRepository produtoRepository;
	
	@GetMapping
	public List<Produto> list () {
		return produtoRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Produto read (@PathVariable(value="id") long id) {
		return produtoRepository.findById(id);
	}
	
	@PostMapping
	public Produto save (@RequestBody Produto produto) {
		return produtoRepository.save(produto);
	}
	
	@DeleteMapping("/{id}")
	public void delete (@PathVariable(value="id") long id) {
		produtoRepository.deleteById(id);
	}
}
