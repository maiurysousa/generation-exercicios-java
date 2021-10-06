package Arrays;

import java.util.Scanner;

public class classExercise3 {

	public static void main(String[] args) {
		int m[][]= new int[3][3];
		int l,c,cont=0;
		
		Scanner leia = new Scanner (System.in);
	
		for(l=0;l<3;l++) {
			for(c=0;c<3;c++) {
				
				System.out.printf("Digite um valor para a matriz: ");
				m[l][c]=leia.nextInt();

				if(m[l][c]>=10) {
					cont++;
				}
			}
		}	System.out.println("\nA matriz possui "+cont+" valores maiores que 10.");

	}

}
/*3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.*/
