package polimorfismoExercicio2;

public abstract class AnimalPoli {
	
	private String tipoAnimal;
	
	abstract public void emitirSom(String som);
	abstract public void correr (int velocidade);
	
	public AnimalPoli(String tipoAnimal)
	{
		this.tipoAnimal=tipoAnimal;
	}
	
	public String getTipoAnimal() {
		return tipoAnimal;
	}
	
	public void setTipoAnimal(String tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
	}
}

