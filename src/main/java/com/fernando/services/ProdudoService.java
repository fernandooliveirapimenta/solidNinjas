package com.fernando.services;

import com.fernando.rest.ProdutoRest;
import com.fernando.cap3.NotaFiscal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

@Service
public class ProdudoService {

    private final ProdutoRest produtoRest;

    private final BocaService bocaService;

    private final List<AcaoPosSalvar> acoes;

    @Autowired
    public ProdudoService(@Qualifier("pr") ProdutoRest produtoRest,
                          @Qualifier("b2") BocaService bocaService,
                          @Qualifier("acoes") List<AcaoPosSalvar> acoes) {
        this.produtoRest = produtoRest;
        this.bocaService = bocaService;
        this.acoes = acoes;
    }

    public void showProduct(){
        NotaFiscal produtos = produtoRest.produtos();
        System.out.println(bocaService.falar());
        System.out.println("produtos");
        for (AcaoPosSalvar acoe : acoes) {
            acoe.acao(Instant.now());
        }
    }
}
