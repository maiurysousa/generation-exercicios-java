package PacoteJava;

import java.util.Scanner;

public class classeExercicio4 {

	public static void main(String[] args) {
		double a, b, c, r, s, d, n=2;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nEscreva o valor de A: ");
		a = leia.nextInt();
		System.out.println("\nEscreva o valor de B: ");
		b = leia.nextInt();
		System.out.println("\nEscreva o valor de C: ");
		c = leia.nextInt();
		
		r= Math.pow((a+b),2);
		
		s= Math.pow((b+c),2);

		d=(r+s)/n;
		
		System.out.println("\nO valor de D �: "+d);	
	}
}

/*4. Escreva um sistema que leia tr�s n�meros inteiros e 
positivos (A, B, C) e calcule a seguinte express�o: onde  
D=(R+S)/2 
R=(A+B)�
S=(B+C)�*/