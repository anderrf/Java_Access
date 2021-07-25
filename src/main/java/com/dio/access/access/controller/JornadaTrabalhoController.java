package com.dio.access.access.controller;

import com.dio.access.access.model.JornadaTrabalho;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jornada")
public class JornadaTrabalhoController {

    @PostMapping
    public JornadaTrabalho createJornada(){
        return null;
    }
}
