package com.yolitia.demo.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yolitia.demo.model.Usuario;
import com.yolitia.demo.services.UsuarioService;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {
	
	private final UsuarioService usuarioService;
	
	public UsuarioController(@Autowired UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}
	
	@PostMapping
    public Usuario saveUsuario(@RequestBody Usuario usuario) {
        return usuarioService.saveUsuario(usuario);
    }

    @GetMapping("/{id}")
    public Usuario getUsuario(@PathVariable Integer id) {
        return usuarioService.getUsuario(id);
    }


    @GetMapping("/all")
    public ArrayList<Usuario> getUsuarios() {
        return (ArrayList<Usuario>) usuarioService.getUsuarios();
    }
	
}
