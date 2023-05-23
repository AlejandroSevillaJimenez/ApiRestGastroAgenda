package com.example.ApiRestGastroAgenda.service;

import com.example.ApiRestGastroAgenda.model.RestauranteRecomendado;

import java.util.List;

public interface RestauranteRecomendadoService {

    public List<RestauranteRecomendado> listaRestaurantesRecomendados();

    public RestauranteRecomendado insertarRestauranteRecomendado(String nombre, String lugar, String tipoComida);

}
