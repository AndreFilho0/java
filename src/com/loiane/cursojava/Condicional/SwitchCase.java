package com.loiane.cursojava.Condicional;

import java.util.Scanner;

public class SwitchCase {
	public static void main (String[] args) {
		Scanner scan= new Scanner (System.in);
		System.out.println("informe o dia da semana");
		
		int diaSemana=scan.nextInt();
		
		System.out.println("informe o nome de um dia ");
		String teste=scan.next();
		
		double a=scan.nextDouble();
		
		
		// podemos passar referencia inteiros
		switch(diaSemana) {
		case 1:System.out.println("Domingo");break;
		case 2:System.out.println("seg");break;
		case 3:System.out.println("ter");break;
		case 4:System.out.println("qua");break;
		case 5:System.out.println("qui");break;
		case 6:System.out.println("sex");break;
		case 7:System.out.println("sabado");break;
		default:System.out.println("Não é um dia valido");
		
		// podemos passar referencia strings
		switch(teste) {
		case "domingo":System.out.println("Domingo");break;
		case "segunda":System.out.println("seg");break;
		
		// o switch n funciona para casos como double ou float 
		}
}
}
}
	


