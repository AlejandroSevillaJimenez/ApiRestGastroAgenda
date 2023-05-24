package com.example.ApiRestGastroAgenda.service;

import com.example.ApiRestGastroAgenda.model.Restaurante;

import java.util.List;

public interface RestaurantesService {

    public List<Restaurante> listaRestaurantes();

    public Restaurante insertarRestaurante(String nombre, String telefono, String web, String imagenRuta, String tipoComida, String descripción);

}
