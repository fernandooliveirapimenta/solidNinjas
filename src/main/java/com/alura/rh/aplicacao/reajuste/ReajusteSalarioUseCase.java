package com.alura.rh.aplicacao.reajuste;

import com.alura.rh.model.Funcionario;

import java.math.BigDecimal;
import java.util.List;

public class ReajusteSalarioUseCase {

    private final List<ValidacaoReajuste> validacoes;

    public ReajusteSalarioUseCase(List<ValidacaoReajuste> validacoes) {
        this.validacoes = validacoes;
    }

    /**
     *  Regra 1: aumento nao pode ser superior a 40% do salario atual
     *  Regra 2: Intervalo entre reajustes deve ser no minimo de 6 meses
     */
    public void reajustarSalario(Funcionario funcionario, BigDecimal aumento) {
        validacoes.forEach(v -> v.validar(funcionario, aumento));
        BigDecimal salarioAtual = funcionario.getSalario();
        BigDecimal salarioReajustado = salarioAtual.add(aumento);
        funcionario.atualizarSalario(salarioReajustado);
    }


}
