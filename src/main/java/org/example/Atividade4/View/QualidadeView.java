package org.example.Atividade4.View;

import org.example.Atividade4.Controller.TemperaturaController;
import org.example.Atividade4.DAO.MotoresDAO;
import org.example.Atividade4.Service.QualidadeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QualidadeView {
    private Scanner scanner = new Scanner(System.in);

    public String solicitarModelo()
    {
        System.out.print("Informe o modelo do motor (ex: W22): ");
        return scanner.nextLine();
    }

    public List<Double> solicitarTemperaturas()
    {
        List<Double> lista = new ArrayList<>();
        System.out.println("Digite as temperaturas aferidas (digite -1 para parar):");

        while (true)
        {
            System.out.print("Temp (°C): ");
            try
            {
                double temp = Double.parseDouble(scanner.nextLine());
                if (temp == -1) break;
                lista.add(temp);
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido.");
            }
        }
        return lista;
    }

    public void mostrar(String resultado) {
        System.out.println("\n=== RESULTADO DO CONTROLE DE QUALIDADE ===");
        System.out.println("Status: " + resultado);
    }

        public static void main(String[] args) {
            MotoresDAO dao = new MotoresDAO();
            QualidadeService service = new QualidadeService(dao);
            QualidadeView view = new QualidadeView();
            TemperaturaController controller = new TemperaturaController(service, view);

            controller.iniciarTeste();
        }
    }
