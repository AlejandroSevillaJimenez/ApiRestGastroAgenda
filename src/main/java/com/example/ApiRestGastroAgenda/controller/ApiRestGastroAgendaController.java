package com.example.ApiRestGastroAgenda.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class ApiRestGastroAgendaController {

    @GetMapping("saludo/")
    public String saludo(){

        return "Hola, buenos días!";

    }

}
