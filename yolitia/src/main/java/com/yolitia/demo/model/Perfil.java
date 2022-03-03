package com.yolitia.demo.model;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "perfil")
@Data
public class Perfil {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idPerfil", nullable = false)
	
	
	private Integer id;
	
	@Column(name = "imagen", nullable = false, length = 255)
	
	
	private String imagen;
	
	@Column(name = "usuarioNombre", nullable = false, length = 255)
	
	
	private String usurarioNombre;
	
	

	@Column(name = "apellido", nullable = false, length = 255)
	
	
	private String apellido;
	
	@Column(name = "correo", nullable = false, length = 255)
	
	
	private String correo;
	
	@Column(name = "direccion", nullable = false, length = 255)
	
	
	private String direccion;
	
	@Column(name = "notificaciones", nullable = false, length = 255)
	
	
	private String notificaciones;
	
	@Column(name = "seguridad", nullable = false, length = 255)
	
	
	private String seguridad;
	
	@Column(name = "contrasenia", nullable = false, length = 255)
	
	
	private String contrasenia;
	
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "usuario_id")
	private Usuario usuario;


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getImagen() {
		return imagen;
	}


	public void setImagen(String imagen) {
		this.imagen = imagen;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getNotificaciones() {
		return notificaciones;
	}


	public void setNotificaciones(String notificaciones) {
		this.notificaciones = notificaciones;
	}


	public String getSeguridad() {
		return seguridad;
	}


	public void setSeguridad(String seguridad) {
		this.seguridad = seguridad;
	}


	public String getContrasenia() {
		return contrasenia;
	}


	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}


	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	
}
