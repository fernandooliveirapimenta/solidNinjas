package com.fernando.cap1;

public class DezOuVintePorCento implements RegraDeCalculo {

	@Override
	public double calcula(Funcionaio f) {
		// TODO Auto-generated method stub
		if(f.getSalario() > 3000.0) {
			return f.getSalario() * 0.8;
		} else {
			return f.getSalario() * 0.9;
		}
	}

}
