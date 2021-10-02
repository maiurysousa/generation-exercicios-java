package PacoteJava;

import java.util.Scanner;

public class classeExercicio1 {

	public static void main(String[] args) {
			
			int anos, meses, dias, totalDias;
			
			Scanner leia = new Scanner (System.in);
			
			System.out.println("\nVocê tem quantos anos: ");
			anos=leia.nextInt();
			System.out.println("\nEntre com os meses: ");
			meses=leia.nextInt();
			System.out.println("\nEntre com os dias: ");
			dias=leia.nextInt();
			
			totalDias = ((anos * 365) + (meses *31)  + dias);
			
			System.out.println("\nA idade expresas em dias é de: " + totalDias);
	}
}

/* 1. Faça um sistema que leia a idade de uma pessoa expressa em anos,
meses e dias e mostre-a expressa apenas em dias. */