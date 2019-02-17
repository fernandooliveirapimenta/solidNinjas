package com.fernando.cap1;

public enum CargoEnum {
  DEV(new DezOuVintePorCento()), 
  DBA(new QuinzeOuVinteECincoPorCento()), 
  TEST(new QuinzeOuVinteECincoPorCento());
	
	private RegraDeCalculo regra;
	CargoEnum(RegraDeCalculo regra){
		this.regra = regra;
	}
	public RegraDeCalculo getRegra() {
		return regra;
	}
	
}
