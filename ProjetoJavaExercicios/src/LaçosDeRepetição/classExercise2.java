package LaçosDeRepetição;

import java.util.Scanner;

public class classExercise2 {

	public static void main(String[] args) {
		int x=0, cont=1, cont2=0;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\n digite um número: ");
		x=leia.nextInt();
		
		for(x=1;x<=20;x++){
			
				if(x%2==0) {
					cont++;
				}
				else {
					cont2++;
				}
				System.out.println("\n digite um número: ");
				x=leia.nextInt();


		}
		System.out.println("\nTotal de números pares é: " + cont);	
		System.out.println("\nTotal de números impares é: " + cont2);
	}

}
/*Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/
