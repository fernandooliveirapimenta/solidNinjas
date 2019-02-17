package com.fernando.cap4;

import com.fernando.Compra;

public class CalculadoraDePrecos {

    private TabelaDePreco tabela;
    private ServicoDeEntrega correios;

    CalculadoraDePrecos(TabelaDePreco tabele,
                        ServicoDeEntrega correios) {
        this.tabela = tabele;
        this.correios = correios;
    }

    private double calcula(Compra produto){

        double desconto = tabela.descontoPara(produto.getValor());
        double frete = correios.para(produto.getCidade());

        return produto.getValor() * (1-desconto) + frete;
    }
}
