package polimorfismoExercicio2;

public class Cachorro extends AnimalPoli{
	
	private String abanarRabo;
	
	public Cachorro()
	{
		super("Animal Cachorro");
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

	public String getAbanarRabo() {
		return abanarRabo;
	}

	public void setAbanarRabo(String abanarRabo) {
		this.abanarRabo = abanarRabo;
	}
	

	
	/*private String correr;
	private String abanarRabo;
			
	public Cachorro(String nome, int idade, String emitirSom, String correr, String abanarRabo)
	{
		super(nome,idade,emitirSom);
		this.abanarRabo = abanarRabo;
		this.correr = correr;
		
	}
	
	public void imprimirInfo()
	{
		System.out.println("\nNome: "+getNome()
		+"\nIdade: "+getIdade()+" anos"
		+"\nLate: "+ getEmitirSom()
		+"\nVelocidade atingida: "+ correr+"km/h"
		+"\nAbana o rabo: "+ abanarRabo);	
	}

	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}

	public String getAbanarRabo() {
		return abanarRabo;
	}

	public void setAbanarRabo(String abanarRabo) {
		this.abanarRabo = abanarRabo;
	}		*/
	
}
