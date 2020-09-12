package com.prods.springprodsapi.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.prods.springprodsapi.model.Issuer;

public interface IssuerRepository extends JpaRepository<Issuer, Long>{

	Issuer findById(long id);

}
