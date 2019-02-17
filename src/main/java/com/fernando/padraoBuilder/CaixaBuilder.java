package com.fernando.padraoBuilder;

import java.time.Instant;

public final class CaixaBuilder {
    private Caixa caixa;

    private CaixaBuilder() {
        caixa = new Caixa();
    }

    public static CaixaBuilder aCaixa() {
        return new CaixaBuilder();
    }

    public CaixaBuilder x1(String x1) {
        caixa.setX1(x1);
        return this;
    }

    public CaixaBuilder x2(String x2) {
        caixa.setX2(x2);
        return this;
    }

    public CaixaBuilder x3(String x3) {
        caixa.setX3(x3);
        return this;
    }

    public CaixaBuilder x4(String x4) {
        caixa.setX4(x4);
        return this;
    }

    public CaixaBuilder dataCriacao(Instant dataCriacao) {
        caixa.setDataCriacao(dataCriacao);
        return this;
    }

    public Caixa build() {
        return caixa;
    }
}
