package com.loiane.cursojava.ExercicicoPOO;

public class TesteContaBancaria {

	public static void main(String[] args) {
		ContaBancaria cb = new ContaBancaria("ju", 0, 12366);
		ContaPoupanca cp = new ContaPoupanca("dede",100,1234,0.50);
		ContaEspecial ce=new ContaEspecial("dede2", 200,443,300);
		
	//p.depositar(50);
	//e.sacar(5000);
		
		
		System.out.println(cb.toString());
		System.out.println(ce.toString());
		

	}

}
