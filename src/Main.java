import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nome = "Leo Remerson";
        String conta = "Corrente";
        double saldo = 2500.55;
        int opcao = 0;

        System.out.println("**********************************");
        System.out.println("Dados Cadastrais:");
        System.out.println("\nCliente:        " + nome);
        System.out.println("Conta:          " + conta);
        System.out.println(String.format("Saldo:          R$%.2f", saldo));
        System.out.println("\n**********************************");

        String menu = """
                
                Operações:
                
                1- Consultar saldo
                2- Depositar valor
                3- Transferir valor
                4- Sair
                
                Digite a opção desejada:
                """;

        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println(String.format("Seu saldo atual é R$:%.2f ", saldo));
            } else if (opcao == 2) {
                System.out.println("Digite o valor que deseja depositar: ");
                double deposito = leitura.nextDouble();
                saldo += deposito;
                System.out.println(String.format("Depósito realizado. Seu saldo atual é: R$%.2f", saldo));
            } else if (opcao == 3) {
                System.out.println("Digite o valor que deseja transferir: ");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Você não possui esse valor para transferência.");
                } else {
                    saldo -= valor;
                    System.out.println(String.format("Transferência realizada. Seu saldo atual é: R$%.2f", saldo));
                }
            } else if (opcao == 4){
                System.out.println("Até breve, " + nome + ".");
            } else {
                System.out.println("Opção inválida.");
            }
        }
    }
}