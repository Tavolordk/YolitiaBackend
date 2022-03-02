package com.yolitia.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "productos")
@Data
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
	
	@OneToMany(mappedBy = "productos")
	private List<Orden> orden;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "productos")
	private Peluches peluches;
	
}
