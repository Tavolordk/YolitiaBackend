package com.yolitia.demo.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contacto")

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

	public String getCorreo_electronico() {
		return correo_electronico;
	}

	public void setCorreo_electronico(String correo_electronico) {
		this.correo_electronico = correo_electronico;
	}

	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
}
