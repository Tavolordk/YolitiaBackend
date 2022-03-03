package com.yolitia.demo.services;

import java.util.List;

import com.yolitia.demo.model.Orden;

public interface OrdenService {
	//m�todos
	Orden getOrden(Integer id);

    List<Orden> getOrden();

    Orden save(Orden orden);

    void delete(Integer id);
}
