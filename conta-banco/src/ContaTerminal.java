import java.util.Scanner;

public class ContaTerminal {

    int numero;
    String agencia;
    String nomeCliente;
    float saldo;

    public void capturarDados() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência:");
        this.agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta:");
        this.numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente:");
        this.nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo inicial:");
        this.saldo = scanner.nextFloat();

        scanner.close();
    }

    public void exibirDados() {
        System.out.println("Olá " + this.nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + this.agencia + ", conta " + this.numero + " e seu saldo " + this.saldo + " já está disponível para saque.");
    }

    public static void main(String[] args) {
        ContaTerminal conta = new ContaTerminal();
        conta.capturarDados();
        conta.exibirDados(); 
    }
}