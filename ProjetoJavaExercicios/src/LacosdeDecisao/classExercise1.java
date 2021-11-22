package LacosdeDecisao;

import java.util.Scanner;

public class classExercise1 {

	public static void main(String[] args) {
		int n1,n2,n3;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nEntre com o primeiro número: ");
		n1=leia.nextInt();
		System.out.println("\nEntre com o segundo número: ");
		n2=leia.nextInt();
		System.out.println("\nEntre com o terceiro número: ");
		n3=leia.nextInt();
		
		if(n1>n2 && n1>n3) {
			System.out.println("\nO maior número: " + n1);
		}
		else if(n2>n1 && n2>n3) {
			System.out.println("\nO maior número: " + n2);			
		}
		else {
			System.out.println("\nO maior número: " + n3);
		}		
	}

}
/*1.Faça um programa que receba três inteiros e diga qual deles é o maior.*/