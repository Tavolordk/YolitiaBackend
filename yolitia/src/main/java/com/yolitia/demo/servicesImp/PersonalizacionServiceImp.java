package com.yolitia.demo.servicesImp;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yolitia.demo.model.Personalizacion;
import com.yolitia.demo.repositories.PersonalizacionRepository;
import com.yolitia.demo.services.PersonalizacionService;

@Service
public class PersonalizacionServiceImp implements PersonalizacionService{
	private final PersonalizacionRepository personalizacionRepository;

	public PersonalizacionServiceImp(@Autowired PersonalizacionRepository personalizacionRepository) {
		this.personalizacionRepository = personalizacionRepository;
	}
	
	@Override
	public Personalizacion getPersonalizacion(Integer id) {
		Optional<Personalizacion> personalizacion = personalizacionRepository.findById(id);
		return personalizacion.orElse(null);
	}

	@Override
	public List<Personalizacion> getPersonalizaciones() {
		return (List<Personalizacion>) personalizacionRepository.findAll();
	}

	@Override
	public Personalizacion save(Personalizacion personalizacion) {
		return personalizacionRepository.save(personalizacion);
	}

	@Override
	public void delete(Integer id) {
		personalizacionRepository.deleteById(id);
	}

	@Override
	public List<Map<String, Object>> obtenerDatosPeluches() {
		return personalizacionRepository.obtenerDatosPeluche();
	}

}
