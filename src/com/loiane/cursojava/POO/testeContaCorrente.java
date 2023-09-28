package com.loiane.cursojava.POO;

import java.util.Scanner;

public class testeContaCorrente {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		contaCorrente c1= new contaCorrente();
		c1.nome="André";
		c1.numeroConta=775588;
		c1.saldo=100;
		c1.limite=1000;
		c1.status="especial";
		
		c1.mostraCliente();
		System.out.println("informe o valor do saque");
		double saque= scan.nextDouble();
		c1.saque(saque);
		
		c1.deposito(8000);
		c1.saque(4800);
		System.out.println(" ");
		c1.mostraCliente();
		
		
		

	}

}
