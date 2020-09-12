package com.prods.springprodsapi.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="bandeira")
public class Bandeira implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_bandeira")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	private String nfce_id;
	
}
