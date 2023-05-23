package com.example.ApiRestGastroAgenda.service.impl;

import com.example.ApiRestGastroAgenda.model.RestauranteRecomendado;
import com.example.ApiRestGastroAgenda.repository.RestauranteRecomendadoRepository;
import com.example.ApiRestGastroAgenda.service.RestauranteRecomendadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestauranteRecomendadoServiceImpl implements RestauranteRecomendadoService {

    @Autowired
    private RestauranteRecomendadoRepository restauranteRecomendadoRepository;

    @Override
    public List<RestauranteRecomendado> listaRestaurantesRecomendados() {
        return restauranteRecomendadoRepository.findAll();
    }

    @Override
    public RestauranteRecomendado insertarRestauranteRecomendado(String nombre, String lugar, String tipoComida) {

        RestauranteRecomendado restauranteRecomendado = new RestauranteRecomendado();
        restauranteRecomendado.setLugar(lugar);
        restauranteRecomendado.setNombre(nombre);
        restauranteRecomendado.setTipoComida(tipoComida);

        return restauranteRecomendadoRepository.save(restauranteRecomendado);
    }
}
