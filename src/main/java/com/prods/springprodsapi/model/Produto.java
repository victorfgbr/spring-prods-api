package com.prods.springprodsapi.model;

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
@Table(name = "produto", uniqueConstraints = @UniqueConstraint(columnNames = { "id_bandeira", "id_tipo" }))
public class Produto {

	@Id
	@Column(name = "id_produto")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;

	@ManyToOne()
	@JoinColumn(name = "id_bandeira")
	public Bandeira bandeira;

	@ManyToOne()
	@JoinColumn(name = "id_tipo")
	public Tipo tipo;

	public String nome;

}
