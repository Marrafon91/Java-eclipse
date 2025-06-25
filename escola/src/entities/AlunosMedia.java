package entities;

public class AlunosMedia {

	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public String name() {
		return name;
	}
	
	public double trimestre() {
		return nota1 + nota2 + nota3;
	}
	
	public double pontoFaltante() {
		if(trimestre() < 60.0) {
			return 60.0 - trimestre();
		} else {
			return 0.0;
		}
	}
}
