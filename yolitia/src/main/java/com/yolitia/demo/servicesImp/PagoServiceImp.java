package com.yolitia.demo.servicesImp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yolitia.demo.model.Pago;
import com.yolitia.demo.repositories.PagoRepository;
import com.yolitia.demo.services.PagoService;

@Service
public class PagoServiceImp implements PagoService {

	private final PagoRepository pagoRepository;
	
    public PagoServiceImp(@Autowired PagoRepository pagoRepository) {
    	this.pagoRepository = pagoRepository;
    }

	@Override
	public List<Pago> getPagos() {
		List<Pago> listaPago =  (List<Pago>) pagoRepository.findAll();
		return listaPago;
	}

	@Override
	public Pago save(Pago pago) {
		Pago p = pagoRepository.save(pago);
		return p;
	}

	@Override
	public void delete(Integer id) {
	
	}

	@Override
	public Pago getPago(Integer id) {
		Optional<Pago> pagos = pagoRepository.findById(id);
		return pagos.orElse(null);
	}
    
    

    	
}
