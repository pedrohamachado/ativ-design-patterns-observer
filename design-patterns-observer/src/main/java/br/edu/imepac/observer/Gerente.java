package br.edu.imepac.observer;

import java.math.BigDecimal;

public class Gerente implements Observer {
    private String nome;

    public Gerente() {}

    public Gerente(String nome) { // Corrigido nome do parâmetro e a atribuição
        this.nome = nome;
    }

    @Override
    public void update(Estoque estoque) {
        BigDecimal limite = new BigDecimal("1000.0");

        if (estoque.getValor().compareTo(limite) > 0) {
            System.out.println("Gerente " + nome + ": Valor do produto "
                    + estoque.getProduto() + " é maior que 1000.");
        }
    }
}
