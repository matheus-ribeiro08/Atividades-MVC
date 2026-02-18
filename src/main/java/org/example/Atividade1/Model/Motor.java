package org.example.Atividade1.Model;

public class Motor
{
    public Motor()
    {

    }
    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public Motor(double potencia) {
        this.potencia = potencia;
    }

    private double potencia;
}
