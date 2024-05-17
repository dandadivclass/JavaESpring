package br.com.fiap.calorias.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// a classe controller é a que controla as respostas para as requisições do usuário!
// ela guarda em si os endpoints (métodos) que contém as respostas que o usuário
// pode precisar

@RestController  // classe controlador que segue padrões REST
@RequestMapping("/api")   // mapeando a URL para que seja acessado a controller
public class HelloController {

    @GetMapping("hello")        // definindo a URL para acessar os endpoints através da controller
    // localhost:8080/api/hello
    public String hello(){
        return "Hello World!";
    }

    // localhost:8080/api/ola
    @GetMapping("ola")
    public String ola(){
        return "Olá Mundo!";
    }
}
