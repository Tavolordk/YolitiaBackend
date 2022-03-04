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
@Table(name = "usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Integer id_usuario;
	
	@Column(nullable = false,length = 255)
	private String nombre;
	
	@Column(unique = true)
	private String correo;
	
	@Column(nullable = false,length = 255)
	private String contrasenia;
	
	
	
	@OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
	private List<Resenias> resenias;
	
	@OneToOne(mappedBy = "usuario", cascade = CascadeType.ALL)
	private Perfil perfil;

	public Integer getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Integer id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public List<Resenias> getResenias() {
		return resenias;
	}

	public void setResenias(List<Resenias> resenias) {
		this.resenias = resenias;
	}

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}
	
	
}
