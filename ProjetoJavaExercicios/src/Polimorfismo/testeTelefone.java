package Polimorfismo;

public class testeTelefone {

	public static void main(String[] args) {
		Celular celular = new Celular();
		Fixo fixo = new Fixo();
		Publico publico = new Publico();
		Telefone telefone = null; //Aqui n�o est� instanciando. est� criando uma vari�vel telefone do tipo telefone q tem um valor inicialmente null
		
		int n = (int) (Math.random()*3.0);// colocar no n 3 valores  para retornar o m�mero//n�mero aleat�rios
		
		System.out.println("\nO n�mero escolhido foi "+n);
		
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
			telefone.toca(1);//n�mero de toques que vai ter
		}
	}

}
