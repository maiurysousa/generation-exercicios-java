package polimorfismoExercicio2;

	public class Preguica extends AnimalPoli {
		
	
		public Preguica()
		{
			super("Animal Pregui�a");
		}

		@Override 
		public void emitirSom()
		{
			System.out.println("\n���HHHHH...");
		}
		
		@Override
		public void animal(String tipo)
		{
			System.out.println("\nO animal � um preguica.");
		}
		
}
