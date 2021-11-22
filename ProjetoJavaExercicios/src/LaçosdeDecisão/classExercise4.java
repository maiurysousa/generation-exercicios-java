package PacoteJava2;

import java.util.Scanner;

public class classExercise4 {

	public static void main(String[] args) {
		float n,r,p;
		
		Scanner leia = new  Scanner (System.in);
		
		System.out.println("Entre com um número: ");
		n=leia.nextFloat();
		
		if(n%2==0){
			r= (float) Math.sqrt(n);
			System.out.printf("Este número par e sua raiz quadrada é %1.6f",r);

		}	
		else if (n%2==1) {
			
			p = (float) Math. pow(n,2);			
			System.out.printf("Este número impar e sua potência elevada ao quadrado é %2.0f",p);
		}

	}

}

/*Faça um programa em que permita a entrada de um número qualquer e exiba se
 este número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo;
 se for ímpar exiba o número elevado ao quadrado.*/
