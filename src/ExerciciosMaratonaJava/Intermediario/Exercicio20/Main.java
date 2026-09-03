package ExerciciosMaratonaJava.Intermediario.Exercicio20;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Produto produto = new Produto();

        System.out.print("Digite o nome do produto: ");
        produto.nome = scan.nextLine();
        System.out.print("Digite a quantidade inicial do produto em estoque: ");
        produto.quantidade = scan.nextInt();
        System.out.print("Digite o preço do produto em R$: ");
        produto.preco = scan.nextDouble();

        boolean roda = true;
        while (roda) {
            System.out.println("---------------------------------------");
            System.out.println("O que deseja fazer?");
            System.out.println("1 - Adicionar estoque\n2 - Retirar estoque\n3 - Calcular valor total armazenado\n4 - Sair");
            System.out.println("---------------------------------------");
            int op = scan.nextInt();
            switch (op) {
                case 1:
                    System.out.print("Digite a quantidade que deseja adicionar: ");
                    int addQtd = scan.nextInt();
                    produto.adicionarEstoque(addQtd);
                    break;

                case 2:
                    System.out.print("Digite a quantidade que deseja retirar: ");
                    int remQtd = scan.nextInt();
                    produto.retirarEstoque(remQtd);
                    break;

                case 3:
                    System.out.println("Quantidade " + produto.nome + ": " + produto.quantidade + "\nValor total: R$ " + produto.calcularValorEstoque()); ;
                    break;

                case 4:
                    System.out.println("Adeus");
                    roda = false;

                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }
}
