package org.example.Atividade4.Controller;

import org.example.Atividade4.Service.QualidadeService;
import org.example.Atividade4.View.QualidadeView;
import java.util.List;

public class TemperaturaController {
    private QualidadeService service;
    private QualidadeView view;

    public TemperaturaController(QualidadeService service, QualidadeView view) {
        this.service = service;
        this.view = view;
    }

    public void iniciarTeste() {

        String modelo = view.solicitarModelo();
        List<Double> temperaturas = view.solicitarTemperaturas();

        String resultado = service.avaliarMotor(modelo, temperaturas);

        view.mostrar(resultado);
    }
}