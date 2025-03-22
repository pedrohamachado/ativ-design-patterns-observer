package br.edu.imepac.observer;


import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BigDecimal valorInicial = new BigDecimal("1900.0");
        BigDecimal desconto = new BigDecimal("10.0");

        Gerente gerente = new Gerente("João");
        Estoque estoque = new Estoque("Camiseta", valorInicial, desconto);

        estoque.attach(gerente); // Anexando o gerente ao estoque
        estoque.setValor(valorInicial); // Atualiza o valor e notifica o gerente
    }
}

