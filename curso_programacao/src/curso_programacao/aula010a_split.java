package curso_programacao;

public class aula010a_split {

	public static void main(String[] args) {
		
		String s = "potato apple lemon orange";
		String[] vet = s.split(" ");
		
		System.out.println(vet[0]);
		System.out.println(vet[1]);
		System.out.println(vet[2]);
		System.out.println(vet[3]);

	}

}
