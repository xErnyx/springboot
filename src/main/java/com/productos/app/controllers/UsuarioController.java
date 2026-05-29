package com.productos.app.controllers; //

import org.springframework.stereotype.Controller; //
import org.springframework.ui.Model; //
import org.springframework.web.bind.annotation.GetMapping; //
import com.productos.app.model.Usuario; //

@Controller //
public class UsuarioController { //
    @GetMapping(path="/gestionUsuarios") //
    public String gestionUsuarios(Model model) { //
        Usuario usuario = new Usuario(1, 2, 1, "Luis Teran", "1714032587", "lteran@gmail.com", "lteran"); //
        model.addAttribute("Usuario", usuario); //
        return "gestionUsuarios"; //
    }
}