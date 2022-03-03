package com.yolitia.demo.servicesImp;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.yolitia.demo.model.Perfil;
import com.yolitia.demo.repositories.PerfilRepository;
import com.yolitia.demo.services.PerfilService;

@Service
public class PerfilServiceImp implements PerfilService {

    private final PerfilRepository perfilRepository;

    public PerfilServiceImp(PerfilRepository perfilRepository) {
        this.perfilRepository = perfilRepository;
    }

    @Override
    public Perfil getPerfil(Integer id) {
        Optional<Perfil> perfil = perfilRepository.findById(id);
        return perfil.orElse(null);
    }

    @Override
    public List<Perfil> getPerfil() {
        return (List<Perfil>) perfilRepository.findAll();
    }

    @Override
    public Perfil save(Perfil perfil) {
        return perfilRepository.save(perfil);
    }

    @Override
    public void delete(Integer id) {
        perfilRepository.deleteById(id);
    }

}
