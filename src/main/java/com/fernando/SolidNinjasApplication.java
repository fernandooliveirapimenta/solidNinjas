package com.fernando;

import com.fernando.cap3.NotaFiscal;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SolidNinjasApplication {

	public static void main(String[] args) {
		SpringApplication.run(SolidNinjasApplication.class, args);
	}

	@Bean(name = "nf")
	public NotaFiscal notaFiscal(){
		NotaFiscal nf = new NotaFiscal();
		nf.setNome("Nota fiscal bean");
		return nf;
	}

}

