package ProgramacaoSequencial;

import java.util.Scanner;

public class classeExercicio5 {

	public static void main(String[] args) {
		
		double n1, n2, n3, mp;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nEntre com a 1º nota: ");
		n1=leia.nextDouble();	

		System.out.println("\nEntre com a 2º nota: ");
		n2=leia.nextDouble();
		
		System.out.println("\nEntre com a 3º nota: ");
		n3=leia.nextDouble();
		
		mp = ((n1*2)+(n2*3)+(n3*5))/(2+3+5);
		System.out.println("\nA média ponderada desse alune é : "+mp);
				
	}
}

/*5. Faça um sistema que leia as 3 notas de um alune e calcule a média final deste 
alune. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente. */
