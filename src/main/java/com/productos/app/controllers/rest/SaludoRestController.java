package com.productos.app.controllers.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SaludoRestController {

    @GetMapping("/saludo")
    public String holaMundo() {
        return "{\"mensaje\": \"👋 ¡Hola desde Spring Boot! Bienvenido al sistema de gestión de usuarios 🚀\"}";
    }
}