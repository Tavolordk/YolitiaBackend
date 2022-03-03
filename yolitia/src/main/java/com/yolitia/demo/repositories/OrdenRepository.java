package com.yolitia.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.yolitia.demo.model.Orden;

@Repository
public interface OrdenRepository extends CrudRepository<Orden, Integer >{

}



