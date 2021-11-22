package ProgramacaoSequencial;

import java.util.Scanner;

public class classeExercicio7 {

	public static void main(String[] args) {
		
		double a, b, c, d, e, f, x, y;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nEntre com o valor de A: ");
		a=leia.nextDouble();	

		System.out.println("\nEntre com o valor de B: ");
		b=leia.nextDouble();
		
		System.out.println("\nEntre com o valor de C: ");
		c=leia.nextDouble();
		
		System.out.println("\nEntre com o valor de D: ");
		d=leia.nextDouble();
		
		System.out.println("\nEntre com o valor de E: ");
		e=leia.nextDouble();
		
		System.out.println("\nEntre com o valor de F: ");
		f=leia.nextDouble();
		
		x = ((c*e)-(b*f))/((a*e)-(b*d));
		
		y = ((a*f)-(c*d))/((a*e)-(b*d));
		
		System.out.println("\nO valor de X é: "+x);
		
		System.out.println("\nO valor de Y é: "+y);

	}

}

/*7. Um sistema de equações lineares do tipo: 
pode ser resolvido segundo mostrado abaixo : */
