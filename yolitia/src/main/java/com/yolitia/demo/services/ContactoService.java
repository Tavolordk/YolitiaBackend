package com.yolitia.demo.services;

import java.util.List;
import com.yolitia.demo.model.Contacto;

public interface ContactoService {
	Contacto getContacto(Integer id);

    List<Contacto> getContacto();

    Contacto save(Contacto contacto);

    void delete(Integer id);

}
