package com.yolitia.demo.repositories;


import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.yolitia.demo.model.Peluches;

public interface PelucheRepository extends CrudRepository<Peluches,Integer>{
	
	@Query(value = "SELECT id, descripcion,imagen,nombre,precio from peluches inner JOIN productos ON peluches.productos_id = productos.id limit 3;", nativeQuery = true)
	List<Map<String,Object>> obtenerDatosPeluche();
	
}
