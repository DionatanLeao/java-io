package br.com.alura.java.io.test;

import java.io.Serializable;

public class ContaCorrente implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int agencia;
	private Integer numero;
	private Double saldo;
	private Cliente titular;

	public ContaCorrente(Integer agencia, Integer numero) {
		super();
		this.agencia = agencia;
		this.numero = numero;
	}

	public Integer getAgencia() {
		return agencia;
	}

	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public void Depositar(Double deposito) {
		this.setSaldo(deposito);
	}

}
