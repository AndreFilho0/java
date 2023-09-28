package com.loiane.cursojava.ExerciciosVetor;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] vet1=new int [10];
		int[] teste=new int [vet1.length];
		int contPar=0;
		int contImp=0;
		
		for(int i=0;i<vet1.length;i++) {
			
			System.out.println("entre com os valores inteiros para o vet1");
			int c=sc.nextInt();
			
			vet1[i]=c;
			
			teste[i]=vet1[i] % 2;
		}
        for(int t:teste) {
        	if(t==0) {
        		contPar+=1;
        	}else {
        		contImp+=1;
        	}
        	}
        System.out.println("o numero de de valores pares são " + contPar);
        System.out.println("o numero de de valores impar são " + contImp);
	}   

}
