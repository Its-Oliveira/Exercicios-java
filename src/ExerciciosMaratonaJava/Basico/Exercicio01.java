package ExerciciosMaratonaJava.Basico;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        double num1 = scan.nextDouble();
        System.out.println("Digite o segundo número:");
        double num2 = scan.nextDouble();
        System.out.println("Digite a operação que deseja realizar: \n 1 - Soma\n 2 - Subtração\n 3 - Multiplicação\n 4 - Divisão");
        int op = scan.nextInt();

        switch (op) {
            case 1:
                System.out.println("O resultado da soma de " + num1 + " + " + num2 + " é " + (num1 + num2));
                break;
            case 2:
                System.out.println("O resultado da subtração de " + num1 + " - " + num2 + " é " + (num1 - num2));
                break;
            case 3:
                System.out.println("O resultado da multiplicação de " + num1 + " * " + num2 + " é " + (num1 * num2));
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("Não é possível dividir por zero");
                } else {
                    System.out.println("O resultado da divisão de " + num1 + " / " + num2 + " é " + (num1 / num2));
                }
                break;

            default:
                System.out.println("Opção invalida");
        }

        scan.close();

    }
}
