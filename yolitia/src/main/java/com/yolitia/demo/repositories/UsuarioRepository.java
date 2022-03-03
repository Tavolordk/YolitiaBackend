package com.yolitia.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.yolitia.demo.model.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Integer>{
	
	Usuario findByCorreo(String correo);
}
