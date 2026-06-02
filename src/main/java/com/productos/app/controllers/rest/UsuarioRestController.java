package com.productos.app.controllers.rest;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.productos.app.model.Usuario;

@RestController
@RequestMapping("/api/v1")
public class UsuarioRestController {

    @GetMapping("/usuarios")
    public Map<String, Object> getUsuarios() {
        Usuario usuario = new Usuario(1, 2, 1, "Juan David Figueroa", "17274163.05", "jfigueroam3@est.ups.edu.ec", "JuanDavid1234");
        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("Usuario", usuario);
        return respuesta;
    }
}