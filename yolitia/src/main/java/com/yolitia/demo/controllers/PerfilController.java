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

import com.yolitia.demo.model.Perfil;
import com.yolitia.demo.services.PerfilService;




@RestController
@RequestMapping("/api/perfil")
public class PerfilController {

    private final PerfilService perfilService;
    
   

    public PerfilController(@Autowired PerfilService perfilService) {
        this.perfilService = perfilService;
       
    }

    @PostMapping
    public Perfil savePerfil(@RequestBody Perfil perfil) {
        
        return perfilService.save(perfil);
    }

    @GetMapping("/{id}")
    public Perfil getperfil(@PathVariable Integer id) {
        return perfilService.getPerfil(id);
    }


    @GetMapping("/allPerfil")
    public ArrayList<Perfil> getPerfil() {
        return (ArrayList<Perfil>) perfilService.getPerfil();
    }
    
    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable ("id") Integer id) {
    	perfilService.delete(id);
    }
}
