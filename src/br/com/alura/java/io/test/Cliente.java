package br.com.alura.java.io.test;

import java.io.Serializable;

public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;

	private String nome;
	private String profissao;
	private String cpf;
	
	public String getNomeCpf() {
		return nome + ", " + cpf;
	}
	
	public String getCpfProfissao() {
		return cpf + ", " + profissao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
