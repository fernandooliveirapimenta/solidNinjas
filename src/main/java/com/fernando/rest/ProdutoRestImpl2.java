package com.fernando.rest;

import com.fernando.ProdutoRest;
import com.fernando.cap3.NotaFiscal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Primary
@Component(value = "pr")
public class ProdutoRestImpl2  implements ProdutoRest {

    @Autowired
    @Qualifier("nf")
    private NotaFiscal notaFiscal;

    @Override
    public NotaFiscal produtos() {
        return notaFiscal;
    }
}
