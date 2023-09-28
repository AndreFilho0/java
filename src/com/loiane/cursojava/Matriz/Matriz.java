package com.loiane.cursojava.Matriz;

public class Matriz {

	public static void main(String[] args) {
		// Primeira '[]' sempre é a as linhas da nossa matriz. E o segundo '[]' é nossas colunas
		
		double [][] notasAlunos= new double [10][4];
		//linhas são os alunos e as colunas são as notas deles:
		
		notasAlunos[0][0]=10;
		notasAlunos[0][1]=8;
		notasAlunos[0][2]=7;
		notasAlunos[0][3]=10;
		
		//forma de inicializar já com os valores , temos que 
		double [][] notasAlunos2= {{1,10,8,5},{2,5,6,10},{5,6,7,5},{8,10,1,6}};
		
		
		
		System.out.println(notasAlunos.length);
		double soma=0;
		
		//printando na tela nossa matriz
		for(int i =0;i<notasAlunos.length;i++) {
			for(int j=0;j<notasAlunos[i].length;j++) {
				System.out.print(notasAlunos[i][j]+" |");
			}
			System.out.println();
		}
		System.out.println("calculando a media de cada aluno :");
		
		for(int i =0;i<notasAlunos.length;i++) {
			soma=0;
			for(int j=0;j<notasAlunos[i].length;j++) {
				soma+=notasAlunos[i][j];	 
			}
			System.out.println("a media do " +(i+1)+" aluno é: "+ (soma/4) );
		}
		

	}

}
