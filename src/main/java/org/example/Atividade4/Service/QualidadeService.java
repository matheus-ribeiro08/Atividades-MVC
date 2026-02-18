package org.example.Atividade4.Service;


import org.example.Atividade4.DAO.MotoresDAO;

import java.util.List;

public class QualidadeService {
    private MotoresDAO dao;

    public QualidadeService(MotoresDAO dao) {
        this.dao = dao;
    }

    public String avaliarMotor(String modelo, List<Double> temperaturasMedidas)
    {
        double limiteTecnico = dao.buscarLimite(modelo);

        if (limiteTecnico == -1) {
            return "ERRO: Modelo não encontrado no banco de dados.";
        }

        for (Double temp : temperaturasMedidas) {
            if (temp > limiteTecnico) {
                return "REPROVADO (Sobreaquecimento: " + temp + "°C > Limite: " + limiteTecnico + "°C)";
            }
        }

        return "APROVADO (Dentro do limite de " + limiteTecnico + "°C)";
    }
}