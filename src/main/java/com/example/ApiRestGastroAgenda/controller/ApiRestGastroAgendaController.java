package com.example.ApiRestGastroAgenda.controller;

import com.example.ApiRestGastroAgenda.model.Usuario;
import com.example.ApiRestGastroAgenda.service.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class ApiRestGastroAgendaController {

    @Autowired
    private UsuariosService usuariosService;

    public ApiRestGastroAgendaController(UsuariosService usuariosService){

        this.usuariosService = usuariosService;

    }

    @GetMapping("listaUsuarios/")
    public List<Usuario> listaUsuarios(){
        return usuariosService.listaUsuarios();
    }

    @GetMapping("usuario/")
    public Usuario usuario(@RequestParam(value = "nombre", required = true) String nombre){
        return usuariosService.usuario(nombre);
    }

    @PostMapping("insertarUsuario/")
    public Usuario insertarUsuario(@RequestParam(value = "nombre", required = true) String nombre,
                                   @RequestParam(value = "apellidos", required = true) String apellidos,
                                   @RequestParam(value = "usuario", required = true) String usuario,
                                   @RequestParam(value = "email", required = true) String email,
                                   @RequestParam(value = "contrasena", required = true) String contrasena){

        return usuariosService.insertarUsuario(nombre, apellidos, usuario, email, contrasena);

    }

}
