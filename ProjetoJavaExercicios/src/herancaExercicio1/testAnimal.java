package HerancaExercicio1;

public class testAnimal {

	public static void main(String[] args) {
		
		Cachorro Billy = new Cachorro("Billy",2,"Sim","50","Sim");
		
		Billy.imprimirInfo();
		
		Cavalo Maximum = new Cavalo("Thor",5,"Sim","88","2m");
		
		Maximum.imprimirInfo();
		
		Preguica Gertrudes = new Preguica ("Gertrudes",8,"Sim","Sim, até 2m");
		
		Gertrudes.imprimirInfo();

	}

}
