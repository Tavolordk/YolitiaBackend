package com.yolitia.demo.services;

import java.util.List;
import java.util.Map;

import com.yolitia.demo.model.Personalizacion;


public interface PersonalizacionService {
	Personalizacion getPersonalizacion(Integer id);
	List<Personalizacion> getPersonalizaciones();
	Personalizacion save(Personalizacion personalizacion);
	void delete(Integer id);
	List<Map<String,Object>> obtenerDatosPeluches();
}
