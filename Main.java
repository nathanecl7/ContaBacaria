import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nome = "Nathane";
        String conta = "corrente";
        double saldo = 2500;
        double valorReceber = 0;
        double valorTransferir = 0;
        int opcaoDesejada = 0;

        System.out.println("********************************");
        System.out.println("\nDados iniciais do cliente:");
        System.out.println("Nome:" + nome);
        System.out.println("Tipo de Conta:" + conta);
        System.out.println("Saldo Inicial:" + saldo);
        System.out.println("\n*******************************\n");

        String menu = """
                        -------Operações------
                        1- Consultar saldos
                        2- Receber valor
                        3- Transferir valor
                        4- Sair
                """;

            while (opcaoDesejada != 4) {
                System.out.println(menu);
                System.out.println("Digite a opção desejada: ");
                opcaoDesejada = leitor.nextInt();

                if (opcaoDesejada == 1) {
                    System.out.println("O seu saldo é R$" + saldo);

                } else if (opcaoDesejada == 2) {
                    System.out.println("Informe o valor a receber:");
                    valorReceber = leitor.nextDouble();
                    saldo = saldo + valorReceber;
                    System.out.println("Seu saldo atualizado R$ " + saldo);

                } else if (opcaoDesejada == 3) {
                    System.out.println("Informe o valor a transferir:");
                    valorTransferir = leitor.nextDouble();
                        if (valorTransferir > saldo) {
                            System.out.println("Não há saldo para realizar a transferência.");
                        }else {
                            saldo = saldo - valorTransferir;
                        }
                        System.out.println("Seu saldo atualizado R$ " + saldo);
                }
                else if (opcaoDesejada != 4){
                    System.out.println("Opção Invalida!");
                }
        }
    }
}
