package com.yolitia.demo.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Data;


@Entity
@Table(name = "pago")
@Data
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
	
	
	

}
