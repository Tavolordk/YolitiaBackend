package com.yolitia.demo.servicesImp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yolitia.demo.model.Resenias;
import com.yolitia.demo.repositories.ReseniasRepository;
import com.yolitia.demo.services.ReseniasService;

@Service
public class ReseniasServiceImp implements ReseniasService{

	private final ReseniasRepository reseniasRepository;
	
	public ReseniasServiceImp(@Autowired ReseniasRepository reseniasRepository) {
		this.reseniasRepository = reseniasRepository;
	}
	
	@Override
	public Resenias getResenia(Integer id) {
		 Optional<Resenias> resenia = reseniasRepository.findById(id);
	     return resenia.orElse(null);
	}

	@Override
	public List<Resenias> getResenias() {
		 return (List<Resenias>) reseniasRepository.findAll();
	}

	@Override
	public Resenias saveResenias(Resenias resenia) {
		return reseniasRepository.save(resenia);
	}

	@Override
	public void delete(Integer id) {
		reseniasRepository.deleteById(id);
		
	}

}
