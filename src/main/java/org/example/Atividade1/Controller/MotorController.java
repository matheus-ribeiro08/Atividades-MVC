package org.example.Atividade1.Controller;

import org.example.Atividade1.Model.Motor;
import org.example.Atividade1.View.MotorView;

public class MotorController
{
    Motor mode;

    public MotorController(Motor mode) {
        this.mode = mode;
    }

    public MotorController(MotorView view) {
        this.view = view;
    }

    public MotorController(Motor mode, MotorView view)
    {
        this.view = view;
        this.mode = mode;
    }

    public Motor getMode() {
        return mode;
    }

    public void setMode(Motor mode) {
        this.mode = mode;
    }

    public MotorView getView() {
        return view;
    }

    public void setView(MotorView view) {
        this.view = view;
    }

    MotorView view;

    public void validarPositivoCalculo()
    {
        double valor = view.solicitarPotencia();

        if(valor > 0)
        {
            mode.setPotencia(valor);

            double potenciaKW = mode.getPotencia() * 0.7355;

            view.mostrarResultado(mode.getPotencia(), potenciaKW);
        }
        else {
            view.Erro("Valor Invalido, Digite apenas numeros positivos");
        }
    }

}
