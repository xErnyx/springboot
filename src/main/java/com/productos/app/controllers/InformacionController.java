package com.productos.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InformacionController {
    @GetMapping("/informacion")
    public String info(Model modelo) {
        modelo.addAttribute("Titulo", "Datos del Servidor");
        modelo.addAttribute("App", "APP Manejo Usuarios");
        modelo.addAttribute("IP", "localhost");
        return "informacion";
    }
}