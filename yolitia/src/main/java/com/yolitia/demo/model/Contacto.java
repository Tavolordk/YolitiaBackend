package com.yolitia.demo.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Data;


@Entity
@Table(name = "contacto")
@Data
public class Contacto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idContacto", nullable = false)
	
	
	private Integer id;
	
	@Column(name = "nombre", nullable = false, length = 255)
	
	
	private String nombre;
	
	@Column(name = "correo_electronico", nullable = false, length = 255)
	
	
	private String correo_electronico;
	
	@Column(name = "asunto", nullable = false, length = 255)
	
	
	private String asunto;
	
	@Column(name = "mensaje", nullable = false, length = 255)
	
	
	private String mensaje;
	
	
	
	
	
	

}
