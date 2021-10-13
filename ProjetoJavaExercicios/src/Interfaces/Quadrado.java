package Interfaces;

public class Quadrado extends BaseFigura implements Figuras{ //Múltipla Herança: Pode implementar várias classes, mas  extender uma única classe
	
	Quadrado(double lado, String nome)
	{
		super(lado,lado,nome); // "lado, lado" pq é um quadrado e os lados são iguais (possuem o mesmo valor), basta colocar apenas lado ao invés de lado1 e lado2. 
		nomeClasse="Quadrado";
	}
	//implementar um método da minha interface
	@Override // informando que é um méetodo polimorfico
	public double getDiagonal()
	{
	 return Math.sqrt(2)*lado1;	//formula matemática pra calcular a diagonal do quadrado
	}
	

}