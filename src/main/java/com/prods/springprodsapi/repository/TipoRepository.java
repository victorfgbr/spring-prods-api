package com.prods.springprodsapi.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.prods.springprodsapi.model.Tipo;

public interface TipoRepository extends JpaRepository<Tipo, Long>{

	Tipo findById(long id);

}
