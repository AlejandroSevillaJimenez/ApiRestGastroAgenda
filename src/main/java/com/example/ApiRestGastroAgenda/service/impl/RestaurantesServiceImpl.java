package com.example.ApiRestGastroAgenda.service.impl;

import com.example.ApiRestGastroAgenda.model.Restaurante;
import com.example.ApiRestGastroAgenda.model.Usuario;
import com.example.ApiRestGastroAgenda.repository.RestaurantesRepository;
import com.example.ApiRestGastroAgenda.service.RestaurantesService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RestaurantesServiceImpl implements RestaurantesService {

    @Autowired
    private RestaurantesRepository restaurantesRepository;



    @Override
    public List<Restaurante> listaRestaurantes() {
        List<Restaurante> listaRestaurantes = restaurantesRepository.findAll();
        for (Restaurante restaurante : listaRestaurantes){
            System.out.println(restaurante.toString());
        }

        return listaRestaurantes;
    }
}
