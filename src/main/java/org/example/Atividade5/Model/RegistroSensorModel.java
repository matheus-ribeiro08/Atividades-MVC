package org.example.Atividade5.Model;

public class RegistroSensorModel
{
    private int id;

    public String getNomeSensor() {
        return nomeSensor;
    }

    public void setNomeSensor(String nomeSensor) {
        this.nomeSensor = nomeSensor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getVibracao() {
        return vibracao;
    }

    public void setVibracao(double vibracao) {
        this.vibracao = vibracao;
    }

    private String nomeSensor;
    private double vibracao;

    public RegistroSensorModel(String nomeSensor, double vibracao)
    {
        this.nomeSensor = nomeSensor;
        this.vibracao = vibracao;
    }

    public RegistroSensorModel(int id, String nomeSensor, double vibracao)
    {
        this.id = id;
        this.nomeSensor = nomeSensor;
        this.vibracao = vibracao;
    }
    @Override
    public String toString()
    {
        return "ID: " + id + " | Sensor: " + nomeSensor + " | Vibração: " + vibracao + " HZ";
    }
}
