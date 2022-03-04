package com.yolitia.demo.model;



import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pago")
public class Pago {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idPago", nullable = false)
	
	
	private Integer id;
	
	@Column(name = "nombre_titular", nullable = false, length = 255)
	
	
	private String nombre_titular;
	
	@Column(name = "numero_tarjeta", nullable = false )
	
	
	private Integer numero_tarjeta;
	
	@Column(name = "fecha_expiracion", nullable = false)
	
	
	private String fecha_expiracion;
	
	@Column(name = "codigo_seguridad", nullable = false)
	
	
	private Integer codigo_seguridad;
	
	@OneToOne()
	@JoinColumn(name = "orden_id")
	private Orden orden;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre_titular() {
		return nombre_titular;
	}

	public void setNombre_titular(String nombre_titular) {
		this.nombre_titular = nombre_titular;
	}

	public Integer getNumero_tarjeta() {
		return numero_tarjeta;
	}

	public void setNumero_tarjeta(Integer numero_tarjeta) {
		this.numero_tarjeta = numero_tarjeta;
	}

	public String getFecha_expiracion() {
		return fecha_expiracion;
	}

	public void setFecha_expiracion(String fecha_expiracion) {
		this.fecha_expiracion = fecha_expiracion;
	}

	public Integer getCodigo_seguridad() {
		return codigo_seguridad;
	}

	public void setCodigo_seguridad(Integer codigo_seguridad) {
		this.codigo_seguridad = codigo_seguridad;
	}

	public Orden getOrden() {
		return orden;
	}

	public void setOrden(Orden orden) {
		this.orden = orden;
	}
	

}
