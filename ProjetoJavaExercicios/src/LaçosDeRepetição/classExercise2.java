package La�osDeRepeti��o;

import java.util.Scanner;

public class classExercise2 {

	public static void main(String[] args) {
		int x=0, cont=1, cont2=0;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\n digite um n�mero: ");
		x=leia.nextInt();
		
		for(x=1;x<=20;x++){
			
				if(x%2==0) {
					cont++;
				}
				else {
					cont2++;
				}
				System.out.println("\n digite um n�mero: ");
				x=leia.nextInt();


		}
		System.out.println("\nTotal de n�meros pares �: " + cont);	
		System.out.println("\nTotal de n�meros impares �: " + cont2);
	}

}
/*Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)*/
