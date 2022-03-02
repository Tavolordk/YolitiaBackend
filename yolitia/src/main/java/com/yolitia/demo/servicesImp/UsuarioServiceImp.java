package com.yolitia.demo.servicesImp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yolitia.demo.model.Usuario;
import com.yolitia.demo.repositories.UsuarioRepository;
import com.yolitia.demo.services.UsuarioService;

@Service
public class UsuarioServiceImp implements UsuarioService{
	
	public final UsuarioRepository usuarioRepository;
	
	public UsuarioServiceImp(@Autowired UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}
	

	@Override
	public Usuario getUsuario(Integer id) {
		Optional<Usuario> usuario = usuarioRepository.findById(id);
	    return usuario.orElse(null);
	}

	@Override
	public List<Usuario> getUsuarios() {
		return (List<Usuario>) usuarioRepository.findAll();
	}

	@Override
	public Usuario saveUsuario(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}

	@Override
	public void delete(Integer id) {
		usuarioRepository.deleteById(id);
	}

}
