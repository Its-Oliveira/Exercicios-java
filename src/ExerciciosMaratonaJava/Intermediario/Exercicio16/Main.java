package ExerciciosMaratonaJava.Intermediario.Exercicio16;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Pessoa pessoa = new Pessoa();
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        pessoa.nome = scan.nextLine();
        System.out.print("Digite sua idade: ");
        pessoa.idade = scan.nextInt();
        System.out.print("Digite sua altura: ");
        pessoa.altura = scan.nextDouble();

        pessoa.imprime();

    }
}
