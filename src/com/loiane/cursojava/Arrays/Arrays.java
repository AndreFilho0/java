package com.loiane.cursojava.Arrays;
import java.util.Scanner;

public class Arrays {	

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		double[] temperatura=new double [10]; // declarando um array
		temperatura[0]=16.5;    // 
		temperatura[1]=25.5;
		temperatura[2]=22.5;
		temperatura[3]=24.5;
		int[] num= {1,2,3,4,5,6,7,8,9,10}; // declarando os valores de maneira mais rapida
		int[] acrecimoAuto= new int [10];
		System.out.println("tamanho do nosso array " + temperatura.length); //length = ler o tamanho  da nossa lista 
		/*for(int i=0;i<temperatura.length;i++) {
			System.out.println("printando os nossos valores presente no array " + temperatura[i]);
		}*/
		
		
		
		
		// para dar valor para nossa lista com for vamos usar o for melhorado
		
		/*for(double t:temperatura) {// t= vai armazenar os valores que estão na nossa lista
			System.out.println(t); // uma forma mais rapida de printar os valores que estão dentro da nossa lista 
			}
		for(int t:num) {
			System.out.println(t);
		}*/
		
		
		
		// vamos add valores ao nosso vetor acrimoAuto de uma maneira interativa
		int i=0;
		while(i<10) {
            acrecimoAuto[i]=scan.nextInt();
            i++;
		}
		for(int t:acrecimoAuto) {
			System.out.println(t);
		}
	
		
	}

}
