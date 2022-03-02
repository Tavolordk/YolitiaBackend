package com.yolitia.demo.services;

import java.util.List;

import com.yolitia.demo.model.Personalizacion;


public interface PersonalizacionService {
	Personalizacion getPersonalizacion(Integer id);
	List<Personalizacion> getPersonalizaciones();
	Personalizacion save(Personalizacion personalizacion);
	void delete(Integer id);
}
