package com.yolitia.demo.servicesImp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yolitia.demo.model.Productos;
import com.yolitia.demo.repositories.ProductosRepository;
import com.yolitia.demo.services.ProductosService;

@Service
public class ProductosServiceImp implements ProductosService{

	private final ProductosRepository productoRepository;
	
	public ProductosServiceImp(@Autowired ProductosRepository productoRepository) {
		this.productoRepository = productoRepository;
	}
	
	@Override
	public Productos getProducto(Integer id) {
		Optional<Productos> productos = productoRepository.findById(id);
		return productos.orElse(null);
	}

	@Override
	public List<Productos> getProductos() {
		return (List<Productos>) productoRepository.findAll();
	}

	@Override
	public Productos save(Productos producto) {
		return productoRepository.save(producto);
	}

	@Override
	public void delete(Integer id) {
		productoRepository.deleteById(id);
	}
	
}
