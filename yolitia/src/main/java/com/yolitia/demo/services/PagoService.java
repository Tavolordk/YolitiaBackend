package com.yolitia.demo.services;

import java.util.List;

import com.yolitia.demo.model.Pago;


public interface PagoService {
	Pago getPago(Integer id);
	List<Pago> getPagos();
	Pago save(Pago pago);
	void delete(Integer id);
}