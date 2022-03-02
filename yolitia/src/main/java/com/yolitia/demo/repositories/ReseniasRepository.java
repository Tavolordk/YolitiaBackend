package com.yolitia.demo.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.yolitia.demo.model.Resenias;

@Repository
public interface ReseniasRepository extends CrudRepository<Resenias, Integer>{

}
