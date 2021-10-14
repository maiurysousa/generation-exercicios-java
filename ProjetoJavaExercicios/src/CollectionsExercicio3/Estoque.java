package CollectionsExercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class Estoque {
	public static void main(String[] args) {
		
		int op;
		Scanner leia = new Scanner (System.in);
		
		ArrayList<String> listaEstoque = new ArrayList();		
		
		do
		{
			System.out.println("\n--------------- LISTA DE OP��ES -----------------");
			System.out.println("\n(1) Para adicionar produtos ao estoque.");
			System.out.println("\n(2) Para remover produtos do estoque.");
			System.out.println("\n(3) Para atualizar produtos do estoque.");
			System.out.println("\n(4) Para mostrar todos os produtos do estoque.");
			System.out.println("\n(0) Para sair do programa.");
			System.out.println("\n-------------------------------------------------");
			System.out.println("\nDigite uma op��o: ");
			op = leia.nextInt();


			switch(op)
			{
			case 1:
				leia.nextLine(); //vazio para limpar o cash 
				System.out.println("\nDigite o produto para adicionar ao estoque: ");
				String produto = leia.nextLine(); //adicionar um produto digitado pelo usus�rio
			
				if(listaEstoque.contains(produto))// verifica se o produto existe no estoque
				{
					System.out.println("\n"+produto+" j� existe no estoque, voc� est� acrescentando mais.");
				}
				listaEstoque.add(produto);
				break;
				
			case 2:
				leia.nextLine();
				System.out.println("\nDigite o produto para remover do estoque");
				String remover = leia.nextLine();
				if(listaEstoque.contains(remover))
				{
					listaEstoque.remove(remover);//remove produto 
				}
				else
				{
					System.out.println("\nProduto n�o existe no estoque");
				}
				break;
			
			case 3:
				leia.nextLine();
				System.out.println("\nDigite o produto que deseja substituir: ");
				String verifica = leia.nextLine();
				System.out.println("\nDigite o nome do produto que substituir� "+verifica+": ");
				String novo = leia.nextLine();
				if(listaEstoque.contains(verifica))
				{
					listaEstoque.remove(verifica);
					listaEstoque.add(novo);
					
					if(listaEstoque.contains(novo))
					{
						System.out.println("\n"+novo+" j� existe no estoque, voc� est� acrescentando mais.");
					}					
				}
				break;
				
			case 4:
				leia.nextLine();
				System.out.println("\nProdutos do estoque: ");
				System.out.println(listaEstoque);
				break;
				
			default:
				System.err.println("\nSaindo do programa...");
				//System.err.println("\nOp��o inv�lida...");
			}	
			
		}
		while(op!=0); 

	}

}
/*Crie uma um programa para trabalhar com estoque de uma loja, o programa dever� trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o programa dever� atender as seguintes funcionalidades:

Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.
*/