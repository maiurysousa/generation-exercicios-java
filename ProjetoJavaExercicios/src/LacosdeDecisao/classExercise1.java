package LacosdeDecisao;

import java.util.Scanner;

public class classExercise1 {

	public static void main(String[] args) {
		int n1,n2,n3;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nEntre com o primeiro n�mero: ");
		n1=leia.nextInt();
		System.out.println("\nEntre com o segundo n�mero: ");
		n2=leia.nextInt();
		System.out.println("\nEntre com o terceiro n�mero: ");
		n3=leia.nextInt();
		
		if(n1>n2 && n1>n3) {
			System.out.println("\nO maior n�mero: " + n1);
		}
		else if(n2>n1 && n2>n3) {
			System.out.println("\nO maior n�mero: " + n2);			
		}
		else {
			System.out.println("\nO maior n�mero: " + n3);
		}		
	}

}
/*1.Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.*/