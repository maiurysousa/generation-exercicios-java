package polimorfismoExercicio2;

	public abstract class Preguica extends AnimalPoli {
		
		
		private String escalar;
		
		public Preguica()
		{
			super("Animal Pregui�a");
		}

		@Override //indica��o de m�todo polimorfico (sobrescrita de m�todos)
		public void emitirSom(String som)
		{
			//ver o que colocar aqui
		}
		

		public String getEscalar() {
			return escalar;
		}

		public void setEscalar(String escalar) {
			this.escalar = escalar;				
		}
		
		/*public Preguica (String nome, int idade, String emitirSom, String escalar)
		{
			super(nome,idade,emitirSom);
			this.escalar = escalar;
		}
		
		public void imprimirInfo()
		{
			System.out.println("\nNome do animal: "+getNome()
			+"\nIdade: "+getIdade()+" anos"
			+"\nEmite som: "+ getEmitirSom()
			+"\nEscala �rvores: "+escalar);
		}


		public String getEscalar() {
			return escalar;
		}

		public void setEscalar(String escalar) {
			this.escalar = escalar;
		}
		*/	
}
