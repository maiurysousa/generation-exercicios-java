package Polimorfismo;

public class Fixo extends Telefone {
	
	public Fixo() //construtor
	{
		super("Telefone Fixo");
	}
	//implemmentando métodos abstratos
	@Override
	public void toca(int numToques)
	{
		for(int i=0;i<numToques;i++)
		{
			System.out.println("\nTaranranran...");
		}
	}
	@Override
	public void disca(String numero)
	{
		System.out.println("\nDiscando: "+numero);
	}
}
