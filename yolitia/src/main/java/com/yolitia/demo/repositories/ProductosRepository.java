package com.yolitia.demo.repositories;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.yolitia.demo.model.Productos;

public interface ProductosRepository extends CrudRepository<Productos, Integer>{

	@Query(value = "SELECT * FROM productos where productos.id not in (select productos_id from peluches);", nativeQuery = true)
	List<Map<String,Object>> obtenerSoloProductos();
	
	@Query(value = "SELECT * FROM productos where productos.id not in (select productos_id from peluches) limit 3;", nativeQuery = true)
	List<Map<String,Object>> obtenerProductosNuevos();
}
