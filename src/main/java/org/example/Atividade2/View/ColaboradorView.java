package org.example.Atividade2.View;

import org.example.Atividade2.Controller.ColaboradorController;
import org.example.Atividade2.Model.ColaboradorModel;
import org.example.Atividade2.Service.ColaboradorService;

import java.util.Scanner;

public class ColaboradorView
{
    private Scanner s;

    public ColaboradorView()
    {
        this.s = new Scanner(System.in);
    }
    public String solicitarNome()
    {
        System.out.println("Digite seu nome: ");
        return s.nextLine();
    }
    public String solicitarEmail()
    {
        System.out.println("Digite seu email: ");
        return s.nextLine();
    }
    public void mostrarResultado (String nome, String email)
    {
        System.out.println("--- Cadastro Realizado --- ");
        System.out.println("Colaborador: " + nome);
        System.out.println("Email: " + email);
        System.out.println("----------------------------");
    }
    public void mostrarErro(String e)
    {
        System.out.println("Erro: " + e);
    }

    public static void main(String[] args) {
        ColaboradorModel model = new ColaboradorModel();
        ColaboradorService service = new ColaboradorService(model);
        ColaboradorView view = new ColaboradorView();
        ColaboradorController controller = new ColaboradorController(service, view);

        controller.iniciarCadastro();
    }
}
