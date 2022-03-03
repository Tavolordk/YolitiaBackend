package com.yolitia.demo.servicesImp;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.yolitia.demo.model.Orden;
import com.yolitia.demo.repositories.OrdenRepository;
import com.yolitia.demo.services.OrdenService;

@Service
public class OrdenServiceImp implements OrdenService {
	private final OrdenRepository ordenRepository;
	
	public OrdenServiceImp(OrdenRepository ordenRepository) {
		this.ordenRepository = ordenRepository;
	}

	@Override
	public Orden getOrden(Integer id) {
		Optional<Orden> orden = ordenRepository.findById(id);
        return orden.orElse(null);
		
	}

	@Override
	public List<Orden> getOrden() {
		return (List<Orden>) ordenRepository.findAll();
	}

	@Override
	public Orden save(Orden orden) {
		return ordenRepository.save(orden);
	}

	@Override
	public void delete(Integer id) {
		ordenRepository.deleteById(id);		
	}

}
