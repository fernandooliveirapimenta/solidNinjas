package com.fernando;

import com.fernando.cap3.NotaFiscal;
import com.fernando.services.AcaoPosSalvar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.List;

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

	@Bean(name = "acoes")
	public List<AcaoPosSalvar> acoes(@Qualifier("postFirebase") AcaoPosSalvar firebase,
									 @Qualifier("postLog") AcaoPosSalvar log) {
		return Arrays.asList(firebase, log);
	}

}

