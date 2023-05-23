package com.example.ApiRestGastroAgenda.model;

import jakarta.persistence.*;

@Entity
@Table(name = "restaurantes_recomendados")
public class RestauranteRecomendado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_restaurante_recomendado")
    private Integer idRestauranteRecomendado;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "lugar")
    private String lugar;

    @Column(name = "tipo_comida")
    private String tipoComida;

    public Integer getIdRestauranteRecomendado() {
        return idRestauranteRecomendado;
    }

    public void setIdRestauranteRecomendado(Integer idRestauranteRecomendado) {
        this.idRestauranteRecomendado = idRestauranteRecomendado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getTipoComida() {
        return tipoComida;
    }

    public void setTipoComida(String tipoComida) {
        this.tipoComida = tipoComida;
    }

    @Override
    public String toString() {
        return "RestauranteRecomendado{" +
                "nombre='" + nombre + '\'' +
                ", lugar='" + lugar + '\'' +
                ", tipoComida='" + tipoComida + '\'' +
                '}';
    }
}
