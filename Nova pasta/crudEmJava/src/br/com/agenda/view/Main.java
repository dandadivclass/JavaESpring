package br.com.agenda.view;

import br.com.agenda.dao.BibliotecaDAO;
import br.com.agenda.dao.ContatoDAO;
import br.com.agenda.dao.LivrosDAO;
import br.com.agenda.model.Biblioteca;
import br.com.agenda.model.Contato;
import br.com.agenda.model.Livros;

import java.sql.SQLException;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        //inserindo registros no banco

        /* ContatoDAO contatoDAO = new ContatoDAO();

        Contato primeiroContato = new Contato();
        primeiroContato.setNome("Sinval Pereira");
        primeiroContato.setIdade(40);
        primeiroContato.setDataCadastro(new Date());

        contatoDAO.save(primeiroContato);
         */

        BibliotecaDAO bibliotecaDAO = new BibliotecaDAO();
        Biblioteca livrosLidos = new Biblioteca();
        livrosLidos.setNome_biblioteca("Livros lidos em 2024");
        livrosLidos.setDescricao("Aqui está os livros que li no ano de 2024 e suas avaliações! Para recordar o que senti ao lê-los");

        //bibliotecaDAO.save(livrosLidos);



        LivrosDAO livrosDAO = new LivrosDAO();
        Livros segundoLivro = new Livros();
        segundoLivro.setTitulo_livro("A metamorfose");
        segundoLivro.setAutor("Franz Kafka");
        //primeiroLivro.setAno_publicacao(new Date());
        segundoLivro.setGenero("Novela");
        segundoLivro.setPaginas_lidas(90);
        segundoLivro.setAvaliacao(5);
        segundoLivro.setId_biblioteca(1);
        segundoLivro.setBiblioteca(livrosLidos);

        //livrosDAO.save(segundoLivro);

        //contatoDAO.save(primeiroContato);

        //atualizando contato

        /* Contato segundoContato = new Contato();
        segundoContato.setNome("Elena Carvalho");
        segundoContato.setIdade(4);
        segundoContato.setDataCadastro(new Date());
        segundoContato.setId(2);

         */

        //contatoDAO.updateContatos(segundoContato);
        segundoLivro.setAvaliacao(4);
        segundoLivro.setId_livro(2);
        livrosDAO.updateLivros(segundoLivro);

        //removendo registro do banco

        // contatoDAO.deleteContatos(4);
        //livrosDAO.deleteLivros(1);

        //visualizando todos os registros no banco

        /* for (Contato c : contatoDAO.readContatos()) {
            System.out.println("Contato: "+c.getNome());
            System.out.println("Data de cadastro: "+c.getDataCadastro());
        }

         */

        for (Livros l : livrosDAO.readLivros()) {
            System.out.println("Livro: "+l.getTitulo_livro());
            System.out.println("Avaliação: "+l.getAvaliacao());
        }

        for (Biblioteca b : bibliotecaDAO.readBibliotecas()) {
            System.out.println("Biblioteca: "+ b.getNome_biblioteca());
            System.out.println("Seus livros: "+ b.getLivros());
        }



    }
}
