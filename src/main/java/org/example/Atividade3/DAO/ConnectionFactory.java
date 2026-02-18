package org.example.Atividade3.DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    // Conexão com o Banco de Dados
    public static Connection getConnection ()
    {
        String url = "jdbc:mysql://localhost:3306/Matheus?useSSL=false&serverTimezone=UTC";
        String user = "root";
        String senha = "";

        Connection conn = null;

        try
        {
            return conn = DriverManager.getConnection(url, user, senha);
        }
        catch (SQLException e) {
            System.err.println("Erro ao conectar ao banco");
        }
        return conn;
    }
}