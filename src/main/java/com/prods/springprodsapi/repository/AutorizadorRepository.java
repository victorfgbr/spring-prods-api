package com.prods.springprodsapi.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.prods.springprodsapi.model.Autorizador;

public interface AutorizadorRepository extends JpaRepository<Autorizador, Long>{

	Autorizador findById(long id);

}
