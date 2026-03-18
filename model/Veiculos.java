package br.com.fiapride.model;

public class Veiculos {
    
    private String nome;
    private String placa;
    private double gas;
    
    public Veiculos(String nome, String placa) {
        this.nome = nome;
        this.placa = placa;
        this.gas = 0;
    }

    public void adicionarGas(double v) {
        gas += v;
    }
    
    public void gastouGas(double v) {
        gas -= v;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getGas() {
        return gas;
    }

    public void setGas(double gas) {
        this.gas = gas;
    }
}