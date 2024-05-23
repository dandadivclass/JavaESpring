package br.com.fiap.contatos.dto;

import java.time.LocalDate;

// classe de dados utilizada para a criação de um novo cadastro no backend
public record ContatoCadastroDto(
        Long id,
        String nome,
        String email,
        String senha,
        LocalDate dataNascimento
) {

}
