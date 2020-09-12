package com.prods.springprodsapi.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.Data;

@Data
@Entity
@Table(name="issuer",  uniqueConstraints = @UniqueConstraint(columnNames = { "codigo", "id_autorizador" }))
public class Issuer implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id_issuer")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String codigo;
	
	@ManyToOne
	@JoinColumn(name="id_autorizador")
	private Autorizador autorizador;
	
	@ManyToOne
	@JoinColumn(name="id_produto")
	private Produto produto;
}
