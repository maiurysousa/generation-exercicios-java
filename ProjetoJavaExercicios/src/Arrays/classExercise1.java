package Arrays;

public class classExercise1 {

	public static void main(String[] args) {

		int a[]= {1, 0, 5, -2, -5, 7};
	
		int soma, modvetor;
		
		soma=a[0]+a[1]+a[5];
		System.out.println("\nA soma de A[0]+A[1]+A[5]= "+soma);
		
		a[4]= 100;
		System.out.println("\nA[0]= "+a[0]
						+"\nA[1]= "+a[1]
						+"\nA[2]= "+a[2]
						+"\nA[3]= "+a[3]
						+"\nA[4]= "+a[4]
						+"\nA[5]= "+a[5]);		

	}

}
/*1- Faça um programa que possua um vetor denominado A que armazene 6 números inteiros. O programa deve executar os seguintes passos: 
(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
(b) Armazene em uma variável inteira (simples) a soma entre os valores das posições A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
(c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100. 
(d) Mostre na tela cada valor do vetor A, um em cada linha.
*/