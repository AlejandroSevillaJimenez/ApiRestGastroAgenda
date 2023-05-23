package com.example.ApiRestGastroAgenda.repository;

import com.example.ApiRestGastroAgenda.model.Restaurante;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RestaurantesRepository extends JpaRepository<Restaurante, Integer> {

    public List<Restaurante> findAll();

}
