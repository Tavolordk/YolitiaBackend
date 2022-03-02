package com.yolitia.demo.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yolitia.demo.model.Resenias;
import com.yolitia.demo.services.ReseniasService;


@RestController
@RequestMapping("/api/resenias")
public class ReseniasController {
	
	private final ReseniasService reseniasService;
	
	public ReseniasController(@Autowired ReseniasService reseniasService) {
		this.reseniasService = reseniasService;
	}
	
	@PostMapping
    public Resenias saveResenias(@RequestBody Resenias user) {
        return reseniasService.saveResenias(user);
    }

    @GetMapping("/{id}")
    public Resenias getResenia(@PathVariable Integer id) {
        return reseniasService.getResenia(id);
    }


    @GetMapping("/all")
    public ArrayList<Resenias> getResenias() {
        return (ArrayList<Resenias>) reseniasService.getResenias();
    }
}
