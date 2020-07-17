package br.com.user.models;

public class Cliente {
	private String nome;
	private boolean status;
	private String senha;
	
	public Cliente(String nome, boolean status, String senha) {
		super();
		this.nome = nome;
		this.status = status;
		this.senha = senha;
	}

	public String getNome() {
		return this.nome;
	}

	public boolean getStatus() {
		return this.status;
	}


	public String getSenha() {
		return this.senha;
	}
	
}
