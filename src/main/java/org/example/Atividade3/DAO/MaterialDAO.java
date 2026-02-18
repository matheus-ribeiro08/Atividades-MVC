package org.example.Atividade3.DAO;

import org.example.Atividade3.Model.MaterialModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLDataException;
import java.sql.SQLException;

public class MaterialDAO
{
    public void inserir (MaterialModel material) throws SQLException
    {
        String sql = "INSERT INTO materiais (nome, peso, fornecedor) VALUES (?, ?, ?)";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql))
        {
            stmt.setString(1, material.getNome());
            stmt.setDouble(2, material.getPeso());
            stmt.setString(3, material.getFornecedor());

            stmt.execute();
        }
    }
}
