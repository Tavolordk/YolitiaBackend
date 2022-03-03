package com.yolitia.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.yolitia.demo.model.Perfil;

@Repository
public interface PerfilRepository extends CrudRepository<Perfil,Integer> {

}


