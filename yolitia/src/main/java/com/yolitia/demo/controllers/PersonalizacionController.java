package com.yolitia.demo.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yolitia.demo.model.Peluches;
import com.yolitia.demo.model.Personalizacion;
import com.yolitia.demo.services.PersonalizacionService;

@RestController
@RequestMapping("/api/personalizacion")
public class PersonalizacionController {
	private final PersonalizacionService personalizacionService;
	public PersonalizacionController(@Autowired PersonalizacionService personalizacionService) {
		this.personalizacionService=personalizacionService;
	}
	 @PostMapping
	    public Personalizacion savePersonalizacion(@RequestBody Personalizacion personalizacion) {
		 return personalizacionService.save(personalizacion);
	    }
	 
	 @PutMapping
	    public Personalizacion putPersonalizacion(@RequestBody Personalizacion personalizacion) {
		 return personalizacionService.save(personalizacion);
	    }

	    @GetMapping("/{id}")
	    public Personalizacion getPersonalizacion(@PathVariable Integer id) {
	        return personalizacionService.getPersonalizacion(id);
	    }


	    @GetMapping("/all")
	    public ArrayList<Personalizacion> getPersonalizacion() {
	        return (ArrayList<Personalizacion>) personalizacionService.getPersonalizaciones();
	    }
	    
	    @DeleteMapping("/eliminar/{id}")
	    public void eliminar(@PathVariable ("id") Integer id) {
	    	personalizacionService.delete(id);
	    }
}
