package org.example.Atividade2.Controller;

import org.example.Atividade2.Service.ColaboradorService;
import org.example.Atividade2.View.ColaboradorView;

public class ColaboradorController
{
    private ColaboradorService service;
    private ColaboradorView view;

    public ColaboradorController(ColaboradorService service, ColaboradorView view)
    {
        this.service = service;
        this.view = view;
    }

    public void iniciarCadastro()
    {
        String nome = view.solicitarNome();
        String email = view.solicitarEmail();

        if(nome.isEmpty() || email.isEmpty())
        {
            view.mostrarErro("Nome e email estão vazios.");
            return;
        }

        boolean sucesso = service.salvarColaborador(nome, email);

        if(sucesso)
        {
            view.mostrarResultado(service.getModel().getNome(), service.getModel().getEmail());
        }
        else{
            view.mostrarErro("Email inválido, deve seguir o padrão @weg.net");
        }
    }
}
