package Polimorfismo;

public class testeTelefone {

	public static void main(String[] args) {
		Celular celular = new Celular();
		Fixo fixo = new Fixo();
		Publico publico = new Publico();
		Telefone telefone = null; //Aqui não está instanciando e sim criando uma variável chamada "telefone" inicialmente com o valor null
		
		int n = (int) (Math.random()*3.0);// colocar no "n" 3 valores  para retornar múmeros aleatórios
		
		System.out.println("\nO número escolhido foi "+n);
		
		switch(n)
		{
		case 0: telefone = celular;break;
		case 1: telefone = fixo; break;
		case 2: telefone = publico; break;
		default: System.out.println("\nErro inesperado");
		}
		
		if(telefone!=null)
		{
			telefone.disca("92324544");
			telefone.toca(1);//número de toques que vai ter
		}
	}

}
