package herancaExercicio1;

public class Preguica extends Animal {
	
		private String escalar;
		
		public Preguica (String nome, int idade, String emitirSom, String escalar)
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
		
		
}
