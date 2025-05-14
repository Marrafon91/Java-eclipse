package curso_programacao;

import java.util.Locale;

public class index {

	public static void main(String[] args) {
  String produto1 = "Computador";
  String produto2 = "Radio";
  
  int idade = 30;
  int codigo = 5290;
  char genero = 'F';
  
  double preco1 = 2100.0;
  double preco2 = 650.0;
  double valor = 53.23456700;
  
  System.out.println(produto1 + " o preço é R$" +  preco1);
  System.out.println(produto2 + " o preço é R$" +  preco2);
  System.out.println(idade + " anos de idade, codigo " +  codigo + " e genero: " + genero);
  System.out.println("Valor com oito casas decimais: " + valor);
  System.out.printf("Valor (com três casas decimais) %.3f\n", valor);
  Locale.setDefault(Locale.US);
  System.out.printf("US ponto decimal %.3f\n", valor);
}
	
}
