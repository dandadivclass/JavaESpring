package br.com.fiap.contatos.dto;

//classe de exibição dos dados do contato!

import br.com.fiap.contatos.model.Contato;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;

public record ContatoExibicaoDto(

        Long id,
        String nome,
        String email,
        LocalDate dataNascimento
) {

    public ContatoExibicaoDto(Contato contato){
        this(
                contato.getId(),
                contato.getNome(),
                contato.getEmail(),
                contato.getDataNasc());
    }
}
