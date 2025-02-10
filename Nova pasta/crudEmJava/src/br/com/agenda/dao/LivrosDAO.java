package br.com.agenda.dao;

import br.com.agenda.factory.ConnectionFactory;
import br.com.agenda.model.Biblioteca;
import br.com.agenda.model.Contato;
import br.com.agenda.model.Livros;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LivrosDAO {

    public void save(Livros livro) throws SQLException, ClassNotFoundException {

        String create = "INSERT INTO LIVROS (TITULO_LIVRO, AUTOR, GENERO, PAGINAS_LIDAS, AVALIACAO, ID_BIBLIOTECA) VALUES (?, ?, ?, ?, ?, ?)";

        Connection connection = null;
        PreparedStatement statement = null;

        try {

            //cria uma conexão com o banco de dados
            connection = ConnectionFactory.createConnectionToMySQL();

            //executa a query
            statement = connection.prepareStatement(create);

            //adicionando os values da query
            statement.setString(1, livro.getTitulo_livro());
            statement.setString(2, livro.getAutor());
            //statement.setDate(4, livro.getAno_publicacao());
            statement.setString(4, livro.getGenero());
            statement.setInt(5, livro.getPaginas_lidas());
            statement.setInt(6, livro.getAvaliacao());
            statement.setInt(7, livro.getId_biblioteca());

            statement.execute();
            System.out.println("Livro registrado com sucesso!");

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            //fechando conexões
            try {
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public List<Livros> readLivros() {

        String read = "SELECT * FROM LIVROS";

        List<Livros> listaLivros = new ArrayList<Livros>();

        Connection connection = null;
        PreparedStatement statement = null;

        // classe que recupera os dados do banco
        ResultSet resultSet = null;

        try {
            connection = ConnectionFactory.createConnectionToMySQL();

            statement = connection.prepareStatement(read);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Livros livros = new Livros();

                //recuperar os dados da tabela
                livros.setId_livro(resultSet.getInt("ID"));
                livros.setTitulo_livro(resultSet.getString("TITULO_LIVRO"));
                livros.setAutor(resultSet.getString("AUTOR"));
                //livros.setAno_publicacao(resultSet.getDate("ANO_PUBLICACAO"));
                livros.setGenero(resultSet.getString("GENERO"));
                livros.setPaginas_lidas(resultSet.getInt("PAGINAS_LIDAS"));
                livros.setAvaliacao(resultSet.getInt("AVALIACAO"));
                livros.setId_biblioteca(resultSet.getInt("ID_BIBLIOTECA"));


                listaLivros.add(livros);

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }

                if (statement != null) {
                    statement.close();
                }

                if (connection != null) {
                    connection.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return listaLivros;
    }

    public void updateLivros (Livros livros) throws SQLException {

        String update = "UPDATE LIVROS SET AVALIACAO = ? WHERE ID = ?";

        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection = ConnectionFactory.createConnectionToMySQL();

            statement = connection.prepareStatement(update);

            statement.setInt(1, livros.getAvaliacao());

            // id do registro que desejamos atualizar
            statement.setInt(2, livros.getId_livro());

            statement.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                if(statement!=null){
                    statement.close();
                }
                if(connection!=null){
                    connection.close();
                }
            }
            catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }


    }

    public void deleteLivros (int id) throws SQLException, ClassNotFoundException {

        String delete = "DELETE FROM LIVROS WHERE ID = ?";

        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection = ConnectionFactory.createConnectionToMySQL();
            statement =  connection.prepareStatement(delete);

            statement.setInt(1, id);

            statement.execute();

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                if(statement!=null){
                    statement.close();
                }
                if(connection!=null){
                    connection.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
