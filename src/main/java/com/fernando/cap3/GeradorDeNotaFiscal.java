package com.fernando.cap3;

import java.util.List;

public class GeradorDeNotaFiscal {

	
	public NotaFiscal gerar(List<AcaoAposGerarNota> acoes) {
		
		NotaFiscal nf = new NotaFiscal();
		
		for (AcaoAposGerarNota acaoAposGerarNota : acoes) {
			acaoAposGerarNota.executa(nf);
		}
		
		return nf;
	}
}
