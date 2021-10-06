package Arrays;

import java.util.Scanner;

public class classExercise2 {

	public static void main(String[] args) {
		int p[] = new int[6];
		int n,contpar=0,  contimpar=0, somapar=0, somaimpar=0;
		
		Scanner leia = new Scanner (System.in);		
		
		for(n=0;n<6;n++) {
			
			System.out.println("Digite um número: ");
			p[n]=leia.nextInt();
			
			if(p[n]%2==0) {
				somapar+=p[n];
				contpar++;
			} 
			
			if(p[n]%2==1) {
				somaimpar+=p[n];
				contimpar++;
			}
		}
		
		if (p[0]%2==0) {
			System.out.println("\nNúmero "+p[0]+" é par!");
		}
		else {System.out.println("\nNúmero "+p[0]+" é impar!");}
		
		if (p[1]%2==0) {
			System.out.println("\nNúmero "+p[1]+" é par!");
		}
		else {System.out.println("\nNúmero "+p[1]+" é impar!");}
		
		if (p[2]%2==0) {
			System.out.println("\nNúmero "+p[2]+" é par!");
		}
		else {System.out.println("\nNúmero "+p[2]+" é impar!");}
		
		if (p[3]%2==0) {
			System.out.println("\nNúmero "+p[3]+" é par!");
		}
		else {System.out.println("\nNúmero "+p[3]+" é impar!");}
		
		if(p[4]%2==0) {
			System.out.println("\nNúmero "+p[4]+" é par!");
		}
		else {System.out.println("\nNúmero "+p[4]+" é impar!");}
		
		if(p[5]%2==0) {
			System.out.println("\nNúmero "+p[5]+" é par!");
		}
		else {System.out.println("\nNúmero "+p[5]+" é impar!");}				

		System.out.println("\nA soma dos números pares é = "+somapar);
		System.out.println("\nA quantidade de números impares é = "+contimpar);
		
	}

} 	

/*2- Faça um programa que receba 6 números inteiros e mostre: 
	• Os números pares digitados;  
	• A soma dos números pares digitados; 
	• Os números ímpares digitados; 
	• A quantidade de números ímpares digitados.
*/
