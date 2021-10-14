package Exceptions;

public class Excecao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase = null;
		String novaFrase = null;
		
		try
		{
			novaFrase = frase.toUpperCase(); // joga todos os caracteres em mai�scula
		}
		catch(NullPointerException e) //e � o apelido para o nome NullPointerException //captura de uma poss�vel exce��o
		{
			//tratamento de ece��o
			System.out.println("\na fraase inicial ser� nula, para solucionar....");
			frase = "Frase vazia";
			novaFrase = frase.toUpperCase();
		}
		System.out.println("\nFrase antiga: "+frase);
		System.out.println("\nFrase nova: "+novaFrase);
		
		
	}

}