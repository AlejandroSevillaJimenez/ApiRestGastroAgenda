package com.example.ApiRestGastroAgenda.service;


import com.example.ApiRestGastroAgenda.model.Usuario;

import java.util.List;

public interface UsuariosService {

    public List<Usuario> listaUsuarios();

    public Usuario usuario(String nombre);

    public Usuario insertarUsuario(String nombre, String apellidos, String usuario, String email, String contrasena);

}
