package org.example.Atividade3.Model;

public class MaterialModel
{
    private String nome;
    private double peso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPreco(double peso) {
        this.peso = peso;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public MaterialModel(String nome, double peso, String fornecedor) {
        this.nome = nome;
        this.peso = peso;
        this.fornecedor = fornecedor;
    }
    private String fornecedor;
}
