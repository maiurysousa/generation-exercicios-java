package pacotePOO;

public class testPaciente {
	public static void main(String[] args)
	{

		Paciente paciente1 = new Paciente("Marcia","Souza","Ribeiro",656,42,36,180,95);
		Paciente paciente2 = new Paciente("Jos�","Lima","de Sousa",625,36,36,171,87);
		Paciente paciente3 = new Paciente("Marcelo","Gomes","Lima",147,22,37,163,63);
		
		paciente1.imprimirInfo();
		
		System.out.println("\n**** ALTERA��O DE INFORMA��ES ****");
		paciente1.setTemperatura(38);
		paciente1.imprimirInfo();
		System.out.println("\nAltera��o na temperatura!");
		
		paciente1.testeFebre();
		
				
		paciente2.imprimirInfo();
		
		System.out.println("\n**** ALTERA��O DE INFORMA��ES ****");
		paciente2.setTemperatura(37);
		paciente2.imprimirInfo();
		System.out.println("\nAltera��o na temperatura!");
		
		paciente2.testeFebre();
		
		
		paciente3.imprimirInfo();
		
		System.out.println("\n**** ALTERA��O DE INFORMA��ES ****");
		paciente3.setTemperatura(34);
		paciente3.imprimirInfo();
		System.out.println("\nAltera��o na temperatura!");
		
		paciente3.testeFebre();
		
		
		
		
		

	}
}
