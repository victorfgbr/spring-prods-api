package com.prods.springprodsapi.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.prods.springprodsapi.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

	Produto findById(long id);

}
