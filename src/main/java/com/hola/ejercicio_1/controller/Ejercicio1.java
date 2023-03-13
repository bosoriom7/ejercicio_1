package com.hola.ejercicio_1.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class Ejercicio1 {

    @GetMapping("/")
    public String saludo(){
        return "Estoy saludando";
    }

    @GetMapping("/")
    public String despedida(){
        return "Me estoy despidiendo";
    }

    @GetMapping("/")
    public String caminando(){
        return "Estoy caminando";
    }



}
