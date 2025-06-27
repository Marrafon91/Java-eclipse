package dadosServidor;

public class DadosServidor {
    private int conta;
    private String nome;
    private double depositoInicial;
    private double deposito;
    private double saque;

    public DadosServidor() {
    }

    public DadosServidor(int conta, String nome, double depositoInicial, double deposito, double saque) {
        this.conta = conta;
        this.nome = nome;
        this.depositoInicial = depositoInicial;
        this.deposito = deposito;
        this.saque = saque;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public String getName() {
        return nome;
    }

    public void setName(String nome) {
        this.nome = nome;
    }

    public double getDepositoInicial() {
        return depositoInicial;
    }

    public void setDepositoInicial(double depositoInicial) {
        this.depositoInicial = depositoInicial;
    }

    public double getDeposito() {
        return deposito;
    }

    public double getSaque() {
        return saque;
    }

    public void addDeposito(double valor) {
        this.deposito += valor;
    }

    public void realizarSaque(double valor) {
        double valorComTaxa = valor + 5.0; // taxa de saque
        this.saque += valorComTaxa;
    }

    public double getSaldo() {
        return depositoInicial + deposito - saque;
    }
}
