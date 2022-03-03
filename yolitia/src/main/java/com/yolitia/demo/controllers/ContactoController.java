package com.yolitia.demo.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yolitia.demo.model.Contacto;

import com.yolitia.demo.services.ContactoService;

@RestController
@RequestMapping("/api/contacto")
public class ContactoController {
	private final ContactoService contactoService;
	public ContactoController(ContactoService contactoService) {
		this.contactoService = contactoService;
	}
	
	@PostMapping
	public Contacto save(@RequestBody Contacto contacto) {
		return contactoService.save(contacto);
	}
	
	@GetMapping("/{id}")
	public Contacto getContacto(@PathVariable Integer id) {
		return contactoService.getContacto(id);
	}
	
	@DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable ("id") Integer id) {
    	contactoService.delete(id);
    }

}
