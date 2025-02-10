package br.com.agenda.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    //nome do usuário do banco de dados
    private static final String USERNAME = "root";

    //senha do banco
    private static final String PASSWORD = "d@wkDjpEp7LWO";

    //caminho do banco, a porta e o nome da conexão
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/crud";

    /*
    * Conexão com o banco de dados
    * */

    public static Connection createConnectionToMySQL() throws ClassNotFoundException, SQLException {

        //classe sendo carregada pela JVM
        Class.forName("com.mysql.cj.jdbc.Driver");

        //criando a conexão
        return DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        //recuperando conexão ativa

        Connection connection = createConnectionToMySQL();

        //checando se não é nula
        if(connection !=null ) {
            System.out.println("Conexão feita");
            connection.close();
        }
    }
}
