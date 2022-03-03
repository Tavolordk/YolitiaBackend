package com.yolitia.demo.controllers;


import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yolitia.demo.model.Pago;

import com.yolitia.demo.services.PagoService;


@RestController
@RequestMapping("/api/pago")
public class PagoController {
	private final PagoService pagoService;
	public PagoController(@Autowired PagoService pagoService) {
		this.pagoService=pagoService;
	}
	

    @PostMapping
    public Pago savePago(@RequestBody Pago pago) {
        return pagoService.save(pago);
    }

    @GetMapping("/{id}")
    public Pago getPago(@PathVariable Integer id) {
        return pagoService.getPago(id);
    }


    @GetMapping("/all")
    public ArrayList<Pago> getPagos() {
        return (ArrayList<Pago>) pagoService.getPagos();
    }
    
    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable ("id") Integer id) {
    	pagoService.delete(id);
    }
}