package PacoteJava2;

import java.util.Scanner;

public class classExercise3 {

	public static void main(String[] args) {
		int idade=0;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Entre com a sua idade: ");
		idade=leia.nextInt();
		
		if(idade>=10 && idade<=14) {
			System.out.println("\nVoc� est� na categoria infantil!");
		}
		
		else if(idade>=15 && idade<=17) {
			System.out.println("\nVoc� est� na categoria juvenil!");
		}
		
		else if(idade>=18 && idade<=25) {
			System.out.println("\nVoc� est� na categoria Adulta!");
		}
		
		else{
			System.out.println("Infelizmente voc� n�o pode competir!");
		}		

	}

}
/*3.Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual categoria ela se encontra:
* 10-14 infantil
* 15-17 juvenil
* 18-25 adulto
*/