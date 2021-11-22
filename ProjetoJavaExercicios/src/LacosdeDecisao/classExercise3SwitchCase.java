package LacosdeDecisao;

import java.util.Scanner;

public class classExercise3SwitchCase {

	public static void main(String[] args) {
		int op;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nDigite 1 se você tem entre 10 e 14 anos");
		System.out.println("\nDigite 2 se você tem entre 15 e 17 anos");
		System.out.println("\nDigite 3 se você tem entre 18 e 25 anos");	
		
		System.out.println("\nEscolha uma opção: ");
		op=leia.nextInt();
		
		switch(op){
			case 1: 				
				System.out.println("\nVocê está na categoria infantil!");
				break;
			case 2: 
				System.out.println("\nVocê está na categoria juvenil!");
				break;
			case 3: 
				System.out.println("\nVocê está na categoria adulta!");
				break;
				default:
					System.out.println("Opção inválida!");				
		}

	}

}
/*3.Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:
* 10-14 infantil
* 15-17 juvenil
* 18-25 adulto
*/