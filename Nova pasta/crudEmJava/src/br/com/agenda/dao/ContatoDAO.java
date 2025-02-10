package br.com.agenda.dao;

import br.com.agenda.factory.ConnectionFactory;
import br.com.agenda.model.Contato;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ContatoDAO {

    //CRUD - Create, Read, Update, Delete

    public void save(Contato contato) throws SQLException, ClassNotFoundException {

        String create = "INSERT INTO CONTATOS (NOME, IDADE, DATACADASTRO) VALUES (?, ?, ?)";

        Connection connection = null;
        PreparedStatement statement = null;

        try {

            //cria uma conexão com o banco de dados
            connection = ConnectionFactory.createConnectionToMySQL();

            //executa a query
            statement = connection.prepareStatement(create);

            //adicionando os values da query
            statement.setString(1, contato.getNome());
            statement.setInt(2, contato.getIdade());
            statement.setDate(3, new Date(contato.getDataCadastro().getTime()));

            statement.execute();
            System.out.println("Contato salvo com sucesso!");
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

    public List<Contato> readContatos() {

        String read = "SELECT * FROM CONTATOS";

        List<Contato> listaContatos = new ArrayList<Contato>();

        Connection connection = null;
        PreparedStatement statement = null;

        // classe que recupera os dados do banco
        ResultSet resultSet = null;

        try {
            connection = ConnectionFactory.createConnectionToMySQL();

            statement = connection.prepareStatement(read);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Contato contatos = new Contato();

                //recuperar os dados da tabela
                contatos.setId(resultSet.getInt("ID"));
                contatos.setNome(resultSet.getString("NOME"));
                contatos.setIdade(resultSet.getInt("IDADE"));
                contatos.setDataCadastro(resultSet.getDate("DATACADASTRO"));

                listaContatos.add(contatos);
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
        return listaContatos;
    }

    public void updateContatos (Contato contato) throws SQLException {

        String update = "UPDATE CONTATOS SET NOME = ?, IDADE = ?, DATACADASTRO = ? " +
                "WHERE ID = ?";

        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection = ConnectionFactory.createConnectionToMySQL();

            statement = connection.prepareStatement(update);

            statement.setString(1, contato.getNome());
            statement.setInt(2, contato.getIdade());
            statement.setDate(3, new Date(contato.getDataCadastro().getTime()));

            // id do registro que desejamos atualizar
            statement.setInt(4, contato.getId());

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

    public void deleteContatos(int id) throws SQLException, ClassNotFoundException {

        String delete = "DELETE FROM CONTATOS WHERE ID = ?";

        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection = ConnectionFactory.createConnectionToMySQL();
            statement =  connection.prepareStatement(delete);

            statement.setInt(1, 4);

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