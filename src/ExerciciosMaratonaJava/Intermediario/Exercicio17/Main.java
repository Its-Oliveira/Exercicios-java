package ExerciciosMaratonaJava.Intermediario.Exercicio17;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Retangulo retangulo = new Retangulo();
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a largura do retângulo: ");
        retangulo.largura = scan.nextDouble();
        System.out.print("Digite a altura do retângulo: ");
        retangulo.altura = scan.nextDouble();

        retangulo.imprime();

    }
}
