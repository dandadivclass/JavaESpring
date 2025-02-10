package br.com.agenda.model;

public class Biblioteca {

    private int id_biblioteca;
    private String nome_biblioteca;
    private String descricao;
    private Livros livros;
    public int getId_biblioteca() {
        return id_biblioteca;
    }

    public void setId_biblioteca(int id_biblioteca) {
        this.id_biblioteca = id_biblioteca;
    }

    public String getNome_biblioteca() {
        return nome_biblioteca;
    }

    public void setNome_biblioteca(String nome_biblioteca) {
        this.nome_biblioteca = nome_biblioteca;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Livros getLivros() {
        return livros;
    }

    public void setLivros(Livros livros) {
        this.livros = livros;
    }
}
