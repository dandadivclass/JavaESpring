package br.com.agenda.model;

import br.com.agenda.enums.StatusLeitura;

import java.util.Date;

public class Livros {

    private int id_livro;

    private String titulo_livro;
    private String autor;
    private  String genero;
    private  int paginas_lidas;
    private int avaliacao;
    private StatusLeitura statusLeitura;
    private Biblioteca biblioteca;
    private int id_biblioteca;


    public Livros() {

    }

    //comecei a leitura
    public Livros(String titulo_livro, String autor, String genero, StatusLeitura statusLeitura, Biblioteca biblioteca, int id_biblioteca) {
        this.titulo_livro = titulo_livro;
        this.autor = autor;
        this.genero = genero;
        this.statusLeitura = statusLeitura;
        this.biblioteca = biblioteca;
        this.id_biblioteca = id_biblioteca;
    }

    //finalizei a leitura e vou avaliá-la
    public Livros(String titulo_livro, String autor, String genero, int paginas_lidas, int avaliacao, StatusLeitura statusLeitura, Biblioteca biblioteca, int id_biblioteca) {
        this.titulo_livro = titulo_livro;
        this.autor = autor;
        this.genero = genero;
        this.paginas_lidas = paginas_lidas;
        this.avaliacao = avaliacao;
        this.statusLeitura = statusLeitura;
        this.biblioteca = biblioteca;
        this.id_biblioteca = id_biblioteca;
    }

    @Override
    public String toString() {
        return "Livros{" +
                "id_livro=" + id_livro +
                ", titulo_livro='" + titulo_livro + '\'' +
                ", autor='" + autor + '\'' +
                ", genero='" + genero + '\'' +
                ", paginas_lidas=" + paginas_lidas +
                ", avaliacao=" + avaliacao +
                ", statusLeitura=" + statusLeitura +
                ", biblioteca=" + biblioteca +
                ", id_biblioteca=" + id_biblioteca +
                '}';
    }


    public int getId_livro() {
        return id_livro;
    }

    public void setId_livro(int id_livro) {
        this.id_livro = id_livro;
    }

    public String getTitulo_livro() {
        return titulo_livro;
    }

    public void setTitulo_livro(String titulo_livro) {
        this.titulo_livro = titulo_livro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getPaginas_lidas() {
        return paginas_lidas;
    }

    public void setPaginas_lidas(int paginas_lidas) {
        this.paginas_lidas = paginas_lidas;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public StatusLeitura getStatusLeitura() {
        return statusLeitura;
    }

    public void setStatusLeitura(StatusLeitura statusLeitura) {
        this.statusLeitura = statusLeitura;
    }

    public Biblioteca getBiblioteca() {
        return biblioteca;
    }

    public void setBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    public int getId_biblioteca() {
        return id_biblioteca;
    }

    public void setId_biblioteca(int id_biblioteca) {
        this.id_biblioteca = id_biblioteca;
    }
}
