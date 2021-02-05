package com.alura.rh.aplicacao.promocao;

import com.alura.rh.ValidacaoException;
import com.alura.rh.model.Cargo;
import com.alura.rh.model.Funcionario;

public class PromocaoUseCase {

    public void promover(Funcionario funcionario, boolean metaBatida) {

        if(!metaBatida) {
            throw new ValidacaoException("Regra 1: Funcionario nao bateu a meta ");
        }

        Cargo cargoAtual = funcionario.getCargo();

        if(cargoAtual.equals(Cargo.GERENTE)) {
            throw new ValidacaoException("Regra 2: Só é promovido cargos abaixo de " + cargoAtual.name());
        }

        Cargo novoCargo = cargoAtual.getProximoCargo();
        funcionario.promover(novoCargo);

    }
}
