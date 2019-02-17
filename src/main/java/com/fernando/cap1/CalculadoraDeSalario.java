package com.fernando.cap1;

public class CalculadoraDeSalario {

	public double calcula(Funcionaio f) {
		
		return f.getCargo().getRegra().calcula(f);
	    
	}
}
