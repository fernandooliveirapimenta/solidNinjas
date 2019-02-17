package com.fernando.services;

import com.fernando.ProdutoRest;
import com.fernando.cap3.NotaFiscal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ProdudoService {

    @Autowired
    @Qualifier("pr")
    private ProdutoRest produtoRest;

    @Autowired
    @Qualifier("b2")
    private BocaService bocaService;

    public void showProduct(){
        NotaFiscal produtos = produtoRest.produtos();
        System.out.println(bocaService.falar());
        System.out.println("produtos");
    }
}
