package ExerciciosMaratonaJava.Intermediario.exercicio26;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Produto prod1 = new Produto();
        Produto prod2 = new Produto();

        System.out.print("Digite o nome produto 1: ");
        prod1.nome = sc.next();
        System.out.print("Digite a quantidade do produto " + prod1.nome+ ": ");
        prod1.quantidade = sc.nextInt();
        System.out.print("Digite o preco do produto " + prod1.nome+ ": ");
        prod1.preco = sc.nextDouble();

        System.out.print("Digite o nome produto 2: ");
        prod2.nome = sc.next();
        System.out.print("Digite a quantidade do produto " + prod2.nome + ": ");
        prod2.quantidade = sc.nextInt();
        System.out.print("Digite o preco do produto " + prod2.nome + ": ");
        prod2.preco = sc.nextDouble();

        prod1.analisarProdutos(prod1, prod2);







    }
}
