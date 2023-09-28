package com.loiane.cursojava.POO;

public class TesteCarro {

	public static void main(String[] args) {
		Carro van= new Carro();
		van.marca = "Fiat";
		van.modelo = "ducato";
		van.capCombustivel = 100;
		van.numPassageiro = 4;
		van.consumoCombustivel = 0.25;
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		System.out.println(van.numPassageiro);
		System.out.println(van.capCombustivel);
		
		
	     

	}

}
