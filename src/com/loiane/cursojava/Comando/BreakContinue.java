package com.loiane.cursojava.Comando;
import java.util.Scanner;

public class BreakContinue {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		/*System.out.println("entre com um numero ");
		int num=scan.nextInt();
		
		System.out.println("entre com um limite  ");
		int max=scan.nextInt();
        
		for (int i=num;i<=max;i++) {
			if(i%7==0) {
				System.out.println("o valor de i é :"+ i);
				break; //vamos sair fora do ciclo, assim que achar o primeiro numero divisivel por 7
			}
		}
		*/
		System.out.println("entre com um numero ");
		int num=scan.nextInt();
		
		System.out.println("entre com um limite  ");
		int max=scan.nextInt();
        
		for (int i=num;i<=max;i++) {
			if(i%2==0) {
				continue;					// ele pula uma execução do codico, saindo do loop
	}    
			System.out.println("o valor de i é :"+ i);

}
}
}	
