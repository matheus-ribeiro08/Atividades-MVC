package org.example.Atividade1.View;

import org.example.Atividade1.Controller.MotorController;
import org.example.Atividade1.Model.Motor;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MotorView
{
    private Scanner s;

    public MotorView()
    {
        this.s = new Scanner(System.in);
    }

    public double solicitarPotencia()
    {
        System.out.println("Digite a potencia em CV: ");
        try {
            return s.nextDouble();
        }catch (InputMismatchException e)
        {
            s.next();
            return -1;
        }
    }

    public void mostrarResultado(double potenciaCV, double potenciaKW)
    {
        System.out.println("------------------------------");
        System.out.println("Potências: ");
        System.out.println("CV: " + potenciaCV);
        System.out.println("KW: " + potenciaKW);
        System.out.println("------------------------------");
    }

    public void Erro(String m)
    {
        System.out.println("Erro: " + m);
    }
    public static void main(String[] args)
    {
        Motor model = new Motor();
        MotorView view = new MotorView();
        MotorController controller = new MotorController(model, view);

        controller.validarPositivoCalculo();
    }
}
