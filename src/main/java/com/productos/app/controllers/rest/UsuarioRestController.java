package com.productos.app.controllers.rest; //

import java.util.HashMap; //
import java.util.Map; //
import org.springframework.web.bind.annotation.RequestMapping; //
import org.springframework.web.bind.annotation.RequestMethod; //
import org.springframework.web.bind.annotation.RestController; //
import com.productos.app.model.Usuario; //

@RestController //
@RequestMapping("/api/v1") //
public class UsuarioRestController { //
    @RequestMapping(path="/usuarios", method = RequestMethod.GET) //
    public Map<String, Object> getUsuarios() { //
        Usuario usuario = new Usuario(1, 2, 1, "Luis Teran", "1714032587", "lteran@gmail.com", "lteran"); //
        Map<String, Object> respuesta = new HashMap<>(); //
        respuesta.put("Usuario", usuario); //
        return respuesta; //
    }
}