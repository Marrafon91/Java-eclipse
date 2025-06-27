package dadosBancario;

import java.util.Locale;
import java.util.Scanner;

import dadosServidor.DadosServidor;

public class DadosCliente {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DadosServidor cliente = new DadosServidor();

        System.out.print("Entre com o número da conta: ");
        cliente.setConta(sc.nextInt());

        sc.nextLine(); // limpar o buffer

        System.out.print("Entre com o seu nome: ");
        cliente.setName(sc.nextLine());

        System.out.print("Tem um depósito inicial? (s/n): ");
        char resposta = sc.next().toLowerCase().charAt(0);

        if (resposta == 's') {
            System.out.print("Informe o valor do depósito inicial: ");
            double valor = sc.nextDouble();
            cliente.setDepositoInicial(valor);
        } else {
            cliente.setDepositoInicial(0.0);
        }

        // Exibe dados iniciais
        System.out.println("\nDados da conta:");
        System.out.printf("Conta: %d, Nome: %s, Balanço: $ %.2f%n",
                cliente.getConta(), cliente.getName(), cliente.getSaldo());

        // DEPÓSITO
        System.out.print("\nEntre com o valor do depósito: ");
        double deposito = sc.nextDouble();
        cliente.addDeposito(deposito);

        System.out.println("Atualização da conta após depósito:");
        System.out.printf("Conta: %d, Nome: %s, Balanço: $ %.2f%n",
                cliente.getConta(), cliente.getName(), cliente.getSaldo());

        // SAQUE
        System.out.print("\nEntre com o valor do saque: ");
        double saque = sc.nextDouble();
        cliente.realizarSaque(saque);

        System.out.println("Atualização da conta após saque:");
        System.out.printf("Conta: %d, Nome: %s, Balanço: $ %.2f%n",
                cliente.getConta(), cliente.getName(), cliente.getSaldo());

        sc.close();
    }
}
