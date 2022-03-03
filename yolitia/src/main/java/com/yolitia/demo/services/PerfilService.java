package com.yolitia.demo.services;
import java.util.List;
import com.yolitia.demo.model.Perfil;


public interface PerfilService {

    Perfil getPerfil(Integer id);

    List<Perfil> getPerfil();

    Perfil save(Perfil perfil);

	void delete(Integer id);

	
}
