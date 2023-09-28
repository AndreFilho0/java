package com.loiane.cursojava.POO;

public class MetodoSimples {
	//atributos:
	String nome;
	int idade;
	double p1;
	double p2;
	//Metodo sem retorno:
	void media() {
		System.out.println("notas do aluno "+nome+" :"+p1+" "+" "+p2+" media: "+(p1+p2)/2);
	}
	//Metodo com retorno
	double mediaRetorno() {
		System.out.println("metodo foi chamado");
		return (p1+p2)/2;
	}
	//metodos com parametros:
	double pontoExtra(double pontoExtra) {
		double media=(p1+p2)/2;
		return pontoExtra+media;
		
	}

}

