package com.loiane.cursojava.leituraDadosTeclado;

import java.util.Scanner;

public class LeituraDosDadosTeclado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		/*
		System.out.println("Digite seu nome completo: ");
		String nomeCompleto= scan.nextLine();    // pega tudo da linha
		System.out.println("Seu nome é :" + nomeCompleto);
		
		System.out.println("Digite só seu primeiro nome :");
		String primeiroNome=scan.next(); // pega só a primeira palavra
		System.out.println("Seu primeiro nome é : " + primeiroNome);
	
		System.out.println("Digite sua idade:");
		int idade=scan.nextInt();
		System.out.println("sua idade é "+ idade );

		System.out.println("Digite sua altura : ");
		double altura = scan.nextDouble();
		System.out.println("sua altura é " + altura);
*/		
		System.out.println("Digite o seu primeiro nome,idade,quantidade de filhos,altura,tem pet ");
		String nome=scan.next();
		int idade=scan.nextInt();
		int qtdFilhos=scan.nextInt();
		float altura=scan.nextFloat();
		boolean pet=scan.nextBoolean();
		
		System.out.println("vc digitou os seguintes valores: ");
		System.out.println(nome);
		System.out.println(idade);
		System.out.println(qtdFilhos);
		System.out.println(altura);
		System.out.println(pet);
		
	}

}
