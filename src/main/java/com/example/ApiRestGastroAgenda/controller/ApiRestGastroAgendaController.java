package com.example.ApiRestGastroAgenda.controller;

import com.example.ApiRestGastroAgenda.model.Restaurante;
import com.example.ApiRestGastroAgenda.model.RestauranteRecomendado;
import com.example.ApiRestGastroAgenda.model.Usuario;
import com.example.ApiRestGastroAgenda.repository.RestauranteRecomendadoRepository;
import com.example.ApiRestGastroAgenda.service.RestauranteRecomendadoService;
import com.example.ApiRestGastroAgenda.service.RestaurantesService;
import com.example.ApiRestGastroAgenda.service.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class ApiRestGastroAgendaController {

    @Autowired
    private UsuariosService usuariosService;

    @Autowired
    private RestaurantesService restaurantesService;

    @Autowired
    private RestauranteRecomendadoService restauranteRecomendadoService;

    public ApiRestGastroAgendaController(UsuariosService usuariosService, RestaurantesService restaurantesService, RestauranteRecomendadoService restauranteRecomendadoService){

        this.usuariosService = usuariosService;
        this.restaurantesService = restaurantesService;
        this.restauranteRecomendadoService = restauranteRecomendadoService;

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

    @GetMapping("existeUsuario/")
    public Usuario existeUsuario(@RequestParam(value = "usuario", required = true) String usuario,
                                 @RequestParam(value = "contrasena", required = true) String contrasena){

        return usuariosService.existeUsuario(usuario, contrasena);
    }

    @GetMapping("existeUsuarioUsuario/")
    public Boolean existeUsuarioUsuario(@RequestParam(value = "usuario", required = true) String usuario){
        return usuariosService.existeUsuarioUsuario(usuario);
    }

    @GetMapping("existeEmail/")
    public Boolean existeEmail(@RequestParam(value = "email", required = true) String email){
        return usuariosService.existeEmail(email);
    }

    @GetMapping("existeUsuarioRegistrar/")
    public Boolean existeUsuarioRegistrar(@RequestParam(value = "nombre", required = true) String nombre,
                                          @RequestParam(value = "apellidos", required = true) String apellidos,
                                          @RequestParam(value = "usuario", required = true) String usuario,
                                          @RequestParam(value = "email", required = true) String email,
                                          @RequestParam(value = "contrasena", required = true) String contrasena){

        return usuariosService.existeUsuarioRegistrar(nombre, apellidos, usuario, email, contrasena);

    }

    //CONSULTAS RESTAURANTES

    @GetMapping("listaRestaurantes/")
    public List<Restaurante> listaRestaurantes(){
        return restaurantesService.listaRestaurantes();
    }


    //CONSULTAS RESTAURANTES RECOMENDADOS

    @GetMapping("listaRestaurantesRecomendados/")
    public List<RestauranteRecomendado> listaRestaurantesRecomendados(){
        return restauranteRecomendadoService.listaRestaurantesRecomendados();
    }

    @PostMapping("insertarRestauranteRecomendado/")
    public RestauranteRecomendado insertarRestauranteRecomendado(@RequestParam(value = "nombre", required = true)String nombre,
                                                                 @RequestParam(value = "lugar", required = true)String lugar,
                                                                 @RequestParam(value = "tipoComida", required = true)String tipoComida){
        return restauranteRecomendadoService.insertarRestauranteRecomendado(nombre, lugar, tipoComida);
    }

}
