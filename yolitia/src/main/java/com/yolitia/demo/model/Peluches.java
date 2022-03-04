package com.yolitia.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
@Table(name= "peluches")

public class Peluches {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_peluches", nullable = false)
	
	
	private Integer id;

	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "peluche")
	private List<Personalizacion> personalizacion;
	

	@OneToOne()
	@JoinColumn(name = "productos_id")
	@JsonProperty(access = Access.WRITE_ONLY)
	private Productos productos;


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public List<Personalizacion> getPersonalizacion() {
		return personalizacion;
	}


	public void setPersonalizacion(List<Personalizacion> personalizacion) {
		this.personalizacion = personalizacion;
	}


	public Productos getProductos() {
		return productos;
	}


	public void setProductos(Productos productos) {
		this.productos = productos;
	}


	
}
