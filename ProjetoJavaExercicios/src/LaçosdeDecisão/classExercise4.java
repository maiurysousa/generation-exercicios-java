package PacoteJava2;

import java.util.Scanner;

public class classExercise4 {

	public static void main(String[] args) {
		float n,r,p;
		
		Scanner leia = new  Scanner (System.in);
		
		System.out.println("Entre com um n�mero: ");
		n=leia.nextFloat();
		
		if(n%2==0){
			r= (float) Math.sqrt(n);
			System.out.printf("Este n�mero par e sua raiz quadrada � %1.6f",r);

		}	
		else if (n%2==1) {
			
			p = (float) Math. pow(n,2);			
			System.out.printf("Este n�mero impar e sua pot�ncia elevada ao quadrado � %2.0f",p);
		}

	}

}

/*Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se
 este n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo;
 se for �mpar exiba o n�mero elevado ao quadrado.*/
