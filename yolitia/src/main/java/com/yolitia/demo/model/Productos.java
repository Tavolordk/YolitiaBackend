package com.yolitia.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import javax.persistence.Table;


@Entity
@Table(name = "productos")

public class Productos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	
	
	private Integer id;
	
	@Column(name = "nombre", nullable = false, length = 255)
	
	
	private String nombre;
	
	@Column(name = "precio", nullable = false, length = 255)
	
	
	private float precio;
	
	@Column(name = "imagen", nullable = false, length = 255)
	
	
	private String imagen;
	
	@Column(name = "descripcion", nullable = false, length = 255)
	
	
	private String descripcion;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "productos")
	private List<Orden> orden;
	
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "productos")
	private Peluches peluches;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Orden> getOrden() {
		return orden;
	}

	public void setOrden(List<Orden> orden) {
		this.orden = orden;
	}

	public Peluches getPeluches() {
		return peluches;
	}

	public void setPeluches(Peluches peluches) {
		this.peluches = peluches;
	}
	
	
	
}
