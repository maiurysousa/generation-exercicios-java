package LacosRepeticao;

import java.util.Scanner;

public class classExercise6 {

	public static void main(String[] args) {
		int x, cont=0;
		float soma=0, media;
		Scanner leia = new Scanner (System.in);
		
		System.out.printf("\nDigite um número: ");
		x = leia.nextInt();
		do {
			 if(x==0)
			 {
				 System.out.println("\nVocê digitou zero e vai sair do programa...");
			 }
			 else
			 {
			
			if(x%3==0) {
				soma+=x;
				cont++;			
			}
			System.out.printf("\nDigite um número: ");
			x = leia.nextInt();
			 }// 6 0
			}while(x!=0);
		if(cont==0)
		{
			System.out.println("\nNão é possível fazer divisão por ZERO" );
		}
		else
		{
		media=soma/cont;	
	
		System.out.println("\nA média dos números múltiplos de 3 é: "+media);
		}
	}

}
/*6.Escrever um programa que receba vários números inteiros no teclado. E no 
final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)*/
