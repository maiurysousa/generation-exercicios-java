package Arrays;

import java.util.Scanner;

public class classExercise2 {

	public static void main(String[] args) {
		int p[] = new int[6];
		int n,contpar=0,  contimpar=0, somapar=0, somaimpar=0;
		
		Scanner leia = new Scanner (System.in);		
		
		for(n=0;n<6;n++) {
			
			System.out.println("Digite um n�mero: ");
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
			System.out.println("\nN�mero "+p[0]+" � par!");
		}
		else {System.out.println("\nN�mero "+p[0]+" � impar!");}
		
		if (p[1]%2==0) {
			System.out.println("\nN�mero "+p[1]+" � par!");
		}
		else {System.out.println("\nN�mero "+p[1]+" � impar!");}
		
		if (p[2]%2==0) {
			System.out.println("\nN�mero "+p[2]+" � par!");
		}
		else {System.out.println("\nN�mero "+p[2]+" � impar!");}
		
		if (p[3]%2==0) {
			System.out.println("\nN�mero "+p[3]+" � par!");
		}
		else {System.out.println("\nN�mero "+p[3]+" � impar!");}
		
		if(p[4]%2==0) {
			System.out.println("\nN�mero "+p[4]+" � par!");
		}
		else {System.out.println("\nN�mero "+p[4]+" � impar!");}
		
		if(p[5]%2==0) {
			System.out.println("\nN�mero "+p[5]+" � par!");
		}
		else {System.out.println("\nN�mero "+p[5]+" � impar!");}				

		System.out.println("\nA soma dos n�meros pares � = "+somapar);
		System.out.println("\nA quantidade de n�meros impares � = "+contimpar);
		
	}

} 	

/*2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
	� Os n�meros pares digitados;  
	� A soma dos n�meros pares digitados; 
	� Os n�meros �mpares digitados; 
	� A quantidade de n�meros �mpares digitados.
*/
