package polimorfismoExercicio2;

	public class Preguica extends AnimalPoli {
		
	
		public Preguica()
		{
			super("Animal PreguiÁa");
		}

		@Override 
		public void emitirSom()
		{
			System.out.println("\n√√√HHHHH...");
		}
		
		@Override
		public void animal(String tipo)
		{
			System.out.println("\nO animal È um preguica.");
		}
		
}
