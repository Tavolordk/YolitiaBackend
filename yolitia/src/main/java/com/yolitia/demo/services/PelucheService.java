package com.yolitia.demo.services;

import java.util.List;
import com.yolitia.demo.model.Peluches;

public interface PelucheService {
	Peluches getPeluche(Integer id);
	List<Peluches> getPeluches();
	Peluches save(Peluches peluche);
	void delete(Integer id);
}
