package PolimorfismoExercicio2;
	public class Cavalo extends AnimalPoli {

	
		public Cavalo()
		{
			super("Animal Cavalo");
		}
		@Override 
		public void emitirSom()
		{
			System.out.println("\n IIIRRRR�... RILINCHINN...");
		}
		
		@Override
		public void animal(String tipo)
		{
			System.out.println("\nO animal � um cavalo.");
		}
}