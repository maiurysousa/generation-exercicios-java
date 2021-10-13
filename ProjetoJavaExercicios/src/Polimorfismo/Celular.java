package Polimorfismo;

public class Celular extends Telefone {
	public Celular()
	{
		super("Telefone Celuular");
	}

	@Override //indicação de método polimorfico (sobrescrita de métodos)
	public void toca(int codigoToque)
	{
		switch(codigoToque)
		{
		case 1:
			System.out.println("Tirirlim..Tirilim...Tirilim...");
			break;
		case 2:
			System.out.println("Eletrovision");
			break;
		default:
			System.out.println("Tarãrãm");
	}
}
@Override
public void disca(String numero)
{
	System.out.println("\nO número: "+numero+" é um celular.");
}
}

