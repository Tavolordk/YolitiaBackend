package com.yolitia.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.yolitia.demo.model.Contacto;

@Repository
public interface ContactoRepository extends CrudRepository<Contacto, Integer>{

}
