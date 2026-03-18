package br.com.fiapride.main;

import br.com.fiapride.model.Veiculos;

public class Principal {

    public static void main(String[] args) {
        
        Veiculos v1 = new Veiculos("Carlos", "ABC-1234");
        
        v1.adicionarGas(50);
        v1.gastouGas(100);
        
        System.out.println("Nome: " + v1.getNome() + " | Placa: " + v1.getPlaca() + " | Gasolina: " + v1.getGas());
    }
}