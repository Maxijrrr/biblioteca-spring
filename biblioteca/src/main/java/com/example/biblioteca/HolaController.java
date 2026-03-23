package com.example.biblioteca;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Define que esta clase manejará peticiones REST
@RestController
public class HolaController {

    // Mapea la URL http://localhost:8080/saludo
    @GetMapping("/saludo")
    public String saludar() {
        return "¡Configuración exitosa! Tu aplicación Spring Boot está funcionando.";
    }
}