package Polimorfismo;

public class Publico extends Telefone{
	
	public Publico() //construtor
	{
		super("Telefone P�blico");
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
		if(numero.charAt(0)=='9' || numero.charAt(0)=='8')//pega uma posi��o dentro do meu String que vai ser passada no par�metro. Pega o primeiro caracter do n�mero do celular e verifica se � 9 ou 8, se sim...
		{
			System.out.println("\nEste telefone n�o liga para celular");
		}
		else
		{
			System.out.println("\nDiscando: "+numero);
		}
	}

}
