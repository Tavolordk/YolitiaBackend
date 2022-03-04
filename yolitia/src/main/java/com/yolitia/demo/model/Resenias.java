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


@Entity
@Table(name = "resenias")
public class Resenias {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Integer id_resenias;
	
	@Column(nullable = false, length = 255)
	private String texto;
	
	@Column(nullable = false, length = 255)
	private String imagen;
	
	@Column(nullable = false, length = 255)
	private String nombrePeluche;
	
	
	@JoinColumn(name = "FK_USUARIO", nullable = false)
	@ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Usuario usuario;


	public Integer getId_resenias() {
		return id_resenias;
	}


	public void setId_resenias(Integer id_resenias) {
		this.id_resenias = id_resenias;
	}


	public String getTexto() {
		return texto;
	}


	public void setTexto(String texto) {
		this.texto = texto;
	}


	public String getImagen() {
		return imagen;
	}


	public void setImagen(String imagen) {
		this.imagen = imagen;
	}


	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
}
