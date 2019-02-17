package com.fernando.padraoBuilder;

import java.time.Instant;

public class Test {

    public static void main(String[] args) {
       Caixa caixa = CaixaBuilder.aCaixa().x1("10").x2("20").x3("10").x4("20").dataCriacao(Instant.now()).build();
        System.out.println(caixa);
    }
}
