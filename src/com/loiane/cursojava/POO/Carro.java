package com.loiane.cursojava.POO;

public class Carro {
	//Esses são os atributos da nosso objeto 'carro'
	
	private String marca;
	private String modelo;
	private int numPassageiro;
	private double capCombustivel;
	private double consumoCombustivel;
	
	public Carro(String marca, String modelo, int numPassageiro, double capCombustivel, double consumoCombustivel) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiro = numPassageiro;
		this.capCombustivel = capCombustivel;
		this.consumoCombustivel = consumoCombustivel;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getNumPassageiro() {
		return numPassageiro;
	}

	public void setNumPassageiro(int numPassageiro) {
		this.numPassageiro = numPassageiro;
	}

	public double getCapCombustivel() {
		return capCombustivel;
	}

	public void setCapCombustivel(double capCombustivel) {
		this.capCombustivel = capCombustivel;
	}

	public double getConsumoCombustivel() {
		return consumoCombustivel;
	}

	public void setConsumoCombustivel(double consumoCombustivel) {
		this.consumoCombustivel = consumoCombustivel;
	}
	
	//metodos para obter os valores e mudalos mesmo eles estando encapsulados  
	
    
	

}
