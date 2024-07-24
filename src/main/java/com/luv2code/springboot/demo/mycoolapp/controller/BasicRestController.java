package com.luv2code.springboot.demo.mycoolapp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicRestController {

    @Value("${coach.name}")
    private String nomeTreinador;

    @Value("${team.name}")
    private String nomeTime;

    @GetMapping("/")
    public String helloWorld(){
        return "Hello World";
    }

    @GetMapping("/devtools")
    public String devtools(){
        return "devtools está atualizando automaticamente";
    }

    @GetMapping("/nomeTreinador")
    public String nomeTreinador(){
        return nomeTreinador;
    }

    @GetMapping("/nomeTime")
    public String nomeTime(){
        return nomeTime;
    }


}
