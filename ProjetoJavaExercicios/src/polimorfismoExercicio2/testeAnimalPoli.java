package polimorfismoExercicio2;

public class testeAnimalPoli {
	
		public static void main(String[] args) {
			
			Cachorro cachorro = new Cachorro();
			Cavalo cavalo = new Cavalo();
			Preguica preguica= new Preguica();
			AnimalPoli animal = null;
			
			int n = (int) (Math.random()*3.0);	
			
			System.out.println("\nO som do animal é: "+n);
			
			switch(n)
			{
			case 0: cachorro.emitirSom();cachorro.animal(null);break;
			case 1: cavalo.emitirSom();cavalo.animal(null);break;
			case 2: preguica.emitirSom();preguica.animal(null);break;
			default: System.out.println("\nErro inesperado");
			}

		}
	
}
