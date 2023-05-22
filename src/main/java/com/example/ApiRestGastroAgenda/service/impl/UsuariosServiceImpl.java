package com.example.ApiRestGastroAgenda.service.impl;

import com.example.ApiRestGastroAgenda.model.Usuario;
import com.example.ApiRestGastroAgenda.repository.UsuariosRepository;
import com.example.ApiRestGastroAgenda.service.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuariosServiceImpl implements UsuariosService {

    @Autowired
    private UsuariosRepository usuariosRepository;

    @Override
    public List<Usuario> listaUsuarios() {
        List<Usuario> listaUsuario = usuariosRepository.findAll();
        for (Usuario usuario : listaUsuario){
            System.out.println(usuario.toString());
        }
        return listaUsuario;
    }

    @Override
    public Usuario usuario(String nombre) {
        Usuario usuario = usuariosRepository.findByNombre(nombre);
        System.out.println(usuario.toString());
        return usuario;
    }

    @Override
    public Usuario insertarUsuario(String nombre, String apellidos, String usuario, String email, String contrasena) {
        Usuario usuarioNuevo = new Usuario();
        usuarioNuevo.setNombre(nombre);
        usuarioNuevo.setApellidos(apellidos);
        usuarioNuevo.setUsuario(usuario);
        usuarioNuevo.setEmail(email);
        usuarioNuevo.setContrasena(contrasena);

        return usuariosRepository.save(usuarioNuevo);
    }
}
