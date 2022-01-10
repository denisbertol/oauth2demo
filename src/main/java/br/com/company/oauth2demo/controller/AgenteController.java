package br.com.company.oauth2demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AgenteController {

    @GetMapping("/v1/agentes")
    @ResponseStatus(HttpStatus.OK)
    public String list(){
        return "Agentes";
    }

}
