package com.loiane.cursojava.ExercicioLoops;

import java.util.Scanner;



public class DoWhile {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o numero de turmas: ");
		int numTurmas=scan.nextInt();
		int numeroAlunos;
		double soma = 0;
		double media;
		boolean invalido;
		
		
		for (int i=1;i<=numTurmas;i++) {
			invalido=true;
			do {
			System.out.println("Entre com o numero de alunos da turma " + i);
			numeroAlunos=scan.nextInt();
			// mas a turma não pode ter mais de 40 alunos 
			if(numeroAlunos<=40) {
				invalido=false; //isso vai fazer com que o ciclo para de se repetir pq ovalor entrado vai ser verdadeiro
				System.out.println("o valor que vc entrou é valido, boa");
				}
			else {
				System.out.println("O valor entrado na turma:" + i + "Não é valido , Digite um novo valor para a quantidade de alunos na turma :" + i);
					}
			
					}while(invalido);
			soma+=numeroAlunos;
			
			
		}
		media=soma/numTurmas;
		System.out.println("a media de alunos dessas turmas é: " + media);
		
		

	}

}
