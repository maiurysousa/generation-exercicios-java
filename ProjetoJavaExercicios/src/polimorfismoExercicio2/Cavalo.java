package polimorfismoExercicio2;

public class Cavalo extends AnimalPoli {

	private String saltar;
	
	public Cavalo()
	{
		super("Animal Cavalo");
	}

	@Override //indicação de método polimorfico (sobrescrita de métodos)
	public void emitirSom(String som)
	{
		//ver o que colocar aqui
	}

	@Override
	public void correr (int velocidade)
	{
		//ver o que colocar aqui
	}

	public String getSaltar() {
		return saltar;
	}

	public void setSaltar(String saltar) {
		this.saltar = saltar;
	}
	
	
	
	/*public Cavalo(String nome, int idade, String emitirSom, String correr, String saltar)
	{
		super(nome,idade,emitirSom);
		this.correr = correr;
		this.saltar = saltar;
	}
	
	public void imprimirInfo()
	{
		System.out.println("\nNome do animal: "+getNome()
		+"\nIdade: "+getIdade()+" anos"
		+"\nRelincha: "+ getEmitirSom()
		+"\nVelocidade atingida: "+ correr+"km/h"
		+"\nSalto : "+ saltar);		
	}
	
	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}

	public String getSaltar() {
		return saltar;
	}

	public void setSaltar(String saltar) {
		this.saltar = saltar;
	}*/

		
}