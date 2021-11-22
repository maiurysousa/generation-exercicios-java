package LacosdeDecisao;

import java.util.Scanner;

public class classExercise2 {

	public static void main(String[] args) {
		int n1,n2,n3,menor=0, medio=0, maior=0;
		 
		try (Scanner leia = new Scanner (System.in)) {
			System.out.println("\nEntre com três números diferentes!");
			
			System.out.println("\nEntre com o primeiro número: ");
			n1=leia.nextInt();
			System.out.println("\nEntre com o segundo número: ");
			n2=leia.nextInt();
			System.out.println("\nEntre com o terceiro número: ");
			n3=leia.nextInt();
			
			
			if(n1<n2 && n1<n3) {
				menor+=n1;
			}
			else if(n1>n2 && n1>n3) {
				maior+=n1;		
			}
			else {
				medio+=n1;
			}
			
			
			if(n2<n1 && n2<n3) {
				menor+=n2;
			}
			else if(n2>n1 && n2>n3) {
				maior+=n2;			
			}
			else {
				medio+=n2;
			}	
			

			if(n3<n1 && n3<n2) {
				menor+=n3;
			}
			else if(n3>n1 && n3>n2) {
				maior+=n3;			
			}
			else {
				medio+=n3;
			}	
			
			System.out.println("\nA ordem crescente é "+menor+", "+medio+" e "+maior+".");		
			
		}

	}

}
/*2.Faça um programa que entre com três números e coloque em ordem crescente.*/
