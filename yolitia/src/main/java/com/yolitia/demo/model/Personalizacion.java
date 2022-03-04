package com.yolitia.demo.model;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;





@Entity
@Table(name = "personalizacion")

public class Personalizacion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Integer id;
	
	@Column(name = "modelo", nullable = false, length = 255)
	private String modelo;
	
	@Column(name = "color", nullable = false, length = 255)
	private String color;
	
	@Column(name = "sombrero", nullable = false, length = 255)
	private String sombrero;
	
	@Column(name = "monio", nullable = false, length = 255)
	private String monio;
	
    
	@ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "FK_PELUCHE", nullable = false)
	@JsonProperty(access = Access.WRITE_ONLY)
	private Peluches peluche;


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getSombrero() {
		return sombrero;
	}


	public void setSombrero(String sombrero) {
		this.sombrero = sombrero;
	}


	public String getMonio() {
		return monio;
	}


	public void setMonio(String monio) {
		this.monio = monio;
	}


	public Peluches getPeluche() {
		return peluche;
	}


	public void setPeluche(Peluches peluche) {
		this.peluche = peluche;
	}
	
	

}
