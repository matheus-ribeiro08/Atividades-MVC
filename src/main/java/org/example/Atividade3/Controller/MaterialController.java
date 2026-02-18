package org.example.Atividade3.Controller;

import org.example.Atividade3.Service.MaterialService;
import org.example.Atividade3.View.MaterialView;

public class MaterialController
{
    private MaterialService service;
    private MaterialView view;

    public MaterialController(MaterialService service, MaterialView view)
    {
        this.service = service;
        this.view = view;
    }
    public void iniciar()
    {
        System.out.println("=== Sistema de Estoque WEG ===");

        String nome = view.pedirNome();
        double peso = view.pedirPeso();
        String fornecedor = view.pedirFornecedor();

        service.registrarLote(nome, peso, fornecedor);
    }

}
