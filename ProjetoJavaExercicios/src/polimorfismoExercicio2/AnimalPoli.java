package polimorfismoExercicio2;

public abstract class AnimalPoli {
	
	private String tipoAnimal;
	
	abstract public void emitirSom();
	abstract public void animal(String tipo);
	
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

