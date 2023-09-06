package com.productos.app.controller;

import com.productos.app.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class ProductoController {
    @Autowired

        private ProductoService productoService;

    @GetMapping("/") // localhost:8080

    public String inicio(Model model){
        model.addAttribute("listaProductos", productoService.listarProductos());
        return "index";
    }
}
