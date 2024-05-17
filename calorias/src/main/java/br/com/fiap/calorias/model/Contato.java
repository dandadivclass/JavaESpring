package br.com.fiap.calorias.model;

import jakarta.persistence.Entity;

import java.time.LocalDate;
import java.util.Objects;

@Entity
public class Contato {

    private Long id;
    private String nome;
    private String email;
    private LocalDate dataNasc;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

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
