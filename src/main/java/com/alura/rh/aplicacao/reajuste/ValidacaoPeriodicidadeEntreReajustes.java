package com.alura.rh.aplicacao.reajuste;

import com.alura.rh.ValidacaoException;
import com.alura.rh.model.Funcionario;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ValidacaoPeriodicidadeEntreReajustes implements ValidacaoReajuste{

    public void validar(Funcionario funcionario, BigDecimal aumento) {
        LocalDate dataUltimoReajuste = funcionario.getDataUltimoReajuste();
        LocalDate now = LocalDate.now();
        long mesesDesdeUltimoReajuste = ChronoUnit.MONTHS.between(dataUltimoReajuste, now);
        if(mesesDesdeUltimoReajuste < 6) {
            throw new ValidacaoException("Regra 2: Intervalo entre reajustes deve ser no minimo de 6 meses");
        }
    }
}
