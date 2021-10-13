package Interfaces;

public class testeFiguras {

	public static void main(String[] args) {
		Quadrado figura1 = new Quadrado(10,"Quadrado1");
		Retangulo figura2 = new Retangulo(3,4,"Retângulo1");
		
		System.out.println("\n"+figura1.getNome()+" -- " + "Diagonal1: "+figura1.getDiagonal());
		System.out.println("\n"+figura2.getNome()+" -- " + "Diagonal1: "+figura2.getDiagonal());
	}

}