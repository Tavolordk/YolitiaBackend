package com.yolitia.demo.services;

import java.util.List;
import java.util.Map;

import com.yolitia.demo.model.Productos;

public interface ProductosService {
	Productos getProducto(Integer id);
	List<Productos> getProductos();
	Productos save(Productos producto);
	void delete(Integer id);
	
	List<Map<String,Object>> obtenerSoloProductos();
	
	List<Map<String,Object>> obtenerProductosNuevos();
}
