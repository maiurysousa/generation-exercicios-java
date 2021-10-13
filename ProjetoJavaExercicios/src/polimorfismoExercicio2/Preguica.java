package polimorfismoExercicio2;

	public abstract class Preguica extends AnimalPoli {
		
		
		private String escalar;
		
		public Preguica()
		{
			super("Animal Preguiça");
		}

		@Override //indicação de método polimorfico (sobrescrita de métodos)
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
			+"\nEscala árvores: "+escalar);
		}


		public String getEscalar() {
			return escalar;
		}

		public void setEscalar(String escalar) {
			this.escalar = escalar;
		}
		*/	
}
