package com.yolitia.demo.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Map;

import com.yolitia.demo.model.Personalizacion;

public interface PersonalizacionRepository extends CrudRepository<Personalizacion, Integer>{
	@Query(value = "SELECT modelo,monio,sombrero,color,nombre,descripcion,imagen,precio from personalizacion JOIN productos ON personalizacion.modelo = imagen", nativeQuery = true)
	List<Map<String,Object>> obtenerDatosPeluche();
}
