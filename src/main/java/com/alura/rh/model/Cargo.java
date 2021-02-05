package com.alura.rh.model;

public enum Cargo {

	ASSISTENTE ("ANALISTA"),
	ANALISTA ("ESPECIALISTA"),
	ESPECIALISTA("GERENTE"),
	GERENTE(null);

	private Cargo proximoCargo;

	Cargo(String proximoCargo) {
		this.proximoCargo = Cargo.valueOf(proximoCargo);
	}

	public Cargo getProximoCargo() {
		return proximoCargo;
	}
}
