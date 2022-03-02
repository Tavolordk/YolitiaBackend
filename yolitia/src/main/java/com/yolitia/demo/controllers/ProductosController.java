package com.yolitia.demo.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.yolitia.demo.model.Productos;
import com.yolitia.demo.services.ProductosService;

@RestController
@RequestMapping("/api/productos")
public class ProductosController {
	private final ProductosService productoService;
	public ProductosController(@Autowired ProductosService productoService) {
		this.productoService=productoService;
	}
	 @PostMapping
	    public Productos saveProductos(@RequestBody Productos productos) {
	        return productoService.save(productos);
	    }

	    @GetMapping("/{id}")
	    public Productos getProductos(@PathVariable Integer id) {
	        return productoService.getProducto(id);
	    }


	    @GetMapping("/all")
	    public ArrayList<Productos> getProductos() {
	        return (ArrayList<Productos>) productoService.getProductos();
	    }
	    
	    @DeleteMapping("/eliminar/{id}")
	    public void eliminar(@PathVariable ("id") Integer id) {
	    	productoService.delete(id);
	    }
}
