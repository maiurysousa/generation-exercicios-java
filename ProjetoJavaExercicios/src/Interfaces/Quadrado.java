package Interfaces;

public class Quadrado extends BaseFigura implements Figuras{ //M�ltipla Heran�a: Pode implementar v�rias classes, mas  extender uma �nica classe
	
	Quadrado(double lado, String nome)
	{
		super(lado,lado,nome); // "lado, lado" pq � um quadrado e os lados s�o iguais (possuem o mesmo valor), basta colocar apenas lado ao inv�s de lado1 e lado2. 
		nomeClasse="Quadrado";
	}
	//implementar um m�todo da minha interface
	@Override // informando que � um m�etodo polimorfico
	public double getDiagonal()
	{
	 return Math.sqrt(2)*lado1;	//formula matem�tica pra calcular a diagonal do quadrado
	}
	

}