package com.yolitia.demo.services;

import java.util.List;

import com.yolitia.demo.model.Resenias;


public interface ReseniasService {
	
    Resenias getResenia(Integer id);

    List<Resenias> getResenias();

    Resenias saveResenias(Resenias resenia);

    void delete(Integer id);
}
