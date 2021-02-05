package com.alura.rh.model;


import java.math.BigDecimal;
import java.time.LocalDate;


public class Funcionario {

	private DadosPessoais dadosPessoais;
	private LocalDate dataUltimoReajuste;

	public Funcionario(String nome, String cpf, Cargo cargo, BigDecimal salario) {
		dadosPessoais = new DadosPessoais(nome, cpf, cargo, salario);
	}

	public void atualizarSalario(BigDecimal aumento) {
	    // Aumentando a coesao removendo coisa daqui
//		BigDecimal percentualReajuste = aumento.divide(salario, RoundingMode.HALF_UP);
//		if (percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
//			throw new ValidacaoException("Reajuste nao pode ser superior a 40% do salario!");
//		}
//		this.salario = this.salario.add(aumento);
        dadosPessoais.setSalario(aumento);
		this.dataUltimoReajuste = LocalDate.now();
	}

	public DadosPessoais getDadosPessoais() {
		return dadosPessoais;
	}

	public void setDadosPessoais(DadosPessoais dadosPessoais) {
		this.dadosPessoais = dadosPessoais;
	}

	public String getNome() {
		return dadosPessoais.getNome();
	}


	public String getCpf() {
		return dadosPessoais.getCpf();
	}


	public Cargo getCargo() {
		return dadosPessoais.getCargo();
	}


	public BigDecimal getSalario() {
		return dadosPessoais.getSalario();
	}


	public LocalDate getDataUltimoReajuste() {
		return dataUltimoReajuste;
	}

	public void setDataUltimoReajuste(LocalDate dataUltimoReajuste) {
		this.dataUltimoReajuste = dataUltimoReajuste;
	}

	public void promover(Cargo novoCargo) {
		dadosPessoais.setCargo(novoCargo);;
	}



}
