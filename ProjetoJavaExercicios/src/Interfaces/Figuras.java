package Interfaces;

public interface Figuras {
	public String nomeInterface = "Figuras";
	
	abstract public String getNome(); //método abstrato
	abstract public void setNome(String nome);
	
	public double getArea();//método não abstrato
	public double getPerimetro();
	
	double getDiagonal();
}
