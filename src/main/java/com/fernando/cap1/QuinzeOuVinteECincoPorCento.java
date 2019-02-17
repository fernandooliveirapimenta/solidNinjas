package com.fernando.cap1;

public class QuinzeOuVinteECincoPorCento implements RegraDeCalculo {

	@Override
	public double calcula(Funcionaio f) {
		if(f.getSalario() > 2000.0) {
			return f.getSalario() * 0.75;
		} else {
			return f.getSalario() * 0.85;
		}
	}

}
