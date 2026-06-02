package com.productos.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.productos.app.model.Usuario;

@Controller
public class UsuarioController {

    @GetMapping(path="/gestionUsuarios")
    public String gestionUsuarios(Model model) {

        Usuario Usuario = new Usuario(1, 2, 1, "Juan David Figueroa", "17274163.05", "jfigueroam3@est.ups.edu.ec", "JuanDavid1234");

        model.addAttribute("Usuario", Usuario);

        return "gestionUsuarios";
    }
}