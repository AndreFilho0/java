package com.loiane.cursojava.ExerciciosVetor;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] a= new int [5];
		double[] b= new  double [a.length];
		int pos = 0;
		
		for (int i=0;i<a.length;i++) {
			System.out.println("entre com um valor ");
			int c=sc.nextInt();
			a[i]=c;
			
			b[i]= Math.sqrt(a[i]);
		}
		DecimalFormat df =new DecimalFormat("###,###.###");
		for (double t:b) {
			System.out.println("esses são os valores de b na posição " + pos);
			System.out.println(df.format(t));
			pos++;
		}
		
	}

}
