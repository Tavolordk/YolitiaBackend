package com.yolitia.demo.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.OneToOne;
import javax.persistence.Table;


import lombok.Data;

@Entity
@Table(name = "orden")
@Data
public class Orden {
	
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "idOrden", nullable = false)
		
		
		private Integer id;
		
		@Column(name = "cantidad_articulos", nullable = false)
		
		
		private Integer cantidad_articulos;
		
		@Column(name = "fecha", nullable = false )
		
		
		private Date fecha;
		
		@Column(name = "monto_total", nullable = false)
		
		
		private float monto_total;
		
		@Column(name = "direccion_entrega", nullable = false, length = 255)
		
		
		private String direccion_entrega;
		
		@Column(name = "telefono", nullable = false)
		
		
		private Integer telefono;
		
		@Column(name = "nombre", nullable = false, length = 255)
		
		
		private String nombre;
		
		
		@ManyToOne()
		@JoinColumn(name = "id_productos")
		private Productos productos;
		
		@OneToOne()
		@JoinColumn(name = "id_usuario")
		private Usuario usuario;
		
		@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "orden")
		private Pago pago;
		
}
