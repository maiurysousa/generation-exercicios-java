package Polimorfismo;

public class Celular extends Telefone {
	public Celular()
	{
		super("Telefone Celuular");
	}

	@Override //indica��o de m�todo polimorfico (sobrescrita de m�todos)
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
			System.out.println("Tar�r�m");
	}
}
@Override
public void disca(String numero)
{
	System.out.println("\nO n�mero: "+numero+" � um celular.");
}
}

