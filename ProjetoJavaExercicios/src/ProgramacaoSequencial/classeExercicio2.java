package ProgramacaoSequencial;

import java.util.Scanner;

public class classeExercicio2 {

		public static void main(String[] args) {

			int idadeDias, anos, meses, dias;

			Scanner leia = new Scanner (System.in);
			
			System.out.println("\nEntre com a sua idade em dias: ");
			idadeDias = leia.nextInt();
			
			anos = idadeDias / 365;
			meses = (idadeDias % 365) / 31;
			dias = (idadeDias % 365) % 31;
			
			System.out.println("\nVoc� tem "+anos+" anos, "+meses+" m�ses e "+dias+"  dias de vida."); 
		}		
}

/* 2. Fa�a um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias.*/