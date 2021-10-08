package PacoteHeran�a;

public class Operario extends herancaPessoa {
	
	private double valorProducao;
	private double comissao;
	
	public Operario (String nome, String endereco, String cpf, int telefone,int idade, double valorProducao, double comissao)
	{
		super(nome,endereco,cpf,telefone,idade); //par�metros que vem da superclasse, preciso informar
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}
	
	public void imprimirInfo()
	{
		System.out.println("\nNome do empregado: "+getNome()+"\nCPF :"+getCpf()
				+"\nIdaded: "+getIdade()+"\nTelefone: "+getTelefone()+"\nEndere�o: "+ getEndereco()
				+"\nValor monet�rio dos artigos produzidos: "+valorProducao
				+"\nA porcentagem (sem % da comissao deste artigo: "+comissao);
	}
	public void calculaValorArtigo()
	{
		double valorTotal= valorProducao + (valorProducao*(comissao/100));
		
		System.out.println("\nO valor total a ser recebido pelo oper�rio"+getNome()
		+" � igual a: "+valorTotal);
	}


}
