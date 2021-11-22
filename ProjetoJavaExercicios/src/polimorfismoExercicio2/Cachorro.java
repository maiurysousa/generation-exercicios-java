package PolimorfismoExercicio2;

public class Cachorro extends AnimalPoli{
	
	public Cachorro()
	{
		super("Cachorro");
	}

	@Override 
	public void emitirSom()
	{
		System.out.println("\n AU AU!! AU AU...");
	}
	
	@Override
	public void animal(String tipo)
	{
		System.out.println("\nO animal é um cachorro.");
	}

}
