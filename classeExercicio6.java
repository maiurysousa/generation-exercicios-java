package PacoteJava;

import java.util.Scanner;

public class classeExercicio6 {

	public static void main(String[] args) {
		
		double xp, yp, xn,yn, d, c;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nEntre com a 1� n�mero: ");
		xp=leia.nextDouble();	

		System.out.println("\nEntre com a 2� n�mero: ");
		yp=leia.nextDouble();
		
		System.out.println("\nEntre com a 3� n�mero: ");
		xn=leia.nextDouble();
		
		System.out.println("\nEntre com a 3� n�mero: ");
		yn=leia.nextDouble();
		
		c=(Math.pow((xn-xp),2)) + (Math.pow((yn-yp),2));
		d= Math.sqrt(c);
		System.out.println("\nO valor de D �: "+d);
	}
}

/* 6. Construa um programa em que, tendo como dados de entrada dois pontos quaisquer no 
plano, P(x1, y1) e P(x2, y2), escreva a dist�ncia entre eles. A f�rmula que efetua tal c�lculo �: */
