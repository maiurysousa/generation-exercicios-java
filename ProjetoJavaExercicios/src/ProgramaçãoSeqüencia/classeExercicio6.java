package PacoteJava;

import java.util.Scanner;

public class classeExercicio6 {

	public static void main(String[] args) {
		
		double xp, yp, xn,yn, d, c;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nEntre com a 1º número: ");
		xp=leia.nextDouble();	

		System.out.println("\nEntre com a 2º número: ");
		yp=leia.nextDouble();
		
		System.out.println("\nEntre com a 3º número: ");
		xn=leia.nextDouble();
		
		System.out.println("\nEntre com a 3º número: ");
		yn=leia.nextDouble();
		
		c=(Math.pow((xn-xp),2)) + (Math.pow((yn-yp),2));
		d= Math.sqrt(c);
		System.out.println("\nO valor de D é: "+d);
	}
}

/* 6. Construa um programa em que, tendo como dados de entrada dois pontos quaisquer no 
plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula que efetua tal cálculo é: */
