package org.example.Atividade2.Service;

import org.example.Atividade2.Model.ColaboradorModel;

public class ColaboradorService
{
    private ColaboradorModel model;

    public ColaboradorService(ColaboradorModel model)
    {
        this.model = model;
    }

    public boolean salvarColaborador(String nome, String email)
    {
        if(email.endsWith("@weg.net"))
        {
            model.setNome(nome);
            model.setEmail(email);
            return true;
        }else{
            return false;
        }
    }

    public ColaboradorModel getModel()
    {
        return model;
    }

}
