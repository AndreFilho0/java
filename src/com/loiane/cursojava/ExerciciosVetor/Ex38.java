package com.loiane.cursojava.ExerciciosVetor;

import java.util.Scanner;

public class Ex38 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double[] vetorA=new double[10];
		double[] vetorB=new double[vetorA.length];
		
		for (int i=0;i<vetorA.length;i++) {
			System.out.println("Entre com o valor da posição A- "+ i);
			vetorA[i]=scan.nextInt();
			
		}
		for(int i=0;i<vetorA.length;i++) {
			for(int j=0;j<vetorA.length;j++) {
				vetorB[i] += vetorA[j];
			}
				
		}
		for (double t:vetorB) {
			System.out.println("valores do vetor b "+t);
		}

	}

}
