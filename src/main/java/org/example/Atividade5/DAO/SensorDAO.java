package org.example.Atividade5.DAO;

import org.example.Atividade3.DAO.ConnectionFactory;
import org.example.Atividade5.Model.RegistroSensorModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SensorDAO
{
    public void salvar(RegistroSensorModel registro)
    {
        String sql = "INSERT INTO registro_sensor (nome_sensor, vibracao) VALUES (?, ?, ?)";

        try(Connection conn = ConnectionFactory.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql))
        {
            stmt.setString(1, registro.getNomeSensor());
            stmt.setDouble(2, registro.getVibracao());
            stmt.executeUpdate();
        }
        catch (SQLException e)
        {
            System.err.println("Erro ao salvar no banco");
        }
    }
    public List<RegistroSensorModel> buscarTodos()
    {
        List<RegistroSensorModel> lista = new ArrayList<>();

        String sql = "SELECT * FROM registro_sensor";

        try(Connection conn = ConnectionFactory.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql))
        {
            ResultSet rs = stmt.executeQuery();

            while(rs.next())
            {
                lista.add(new RegistroSensorModel(
                        rs.getInt("id"),
                        rs.getString("nome_sensor"),
                        rs.getDouble("vibracao")
                ));

            }
        }catch (SQLException e)
        {
            System.err.println("Erro ao buscar dados: " + e.getMessage());
        }
        return lista;
    }
}
