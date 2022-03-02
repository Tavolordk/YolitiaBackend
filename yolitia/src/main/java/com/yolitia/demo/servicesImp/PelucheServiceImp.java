package com.yolitia.demo.servicesImp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yolitia.demo.model.Peluches;
import com.yolitia.demo.repositories.PelucheRepository;
import com.yolitia.demo.services.PelucheService;

@Service
public class PelucheServiceImp implements PelucheService {
	private final PelucheRepository pelucheRepository;

	public PelucheServiceImp(@Autowired PelucheRepository pelucheRepository) {
		this.pelucheRepository = pelucheRepository;
	}

	@Override
	public Peluches getPeluche(Integer id) {
		Optional<Peluches> peluche = pelucheRepository.findById(id);
		return peluche.orElse(null);
	}

	@Override
	public List<Peluches> getPeluches() {
		return (List<Peluches>) pelucheRepository.findAll();
	}

	@Override
	public Peluches save(Peluches peluche) {
		return pelucheRepository.save(peluche);
	}

	@Override
	public void delete(Integer id) {
		 pelucheRepository.deleteById(id);
	}

}
