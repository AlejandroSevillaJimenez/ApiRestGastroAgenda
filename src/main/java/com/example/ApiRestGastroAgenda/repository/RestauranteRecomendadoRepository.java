package com.example.ApiRestGastroAgenda.repository;

import com.example.ApiRestGastroAgenda.model.RestauranteRecomendado;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RestauranteRecomendadoRepository  extends JpaRepository<RestauranteRecomendado, Integer> {

    public List<RestauranteRecomendado> findAll();

}
