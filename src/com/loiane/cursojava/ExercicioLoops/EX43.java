package com.loiane.cursojava.ExercicioLoops;

import java.util.Scanner;

public class EX43 {
	public static void main(String[] args) {
		// Caardapio da lanchonete :
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Especificação     código     preço");
		System.out.println("Cachorro quente   100        R$ 1,20");
		System.out.println("Bauru simples     101        R$ 1,30");
		System.out.println("Bauru com ovo     102        R$ 1,50");
		System.out.println("Hambúrguer        103        R$ 1,20");
		System.out.println("Cheeseburguer     104        R$ 1,30");
		System.out.println("Refrigerante      105        R$ 1,00");
		
		boolean continuar=true;
		double c100=1.20;
		double c101=1.30;
		double c102=1.50;
		double c103=1.20;
		double c104=1.30;
		double c105=1.00;
	    double valor=0;
		do {
			System.out.println("informe o produto que vc deseja comprar ");
			scan.nextLine();  // para corrigir o bug do nextLine vai ser necessario colocar isso , n sei muito bem como funciona 
			String nomeProduto= scan.nextLine();
			
			System.out.println("informe a quantidade de produto que vc deseja comprar ");
			int qtdProduto=scan.nextInt();
			if (nomeProduto.equalsIgnoreCase("cachorro quente")){
				valor= valor + c100*qtdProduto;				
			}
			else if (nomeProduto.equalsIgnoreCase("Bauru simples")){
				valor= valor + c101*qtdProduto;				
			}
			else if (nomeProduto.equalsIgnoreCase("Bauru com ovo ")){
				valor= valor + c102*qtdProduto;				
			}
			else if (nomeProduto.equalsIgnoreCase("Hambúrguer")){
				valor= valor + c103*qtdProduto;				
			}
			else if (nomeProduto.equalsIgnoreCase("Cheeseburguer")){
				valor= valor + c104*qtdProduto;				
			}
			else if (nomeProduto.equalsIgnoreCase("Refrigerante")){
				valor= valor + c105*qtdProduto;
			}
			else {
				System.out.println("entre com um produto valido ");
			}
			System.out.println("deseja fazer mais um pedido ? (s/n) ");
			
			String cont=scan.next();
			if (cont.equalsIgnoreCase("s")) {
				System.out.println("faça mais um pedido abaixo ");
			}
			else {
				System.out.println("encerando seus pedidos ");
				continuar=false;
			}
			
			
					
		}while(continuar);
		
		System.out.println("o valor total do seu pedido é:  R$" + valor);
		
		
	}

}
