package com.loiane.cursojava.ExerciciosVetor;

import java.util.Scanner;

public class Ex40 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[] vetorA=new int[10];
		int[] vetorB=new int[10];
		int[] vetorC=new int[10];
		
		for (int i=0;i<vetorA.length;i++) {
			System.out.println("Entre com o valor da posição A- "+ i);
			vetorA[i]=scan.nextInt();
			
			System.out.println("Entre com o valor da posição B- "+ i);
			vetorB[i]=scan.nextInt();
			
		}
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				if(vetorA[i]!=vetorB[j]) {
					int c= (vetorA[i] - vetorB[j]);
					if (c<0) {
						c=c*-1;
						vetorC[i]=c;
					}else {
						vetorC[i]=c;
					}
					
					
				}
				else {
					vetorC[i]=0;
				}
			}
		}
		for(int t:vetorC) {
			System.out.println(t);
		}
		

	}

}
