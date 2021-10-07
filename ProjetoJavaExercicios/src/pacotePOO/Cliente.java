package pacotePOO;

public class Cliente {
	private String primeiroNome;
	private String ultimoNome;
	private int cpf;
	private int idade;
	
	public Cliente (String primeiro,String ultimo, int cpf, int idade)
	{
		primeiroNome = primeiro;
		ultimoNome = ultimo;
		this.setCpf(cpf);
		this.setIdade(idade);

	}
	
	public String getNomeCompleto()
	{
		String nomeCompleto = primeiroNome+" "+ultimoNome;
		return nomeCompleto;
	}
		
	public void imprimirInfo()
	{
		System.out.println("\nCliente: "+this.getNomeCompleto()
						+"\nCPF: "+cpf
						+"\nIdade: "+idade);
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
	

	
}
/* 1) Crie uma classe cliente e apresente os atributos e métodos 
 * referentes esta classe, em seguida crie um objeto cliente, defina as 
 * instancias deste objeto e apresente as informações deste objeto no console.*/