package PacoteJava;

import java.util.Scanner;

public class classeExercicio8 {
	public static void main(String[] args) {
		
		double custoFab, porcDis, porcImp, custoCons;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite custo de f�brica do carro: ");
		custoFab = leia.nextDouble();

		porcDis = ((custoFab / 100) * 28);
		porcImp = ((custoFab / 100) * 45);

		custoCons = custoFab + porcDis + porcImp;
		System.out.println("\nO custo do carro ao consumidor � de: R$"+custoCons);
				
	}
			
}

/*8. O custo ao consumidor de um carro novo � a soma do custo de 
 f�brica com a percentagem do distribuidor e dos impostos (aplicados
 ao custo de f�brica).Supondo que a percentagem do distribuidor seja de
  28% e os impostos de 45%, escrever um sistema que leia o custo de f�brica
   de um carro e escreva o custo ao consumidor.  */
