package LaçosDeRepetição;

import java.util.Scanner;

public class classExercise3 {

	public static void main(String[] args) {
			int idade,cont=0, cont2=0;
			Scanner ler = new Scanner (System.in);
			
			System.out.println("\nEntre com a idade:");
			idade=ler.nextInt();
			
			while(idade>0) {
				
				if(idade<=21) {
					cont++;
				}				
				if(idade>=50) {
					cont2++;					
				}
				
				System.out.println("\nEntre com a idade ou digite -99 para sair: ");
				idade=ler.nextInt();
			}
			System.out.println("\nTotal de pessoas com menos de 21: " + cont);	
			System.out.println("\nTotal de pessoas com mais de 50: " + cont2);
	}
}
/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com
 menos de 21 anos. Total de pessoas com mais de 50 anos. O programa 
 termina quando idade for =-99. (WHILE)*/
