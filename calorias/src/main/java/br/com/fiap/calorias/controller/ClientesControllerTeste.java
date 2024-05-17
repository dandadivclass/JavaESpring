package br.com.fiap.calorias.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/apiC")
public class ClientesControllerTeste {

    @GetMapping("/consulta")
    public String consultar() {
        return "Cliente número 10.";
    }

}
