package ExerciciosMaratonaJava.Intermediario.Exercicio19;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria();

        System.out.print("Digite seu nome: ");
        conta.titular = scan.nextLine();
        System.out.print("Digite o saldo de sua conta: ");
        conta.saldo = scan.nextDouble();
        boolean roda = true;
        while (roda) {
            System.out.println("------------------------------------------------------------");
            System.out.println("Qual operação deseja realizar, " + conta.titular + "?");
            System.out.println("1 - Depositar\n2 - Sacar\n3 - Exibir saldo\n4 - Sair");
            System.out.println("------------------------------------------------------------");
            int op = scan.nextInt();
            switch (op) {
                case 1:
                    System.out.print("Digite o valor que deseja depositar: ");
                    double valorDeposito = scan.nextDouble();
                    conta.depositar(valorDeposito);
                    break;

                case 2:
                    System.out.println("Digite o valor que deseja sacar: ");
                    double valorSaque = scan.nextDouble();
                    conta.sacar(valorSaque);
                    break;

                case 3:
                    conta.exibirSaldo();
                    break;

                case 4:
                    roda = false;
                    System.out.println("Adeus");
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
        scan.close();
    }
}
