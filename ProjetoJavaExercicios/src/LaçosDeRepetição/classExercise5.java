package La�osDeRepeti��o;

import java.util.Scanner;

public class classExercise5 {

	public static void main(String[] args) {
		int num, soma=0;
		Scanner leia = new Scanner (System.in);

		
		do {
			System.out.println("\nDigite um n�mero: ");
			num = leia.nextInt();
			
			soma+=num;			
			
		}while (num!=0);
		System.out.println("\nA soma dos n�mero �: "+soma);		
		
	}

}
/*5.Crie um programa que leia um n�mero do teclado at� que encontre um 
n�mero igual a zero. No final, mostre a soma dos n�meros digitados.(DO...WHILE)*/
