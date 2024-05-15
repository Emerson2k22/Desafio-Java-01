import java.util.Scanner;

public class desafio {
    public static void main(String[] args) {
        String nomeCliente= "Emerson João da Silva";
        String tipoConta = "Poupança";
        double saldo = 1600.25;
        int opcao = 0;

        System.out.println("==============================================");
        System.out.println("\nNome do cliente: " + nomeCliente);
        System.out.println("Tipo da conta: " + tipoConta);
        System.out.println("Saldo atual da conta: " + saldo);
        System.out.println("\n==============================================");

        String menu = """
                ** Digite sua opção **
                1 - Consultar saldo
                2 - Pix
                3 - Receber valor
                4 - Sair
                """;
        Scanner leitura = new Scanner(System.in);
        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("Saldo atual: " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual valor do pix?");
                double valor = leitura.nextDouble();
                if (valor > saldo){
                    System.out.println("Saldo insuficiente!");
                } else {
                    saldo -= valor;
                    System.out.println("Novo saldo: " + saldo);
                }
            }
            else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo: " + saldo);
            }
            else if (opcao != 4) {
                System.out.println("Opão inválida");
            }
        }
    }
}
