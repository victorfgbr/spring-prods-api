package com.prods.springprodsapi.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.prods.springprodsapi.model.Bandeira;

public interface BandeiraRepository extends JpaRepository<Bandeira, Long>{

	Bandeira findById(long id);

}
