package com.fernando;

import com.fernando.cap3.NotaFiscal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/produto")
public interface ProdutoRest {

    @GetMapping
    public NotaFiscal produtos();
}
