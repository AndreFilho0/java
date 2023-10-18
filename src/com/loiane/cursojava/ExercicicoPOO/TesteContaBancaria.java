package com.loiane.cursojava.ExercicicoPOO;

public class TesteContaBancaria {

	public static void main(String[] args) {
		ContaBancaria cb = new ContaBancaria("ju", 0, 12366);
		ContaPoupanca cp = new ContaPoupanca("dede",100,1234,0.50);
		ContaEspecial ce=new ContaEspecial("dede2", 200,443,300);
		
		System.out.println(cb.toString());
		System.out.println(ce.toString());
		System.out.println(cp.toString());
		
	
		cb.depositar(10);
		cp.calcularNovoSaldo();
		ce.sacar(100);
		
		System.out.println(cb.toString());
		System.out.println(ce.toString());
		System.out.println(cp.toString());
		
		

	}

}
