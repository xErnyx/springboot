package com.productos.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SaludoController {

    @GetMapping("/saludo")
    public String info() {
        return "saludo";
    }
}