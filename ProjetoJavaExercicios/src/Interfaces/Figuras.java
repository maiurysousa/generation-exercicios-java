package Interfaces;

public interface Figuras {
	public String nomeInterface = "Figuras";
	
	abstract public String getNome(); //m�todo abstrato
	abstract public void setNome(String nome);
	
	public double getArea();//m�todo n�o abstrato
	public double getPerimetro();
	
	double getDiagonal();
}
