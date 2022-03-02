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

import com.yolitia.demo.model.Peluches;
import com.yolitia.demo.services.PelucheService;

@RestController
@RequestMapping("/api/peluche")
public class PelucheController {
	private final PelucheService pelucheService;
	public PelucheController(@Autowired PelucheService pelucheService) {
		this.pelucheService=pelucheService;
	}
	
	    @PostMapping
	    public Peluches savePeluche(@RequestBody Peluches peluche) {
	        return pelucheService.save(peluche);
	    }

	    @GetMapping("/{id}")
	    public Peluches getPeluche(@PathVariable Integer id) {
	        return pelucheService.getPeluche(id);
	    }


	    @GetMapping("/all")
	    public ArrayList<Peluches> getPeluches() {
	        return (ArrayList<Peluches>) pelucheService.getPeluches();
	    }
	    
	    @DeleteMapping("/eliminar/{id}")
	    public void eliminar(@PathVariable ("id") Integer id) {
	    	pelucheService.delete(id);
	    }
}
