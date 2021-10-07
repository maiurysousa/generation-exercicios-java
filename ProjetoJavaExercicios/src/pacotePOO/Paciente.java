package pacotePOO;

public class Paciente {
	private String primeiroNome;
	private String segundoNome;
	private String ultimoNome;
	private int cpf;
	private int idade;
	private float temperatura;
	private float altura;
	private float peso;
	
	
	public Paciente (String primeiro,String segundo, String ultimo, int cpf, int idade, float temperatura, float altura, float peso)
	{
		primeiroNome = primeiro;
		segundoNome = segundo;
		ultimoNome = ultimo;
		this.setCpf(cpf);
		this.setIdade(idade);
		this.setTemperatura(temperatura);
		this.setAltura(altura);
		this.setPeso(peso);
	}
	
	public String getNomeCompleto()
	{
		String nomeCompleto = primeiroNome+" "+segundoNome+" "+ultimoNome;
		return nomeCompleto;
	}
	
	public void imprimirInfo()
	{
		System.out.println("\nPaciente: "+this.getNomeCompleto()
						+"\nCPF: "+cpf
						+"\nIdade: "+idade
						+"\nTemperatuda: "+temperatura+"°C"
						+"\nAltura: "+altura
						+"\nPeso: "+peso+" quilos");
	}
	
	public void testeFebre()
	{
		if(temperatura>37.5) {
			System.out.println("O paciente está com febre e necessita de medicação!");
		}
		else {
			System.out.println("O paciente está de alta e pode ser liberado!");
		}
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(float temperatura) {
		this.temperatura = temperatura;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	
}
/*7) Crie uma classe paciente e apresente os atributos e métodos referentes
 esta classe, em seguida crie um objeto paciente, defina as instancias deste
 objeto e apresente as informações deste objeto no console.
 */