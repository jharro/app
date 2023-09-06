package com.productos.app.service;

import com.productos.app.model.Productos;
import com.productos.app.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductoServiceImpl implements ProductoService{

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public List<Productos> listarProductos() {

        return productoRepository.findAll();
    }
}
