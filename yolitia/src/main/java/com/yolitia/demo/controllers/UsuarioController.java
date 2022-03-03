package com.yolitia.demo.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import com.yolitia.demo.model.Usuario;
import com.yolitia.demo.services.UsuarioService;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {
	
	private final UsuarioService usuarioService;
	private final BCryptPasswordEncoder bCryptPasswordEncoder;
	
	public UsuarioController(@Autowired UsuarioService usuarioService, @Autowired BCryptPasswordEncoder bCryptPasswordEncoder) {
		this.usuarioService = usuarioService;
		this.bCryptPasswordEncoder = bCryptPasswordEncoder;
	}
	
	@PostMapping
    public Usuario saveUsuario(@RequestBody Usuario usuario) {
		usuario.setContrasenia(bCryptPasswordEncoder.encode(usuario.getContrasenia()));
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
