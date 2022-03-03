package com.yolitia.demo.servicesImp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yolitia.demo.model.Pago;

import com.yolitia.demo.repositories.PagoRepository;
import com.yolitia.demo.services.PagoService;

@Service
public class PagoServiceImp implements PagoService{
	private final PagoRepository pagoRepository;
	
	public PagoServiceImp(@Autowired PagoRepository pagoRepository) {
		this.pagoRepository=pagoRepository;
	}

	@Override
	public Pago getPago(Integer id) {
		Optional<Pago> pago = pagoRepository.findById(id);
		return pago.orElse(null);
	}

	@Override
	public List<Pago> getPagos() {
		return (List<Pago>) pagoRepository.findAll();
	}

	@Override
	public Pago save(Pago pago) {
		return pagoRepository.save(pago);
	}

	@Override
	public void delete(Integer id) {
		 pagoRepository.deleteById(id);
	}

}
