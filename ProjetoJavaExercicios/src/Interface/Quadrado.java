
public class Quadrado extends BaseFigura implements Figuras{ //Multipla Herança, posso implementar várriaas classe, mas  extender uma única classe
	
	Quadrado(double lado, String nome)
	{
		super(lado,lado,nome); // lado lado pq é um quadrado e os lados são iguais, basta colocar apenas lado  ao invés de lado1 e lado2. Tem o mesmo valor
		nomeClasse="Quadrado";
	}
	//implenmentar um método da minha interface
	@Override // é um méetodo polimorfico
	public double getDiagonal()
	{
	 return Math.sqrt(2)*lado1;	//formula matemática pra calcular a diagonal do quadrado
	}
	

}
