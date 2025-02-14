package br.com.fiap.calorias.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Objects;


@Setter
@Getter
@Entity
@Table(name = "tbl_contatos")
public class Contato {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "CONTATOS_SEQ"
    )
    @SequenceGenerator(
            name = "CONTATOS_SEQ",
            sequenceName = "CONTATOS_SEQ",
            allocationSize = 50
    )
    private Long id;
    private String nome;
    private String email;

    @Column(name = "data_nascimento")
    private LocalDate dataNasc;

    @Override
    public boolean equals(Object o) {   // método que checa se um objeto tem os mesmos campos que outro em memória
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return Objects.equals(id, contato.id) && Objects.equals(nome, contato.nome) && Objects.equals(email, contato.email) && Objects.equals(dataNasc, contato.dataNasc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, email, dataNasc);
    }
}
