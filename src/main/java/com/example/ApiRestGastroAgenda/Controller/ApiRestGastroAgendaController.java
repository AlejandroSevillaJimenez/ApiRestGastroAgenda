package com.example.ApiRestGastroAgenda.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class ApiRestGastroAgendaController {

    @GetMapping(name = "saludo/")
    public String saludo(){
        return "Hola, buenos días!";
    }

}
