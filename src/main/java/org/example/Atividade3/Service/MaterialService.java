package org.example.Atividade3.Service;

import org.example.Atividade3.DAO.MaterialDAO;
import org.example.Atividade3.Model.MaterialModel;

import java.sql.SQLException;

public class MaterialService
{
    private MaterialDAO dao;

    public MaterialService (MaterialDAO dao)
    {
        this.dao = dao;
    }

    public void registrarLote(String nome, double peso, String fornecedor)
    {
        if(peso < 1.0)
        {
            System.out.println("WEG não aceita lotes menores de 1KG.");
            return;
        }

        MaterialModel materialModel = new MaterialModel(nome, peso, fornecedor);

        try
        {
            dao.inserir(materialModel);
            System.out.println("Lote Registrado");
        } catch (SQLException e) {
            System.out.println("ERRO: Falha na conexão ou em inserir :" + e.getMessage());
        }
    }
}
