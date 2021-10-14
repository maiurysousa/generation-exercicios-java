package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excecao2 {

	//demonstra o lan�amento de uma exce��o quando ocorre uma ddivis�o por zero
	
	public static int quociente (int numerador, int denominador) throws ArithmeticException
	{
		return numerador / denominador; //possibilita a divis�o por 0 tratando o problema
	}
	
	public static void main(String[] args) {

Scanner leia = new Scanner(System.in);

boolean continuaLoop = true;

do 
{
	try //l�  dois n�meros e calcula o quociente
	{
		System.out.println("\nentre occm o numerrador: ");
		int numerador = leia.nextInt();
	
		System.out.println("\nentre occm o dnominador: ");
		int denominador = leia.nextInt();
		
		int result = quociente(numerador,denominador);
		System.out.printf("\nResultado: %d / %d = %d\n",numerador,denominador,result);
		continuaLoop = false; //para poder sair do la�o
	
	}
	catch(InputMismatchException inputMismatchException)
	{
		System.err.printf("\nExcepition: %s\n",inputMismatchException); // %s num tipo String err: para mostrar uma mensagem de erro em vermelho
		leia.nextLine(); // Limpa o casch e n�o atuaaliza para falsa, vai ajudar a sair do la�o
		System.out.println("\nVoc� deve entrar com um valor do tipo inteiero...\nPor favor, tente novamente...");
		
	}
	catch(ArithmeticException arithmeticException)
	{
		
	System.err.printf("\nExcepition: %s\n",arithmeticException);
	//leia.nextLine();
	System.out.println("\nZero � um denominador inv�lido...\nPor favor, tente novamente..."); // emite mensagem de aleerta 
		
	}
}
while(continuaLoop);

	}

}