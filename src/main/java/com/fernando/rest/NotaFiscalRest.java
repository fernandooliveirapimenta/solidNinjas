package com.fernando.rest;

import com.fernando.cap3.NotaFiscal;
import com.fernando.services.ProdudoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/nf")
public class NotaFiscalRest {

    @Autowired
    private ProdudoService produdoService;

    @RequestMapping(path = "/{nome}")
    public NotaFiscal notaFiscal(@PathVariable String nome){
        System.out.println(nome);
        produdoService.showProduct();
        return new NotaFiscal();
    }
}
