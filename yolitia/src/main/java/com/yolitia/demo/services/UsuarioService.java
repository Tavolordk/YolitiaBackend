package com.yolitia.demo.services;

import java.util.List;

import com.yolitia.demo.model.Usuario;


public interface UsuarioService {
	
    Usuario getUsuario(Integer id);

    List<Usuario> getUsuarios();

    Usuario saveUsuario(Usuario usuario);

    void delete(Integer id);
}
