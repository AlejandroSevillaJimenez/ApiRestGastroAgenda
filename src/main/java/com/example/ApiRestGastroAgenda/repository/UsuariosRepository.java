package com.example.ApiRestGastroAgenda.repository;

import com.example.ApiRestGastroAgenda.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsuariosRepository extends JpaRepository<Usuario, Integer> {

    public List<Usuario> findAll();

    public Usuario findByNombre(String nombre);

    public Usuario findByNombreAndContrasena(String nombre, String contrasena);

}
