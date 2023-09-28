package com.loiane.cursojava.OperadoresLogicos;

public class operadorLogico {

	public static void main(String[] args) {
		int valor1=1;
		int valor2=2;
		// Operadores relacionais:
		
	
		 System.out.println("valor1=valor2: " + (valor1==valor2));
		System.out.println("valor1!=valor2: " + (valor1!=valor2));
		System.out.println("valor1>=valor2: " + (valor1>=valor2));
		System.out.println("valor1<=valor2: " + (valor1<=valor2));
		System.out.println("valor1>valor2: " + (valor1>valor2));
		System.out.println("valor1<valor2: " + (valor1<valor2));
		
		//Operadores logicos :
		
		int vvalor1=1;
		int vvalor2=2;
		boolean resultado1=(valor1==1) && (valor2==2);
		System.out.println("valor1=1 e valor2=2 é : " + resultado1);
		
		boolean resultado2=(valor1==1) || (valor2==3);
		System.out.println("valor1=1 ou valor2=3 é : " + resultado2);
		
		boolean resultado3=(valor1==5) || (valor2==3);
		System.out.println("valor1=5 ou valor2=3 é : " + resultado3);
		
		boolean vdd=true;
		boolean falso=false;
		
		System.out.println(vdd && falso);
		System.out.println(vdd || falso);
		System.out.println(falso^vdd); // chor = "^" : ---> ele só da falso se for true^true ou false^false
		System.out.println(vdd && !falso);
		
		
		
		
		
		
		
		

	}

}
