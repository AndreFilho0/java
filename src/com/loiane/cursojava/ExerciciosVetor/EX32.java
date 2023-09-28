package com.loiane.cursojava.ExerciciosVetor;

import java.util.Scanner;

public class EX32 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[] vetorA=new int[5];
		for (int i=0;i<vetorA.length;i++) {
			System.out.println("Entre com o valor da posição A- "+ i);
			vetorA[i]=scan.nextInt();
			
		}
		for(int i=0;i<5;i++) {
			
			System.out.println("Tabuada de " + vetorA[i]);
			
			for (int j=1;j<=10;j++) {
				System.out.println(j+"*"+vetorA[i]+" = "+(j*vetorA[i]));
				
				
			}
			System.out.println();
		}
	}

}
