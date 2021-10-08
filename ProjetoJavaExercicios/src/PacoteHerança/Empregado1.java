package PacoteHeran�a;

public class Empregado1 extends herancaPessoa{
	private int codigoSetor;
	private float salarioBase;
	private float imposto;
	
	public Empregado1 (String nome, String endereco, String cpf, int telefone,int idade, int codigoSetor, float salarioBase, float imposto)
	{
		super(nome,endereco,cpf,telefone,idade); //par�metros que vem da superclasse, preciso informar
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}
	
	public void imprimirInfo()
	{
		System.out.println("\nNome do empregado: "+getNome()+"\nCPF :"+getCpf()
				+"\nIdaded: "+getIdade()+"\nTelefone: "+getTelefone()+"\nEndere�o: "+ getEndereco()
				+"\nC�digo do Setor: "+codigoSetor+"\nSalario Base: "+salarioBase
				+"\nValor em porcentage de Imposto a ser retido do sal�rio: "+imposto);
	}
	
	public void calcularSalario()
	{
		double salarioTotal = salarioBase-(salarioBase*(imposto/100));
		System.out.println("\nO sal�rio total a receber pelo empregado: "+getNome()
				+ " � igual �: "+salarioTotal);		
	}

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public float getImposto() {
		return imposto;
	}

	public void setImposto(float imposto) {
		this.imposto = imposto;
	}
	

}
