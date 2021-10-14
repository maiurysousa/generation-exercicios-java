package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Colecoes {

	public static void main(String[] args) {
		
		List<Integer> minhaLista = new ArrayList<Integer>();//list do tipo inteiro //ArreyList é um ordenador
		
		minhaLista.add(2);//valor que terá dentro dessa posição da lista
		minhaLista.add(1);
		minhaLista.add(3);
		minhaLista.add(2);
		minhaLista.add(1);
	
		for(Integer listaElementos:minhaLista)
		{
			System.out.println(listaElementos);//mostrando os elementos da lista
		}
		
		System.out.println("\nRemovendo um elemento da lista");
		System.out.println(); //Faz uma limpeza da memória cash
		minhaLista.remove(0);//Remove o indice que está nesta posição da lista
		
		for(Integer listaElementos:minhaLista) //Mostra novamente a lista e verifica se realmente removeu o elemento
		{
			System.out.println(listaElementos);
		}
		
		int primeiroElemento = minhaLista.get(0);//Aqui o elemento desta posição foi modificado pq o primeiro foi removido
		System.out.println("\nO primeiro elemento é: "+primeiroElemento);
		
		System.out.println();
		for(int i=0; i<minhaLista.size();i++) //vai até menos que minha lista ponto size(pega o tamanho do array list e passa o valor)
		{
			System.out.println("\nElemento: "+minhaLista.get(i)); //Pega a partir o indice i
		}
		
		Collections.sort(minhaLista);//sort ordena a lista toda em ordem crescente, do menor para o maior
		System.out.println("\nDepois de ordenado...");
		System.out.println(minhaLista);
		
		System.out.println();
		
		Set<Integer> meuSet = new HashSet<Integer>();
		//adicionando elementos dentro do Set
		meuSet.add(2);
		meuSet.add(1);
		meuSet.add(3);
		meuSet.add(4);
		meuSet.add(2);
		
		Iterator<Integer> iMeuSet = meuSet.iterator();// Iterator é uma API()Pacote de Informações que contém várrias soluções dentro) derivada do Collection, possibilita percorrer e remover um elemento dentro da minha Collection
		
		while(iMeuSet.hasNext())//hasNext enquannto verdadeiro perorre todo o iMeuSet até chegar no último elemento.
		{
			System.out.println(iMeuSet.next());//pega todos os elemento e imprime na tela lembrando que ele não permite elementos duplicados
		}
		
	}

}