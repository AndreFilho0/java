package com.loiane.cursojava.Condicional;
import java.util.Scanner;

public class condicionalIfElse {
	public static void main (String[] args) {
		
		Scanner scan = new Scanner (System.in);
	/*	
		System.out.println("informe sua idade  ");
		int idade= scan.nextInt();
		
		if (idade>=18) {
			System.out.println("é maior de idade ");
			
				
			}
		else {
			System.out.println("é menor de idade (: ");
		}
		*/
		
		
		//barato <=10
		//10<valor<15 pedir desconto
		// 15<=valor<20 pessquisar mais
		// >=17 muito caro
		System.out.println("informe o valor do produto ");
		double valor= scan.nextDouble();
	    
		if(valor<=10) {
			System.out.println("Tá barato, compra ");
		}
		else if (valor >10 && valor<15) {
			System.out.println("pedir desconto");		
		}
		else if (valor >=15 && valor <20) {
			System.out.println("pesquisar mais  ");
		}
		else {
			System.out.println("Tá muito caro! corre zé");
		}
	}
	    
 
}
