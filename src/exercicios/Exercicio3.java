package exercicios;
import java.util.Scanner;

public class Exercicio3 {
    public static double maior5(double a, double b, double c, double d, double e) {
        double maior;
        if (a > b && a > c && a > d && a > e) {
            maior = a;
        } else if (b > c && b > d && b > e) {
            maior = b;
        } else if (c > d && c > e) {
            maior = c;
        } else {
            maior = d;
        }
        return maior;
    }

    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        double n1 = scan.nextDouble();
        double n2 = scan.nextDouble();
        double n3 = scan.nextDouble();
        double n4 = scan.nextDouble();
        double n5 = scan.nextDouble();
        double result = maior5(n1,n2,n3,n4,n5);
        System.out.println("O maior valor é "+result);

    }


}
