package pacotePOO;

public class testPaciente {
	public static void main(String[] args)
	{

		Paciente paciente1 = new Paciente("Marcia","Souza","Ribeiro",656,42,36,180,95);
		Paciente paciente2 = new Paciente("José","Lima","de Sousa",625,42,36,171,87);
		Paciente paciente3 = new Paciente("Marcelo","Gomes","Lima",147,42,36,163,63);
		
		paciente1.imprimirInfo();
		
		System.out.println("\n**** ALTERAÇÃO DE INFORMAÇÕES ****");
		paciente1.setTemperatura(35);
		paciente1.imprimirInfo();
		System.out.println("\nA temperatura mudou");
		
		paciente1.testeFebre();
		
		paciente2.imprimirInfo();
		
		paciente3.imprimirInfo();
		
		
		
		
		

	}
}
