package br.com.agenda.dao;

import br.com.agenda.factory.ConnectionFactory;
import br.com.agenda.model.Biblioteca;
import br.com.agenda.model.Livros;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BibliotecaDAO {
    public void save(Biblioteca biblioteca) throws SQLException, ClassNotFoundException {

        String create = "INSERT INTO BIBLIOTECAS (NOME_BIBLIOTECA, DESCRICAO) VALUES (?, ?)";

        Connection connection = null;
        PreparedStatement statement = null;

        try {

            //cria uma conexão com o banco de dados
            connection = ConnectionFactory.createConnectionToMySQL();

            //executa a query
            statement = connection.prepareStatement(create);

            //adicionando os values da query
            statement.setString(1, biblioteca.getNome_biblioteca());
            statement.setString(2, biblioteca.getDescricao());

            statement.execute();
            System.out.println("Biblioteca registrada com sucesso!");
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

    public List<Biblioteca> readBibliotecas() {

        String read = "SELECT * FROM BIBLIOTECAS";

        List<Biblioteca> listaBibliotecas = new ArrayList<Biblioteca>();

        Connection connection = null;
        PreparedStatement statement = null;

        // classe que recupera os dados do banco
        ResultSet resultSet = null;

        try {
            connection = ConnectionFactory.createConnectionToMySQL();

            statement = connection.prepareStatement(read);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Biblioteca biblioteca = new Biblioteca();

                //recuperar os dados da tabela
                biblioteca.setId_biblioteca(resultSet.getInt("ID"));
                biblioteca.setNome_biblioteca(resultSet.getString("NOME_BIBLIOTECA"));
                biblioteca.setDescricao(resultSet.getString("DESCRICAO"));

                listaBibliotecas.add(biblioteca);
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
        return listaBibliotecas;
    }

    public void updateBibliotecas (Biblioteca biblioteca) throws SQLException {

        String update = "UPDATE BIBLIOTECAS SET NOME_BIBLIOTECA = ?" +
                "WHERE ID = ?";

        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection = ConnectionFactory.createConnectionToMySQL();

            statement = connection.prepareStatement(update);

            statement.setString(1, biblioteca.getNome_biblioteca());

            // id do registro que desejamos atualizar
            statement.setInt(2, biblioteca.getId_biblioteca());

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

    public void deleteBibliotecas (int id) throws SQLException, ClassNotFoundException {

        String delete = "DELETE FROM BIBLIOTECAS WHERE ID = ?";

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
