package Polimorfismo;

public class Publico extends Telefone{
	
	public Publico() //construtor
	{
		super("Telefone Público");
	}
	
	@Override
	public void toca (int numToques)
	{
		for(int i=0;i<numToques;i++)
		{
			System.out.println("\nTirinrinrinrin...");
		}
	}
	
	@Override 
	public void disca (String numero)
	{
		if(numero.charAt(0)=='9' || numero.charAt(0)=='8')//pega uma posição dentro do meu String que vai ser passada no parâmetro. Pega o primeiro caracter do número do celular e verifica se é 9 ou 8, se sim...
		{
			System.out.println("\nEste telefone não liga para celular");
		}
		else
		{
			System.out.println("\nDiscando: "+numero);
		}
	}

}
