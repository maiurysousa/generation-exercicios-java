package LacosRepeticao;

import java.util.Scanner;

public class classExercise6_2 {

	public static void main(String[] args) {

		int x, cont=0;
		float soma=0, media;
		Scanner leia = new Scanner (System.in);

		System.out.printf("\nDigite um número maior que zero: ");
		x = leia.nextInt();
		do {

			if(x%3==0) {
				soma+=x;
				cont++;			
			}
			System.out.printf("\nDigite um número maior que zero ou digite zero para sair: ");
			x = leia.nextInt();
	 
		} while(x!=0);

		media=soma/cont;	

		System.out.println("\nA média dos números múltiplos de 3 é: "+media);
	}	

}


