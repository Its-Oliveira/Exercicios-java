package exercicios;
import java.util.Scanner;

public class exercicios1 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor a ser pago: ");
        double valorTotal = scan.nextDouble();
        double valorFinal = valorTotal * 1.1;
        System.out.println(String.format("%.2f", valorFinal));
    }
}
