package Arrays;

import java.util.Scanner;

public class classExercise4 {

	public static void main(String[] args) {
		float m1[][]= new float [2][2];
		float m2[][]= new float [2][2];
		float m3[][]= new float [2][2];
		
		int x,y, op, num; 
		
		Scanner leia = new Scanner (System.in);
		
		for(x=0;x<2;x++) {
		for(y=0;y<2;y++)
		{
			System.out.println("Digite o valor da matriz 1: ");
			m1[x][y]=leia.nextFloat();
			System.out.println("Digite o valor da matriz 2: ");
			m2[x][y]=leia.nextFloat();
		}
		}

		System.out.println("\n\t\tMenu de op��es: ");
		System.out.println("\n1- Somar as duas Matrizes.");
		System.out.println("\n2- Subtrair a 1� da 2�.");
		System.out.println("\n3- Adicionar uma vari�vel �s duas Matrizes.");
		System.out.println("\n4- Imprimir as matrizes.");
		System.out.println("\n Digite sua op��o.");

		op = leia.nextInt();

		while(op<1 || op>4)
		{

		System.out.println("\n\t\tMenu de op��es: ");
		System.out.println("\n1- Somar as duas Matrizes.");
		System.out.println("\n2- Subtrair a 1� da 2�.");
		System.out.println("\n3- Adicionar uma vari�vel �s duas Matrizes.");
		System.out.println("\n4- Imprimir as matrizes.");
		System.out.println("\n Op��o inv�lida. Digite novamente sua op��o.");
		
		op = leia.nextInt();
		
		}
		do
		{
		switch(op)
		{
		case 1:
			for(x=0;x<2;x++) {
				for(y=0;y<2;y++) {
					m3[x][y] = m1[x][y]+m2[x][y];
					System.out.println("\nSomatt�rio"+m3[x][y]);
				}
			}
			break;
		case 2:
			for(x=0;x<2;x++) {
				for(y=0;y<2;y++) {
					m3[x][y] = m2[x][y]-m1[x][y];
					System.out.println("\nDiferen�a de Matriz1 da Matriz2= "+m3[x][y]);
				}
			}
			break;

		case 3:
			System.out.println("\nEntre com um n�mero: "); // adiciona o mesmo valor para as duas matrizes
			num = leia.nextInt();

			for(x=0;x<2;x++) {
				for(y=0;y<2;y++) {
					m1[x][y]+=num;
					m2[x][y]+=num;
					System.out.println("\nMatriz1 " + m1[x][y]);
					System.out.println("\nMatriz1 " + m2[x][y]);
				}
			}
			break;
		case 4:
			for(x=0;x<2;x++) {
				for(y=0;y<2;y++) {
					
					System.out.println("\nMatriz1 " + m1[x][y]);
					System.out.println("\nMatriz1 " + m2[x][y]);
				}
			}
			break;
		
		}
		}while(op<1 || op>4);
		
	}
}
/*4- Fa�a um programa que leia duas matrizes 2 x 2 com valores reais. Ofere�a ao usu�rio um menu de op��es:
(1) somar as duas matrizes 
(2) subtrair a primeira matriz da segunda 
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes 
Nas duas primeiras op��es uma terceira matriz 2 x 2 deve ser criada. Na terceira op��o o valor da constante deve ser lido e o resultado da adi��o da constante deve ser armazenado na pr�pria matriz.

*/