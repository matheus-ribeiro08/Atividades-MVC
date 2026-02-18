package org.example.Atividade3.View;

import org.example.Atividade3.Controller.MaterialController;
import org.example.Atividade3.DAO.MaterialDAO;
import org.example.Atividade3.Service.MaterialService;

import java.util.Scanner;

public class MaterialView
{
    private Scanner s = new Scanner(System.in);

    public String pedirNome()
    {
        System.out.println("Nome do material: ");
        return s.nextLine();
    }
    public double pedirPeso()
    {
        System.out.println("Digite o peso: ");
        try
        {
            return Double.parseDouble(s.nextLine());
        } catch (NumberFormatException e) {
            return 0;
        }
    }
    public String pedirFornecedor()
    {
        System.out.println("Fornecedor: ");
        return s.nextLine();
    }

    public static void main(String[] args)
    {
        MaterialDAO dao = new MaterialDAO();
        MaterialView view = new MaterialView();
        MaterialService service = new MaterialService(dao);
        MaterialController controller = new MaterialController(service, view);

        controller.iniciar();
    }

}
