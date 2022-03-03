package com.yolitia.demo.servicesImp;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.yolitia.demo.model.Contacto;
import com.yolitia.demo.repositories.ContactoRepository;
import com.yolitia.demo.services.ContactoService;

@Service
public class ContactoServiceImp implements ContactoService{
	private final ContactoRepository contactoRepository;
	
	public ContactoServiceImp(ContactoRepository contactoRepository) {
		this.contactoRepository = contactoRepository;
	}

	@Override
	public Contacto getContacto(Integer id) {
		Optional<Contacto> contacto = contactoRepository.findById(id);
        return contacto.orElse(null);
	}

	@Override
	public List<Contacto> getContacto() {
		return (List<Contacto>) contactoRepository.findAll();
	}

	@Override
	public Contacto save(Contacto contacto) {
		return contactoRepository.save(contacto);
	}

	@Override
	public void delete(Integer id) {
		contactoRepository.deleteById(id);	
		
	}

}
