
public class Quadrado extends BaseFigura implements Figuras{ //Multipla Heran�a, posso implementar v�rriaas classe, mas  extender uma �nica classe
	
	Quadrado(double lado, String nome)
	{
		super(lado,lado,nome); // lado lado pq � um quadrado e os lados s�o iguais, basta colocar apenas lado  ao inv�s de lado1 e lado2. Tem o mesmo valor
		nomeClasse="Quadrado";
	}
	//implenmentar um m�todo da minha interface
	@Override // � um m�etodo polimorfico
	public double getDiagonal()
	{
	 return Math.sqrt(2)*lado1;	//formula matem�tica pra calcular a diagonal do quadrado
	}
	

}
