package com.example.ApiRestGastroAgenda.service.impl;

import com.example.ApiRestGastroAgenda.model.Restaurante;
import com.example.ApiRestGastroAgenda.model.Usuario;
import com.example.ApiRestGastroAgenda.repository.RestaurantesRepository;
import com.example.ApiRestGastroAgenda.service.RestaurantesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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

    @Override
    public Restaurante insertarRestaurante(String nombre, String telefono, String web, String imagenRuta, String tipoComida, String descripción) {
        Restaurante restaurante = new Restaurante();
        restaurante.setNombre(nombre);
        restaurante.setTelefono(telefono);
        restaurante.setWeb(web);
        restaurante.setImagenRuta(imagenRuta);
        restaurante.setTipoComida(tipoComida);
        restaurante.setDescripcion(descripción);

        return restaurantesRepository.save(restaurante);
    }
}
