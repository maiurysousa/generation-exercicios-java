package PacoteJava;

import java.util.Scanner;

public class classeExercicio3 {
	
	public static void main(String[] args) {
		int tempoEvento, horas, minutos, segundos;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nEntre com a dura��o do evento em segundos: ");
		tempoEvento = leia.nextInt();
		
		horas = tempoEvento / 3600;
		minutos = (tempoEvento%3600)/60;
		segundos = (tempoEvento%3600)%60;
		
		System.out.println("\nO evento teve "+horas+" horas, "+minutos+ " minutos e "+segundos+" segundos.");	
		
	}
}

/*3. Fa�a um sistema que leia o tempo de dura��o de um evento em 
uma f�brica expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/
