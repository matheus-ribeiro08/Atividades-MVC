package org.example.Atividade4.DAO;

import org.example.Atividade3.DAO.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MotoresDAO
{
    public double buscarLimite(String modelo)
    {
        String sql = "SELECT limite_temperatura FROM normas_tecnicas WHERE modelo_motor = ?";

        try(Connection conn = ConnectionFactory.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql))
        {
            stmt.setString(1, modelo);
            ResultSet rs = stmt.executeQuery();

            if(rs.next())
            {
                return rs.getDouble("limite_temperatura");
            }
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        return -1;
    }
}
