package com.loiane.cursojava.RelacionamentoClasse;

public class Contato {
	private String nome ;
	private Endereco enderco;
	private Telefone[] telefones;
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Endereco getEnderco() {
		return enderco;
	}
	public void setEnderco(Endereco enderco) {
		this.enderco = enderco;
	}
	public Telefone[] getTelefones() {
		return telefones;
	}
	public void setTelefones(Telefone[] telefones) {
		this.telefones = telefones;
	}
	

	

}
