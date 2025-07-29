package curso_programacao;

import entities.ClientHash;

public class aula043HashCode_e_Equals {

	public static void main(String[] args) {

		// Criando dois objetos diferentes, mas com os mesmos dados
		ClientHash c1 = new ClientHash("Maria", "maria@gmail.com");
		ClientHash c2 = new ClientHash("Maria", "maria@gmail.com");

		// Criando duas strings usando literais (constantes) - são internadas na memória
		String s1 = "Test";
		String s2 = "Test";

		// Criando duas strings com 'new', que cria novos objetos mesmo com o mesmo conteúdo
		String s3 = new String("Test");
		String s4 = new String("Test");

		// Imprime o hashCode dos dois objetos Client
		// Se o método hashCode estiver sobrescrito corretamente, os valores devem ser iguais
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());

		// Compara o conteúdo dos objetos usando equals (precisa estar sobrescrito na classe Client)
		System.out.println(c1.equals(c2)); // true se equals estiver sobrescrito corretamente

		// Compara as referências dos objetos (verifica se apontam para o mesmo espaço na memória)
		System.out.println(c1 == c2); // false, pois são dois objetos diferentes

		// Compara as referências das strings s1 e s2
		// Como são literais, Java reaproveita a mesma referência (interning)
		System.out.println(s1 == s2); // true

		// Compara as referências das strings s3 e s4 criadas com 'new'
		// Mesmo conteúdo, mas referências diferentes
		System.out.println(s3 == s4); // false
	}
}
