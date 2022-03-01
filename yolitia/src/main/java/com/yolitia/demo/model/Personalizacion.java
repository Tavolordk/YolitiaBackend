package com.yolitia.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;




@Entity
@Table(name = "personalizacion")
@Data
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
	
    
	@ManyToOne()
	@JoinColumn(name = "peluche_id")
	private Peluches peluche;
	
	
	
	
	
	
}
