package LacosdeDecisao;

import java.util.Scanner;

public class classExercise3SwitchCase {

	public static void main(String[] args) {
		int op;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nDigite 1 se voc� tem entre 10 e 14 anos");
		System.out.println("\nDigite 2 se voc� tem entre 15 e 17 anos");
		System.out.println("\nDigite 3 se voc� tem entre 18 e 25 anos");	
		
		System.out.println("\nEscolha uma op��o: ");
		op=leia.nextInt();
		
		switch(op){
			case 1: 				
				System.out.println("\nVoc� est� na categoria infantil!");
				break;
			case 2: 
				System.out.println("\nVoc� est� na categoria juvenil!");
				break;
			case 3: 
				System.out.println("\nVoc� est� na categoria adulta!");
				break;
				default:
					System.out.println("Op��o inv�lida!");				
		}

	}

}
/*3.Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual categoria ela se encontra:
* 10-14 infantil
* 15-17 juvenil
* 18-25 adulto
*/