package LaçosDeRepetição;

import java.util.Scanner;

public class classExercise5 {

	public static void main(String[] args) {
		int num, soma=0;
		Scanner leia = new Scanner (System.in);

		
		do {
			System.out.println("\nDigite um número: ");
			num = leia.nextInt();
			
			soma+=num;			
			
		}while (num!=0);
		System.out.println("\nA soma dos número é: "+soma);		
		
	}

}
/*5.Crie um programa que leia um número do teclado até que encontre um 
número igual a zero. No final, mostre a soma dos números digitados.(DO...WHILE)*/
