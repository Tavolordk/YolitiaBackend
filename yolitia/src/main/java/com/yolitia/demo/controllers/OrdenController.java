package com.yolitia.demo.controllers;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yolitia.demo.model.Orden;
import com.yolitia.demo.services.OrdenService;

@RestController
@RequestMapping("/api/orden")
public class OrdenController {
	
	private final OrdenService ordenService;
	public OrdenController (OrdenService ordenService) {
		this.ordenService = ordenService;
	}
	
	@PostMapping
	public Orden save(@RequestBody Orden orden) {
		return ordenService.save(orden);
	}
	
	@GetMapping("/{id}")
	public Orden getOrden(@PathVariable Integer id) {
		return ordenService.getOrden(id);
	}
	
	@DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable ("id") Integer id) {
    	ordenService.delete(id);
    }
	
}
