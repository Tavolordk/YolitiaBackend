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

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;



@Entity
@Table(name = "orden")
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
		
		
		private Long telefono;
		
		@Column(name = "nombre", nullable = false, length = 255)
		
		
		private String nombre;
		
		
		@ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
		@JoinColumn(name = "FK_PRODUCTO", nullable = false)
		@JsonProperty(access = Access.WRITE_ONLY)
		private Productos productos;
		
		@OneToOne()
		@JoinColumn(name = "id_usuario")
		private Usuario usuario;
		
		@OneToOne(mappedBy = "orden", cascade = CascadeType.ALL)
		private Pago pago;

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public Integer getCantidad_articulos() {
			return cantidad_articulos;
		}

		public void setCantidad_articulos(Integer cantidad_articulos) {
			this.cantidad_articulos = cantidad_articulos;
		}

		public Date getFecha() {
			return fecha;
		}

		public void setFecha(Date fecha) {
			this.fecha = fecha;
		}

		public float getMonto_total() {
			return monto_total;
		}

		public void setMonto_total(float monto_total) {
			this.monto_total = monto_total;
		}

		public String getDireccion_entrega() {
			return direccion_entrega;
		}

		public void setDireccion_entrega(String direccion_entrega) {
			this.direccion_entrega = direccion_entrega;
		}

		public Long getTelefono() {
			return telefono;
		}

		public void setTelefono(Long telefono) {
			this.telefono = telefono;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public Productos getProductos() {
			return productos;
		}

		public void setProductos(Productos productos) {
			this.productos = productos;
		}

		public Usuario getUsuario() {
			return usuario;
		}

		public void setUsuario(Usuario usuario) {
			this.usuario = usuario;
		}

		public Pago getPago() {
			return pago;
		}

		public void setPago(Pago pago) {
			this.pago = pago;
		}
		
		
}
