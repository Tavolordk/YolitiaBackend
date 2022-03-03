package com.yolitia.demo.services;

import java.util.List;
import java.util.Map;

import com.yolitia.demo.model.Peluches;

public interface PelucheService {
	Peluches getPeluche(Integer id);
	List<Peluches> getPeluches();
	Peluches save(Peluches peluche);
	void delete(Integer id);
	
	List<Map<String,Object>> obtenerDatosPeluches();
}
