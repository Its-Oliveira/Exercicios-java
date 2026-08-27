package exercicios;
import java.util.Scanner;

public class exercicio2 {
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);
        double largura = scan.nextDouble();
        double comprimento = scan.nextDouble();
        double valor = scan.nextDouble();

        double valorTotal = valor/(largura*comprimento);
        System.out.println("O valor do metro quadrado é "+ String.format("%.3f", valorTotal));
    }
}
