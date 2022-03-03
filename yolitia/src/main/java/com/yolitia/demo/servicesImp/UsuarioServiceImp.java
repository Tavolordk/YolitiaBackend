package com.yolitia.demo.servicesImp;

import static java.util.Collections.emptyList;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.yolitia.demo.model.Usuario;
import com.yolitia.demo.repositories.UsuarioRepository;
import com.yolitia.demo.services.UsuarioService;

@Service
public class UsuarioServiceImp implements UsuarioService, UserDetailsService{
	
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
	
	@Override
    public UserDetails loadUserByUsername(String correo) throws UsernameNotFoundException {
		Usuario user = usuarioRepository.findByCorreo(correo);

        if(user == null) {
            throw new UsernameNotFoundException(correo);
        }
        return new org.springframework.security.core.userdetails.User(user.getCorreo(), user.getContrasenia(), emptyList());
    }

}
