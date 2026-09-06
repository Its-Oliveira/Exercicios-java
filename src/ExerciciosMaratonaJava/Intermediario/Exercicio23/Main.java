package ExerciciosMaratonaJava.Intermediario.Exercicio23;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        boolean roda = true;
        double num1, num2;
        while (roda){
            System.out.println("-------------------------------------");
            System.out.println("Selecione a operação que deseja realizar: ");
            System.out.println("1 - Soma \n2 - Subtração \n3 - Multiplicação \n4 - Divisão \n5 - Sair");
            System.out.println("-------------------------------------");
            int option = scan.nextInt();
            switch (option){
                case 1:
                    System.out.print("Digite o primeiro número: ");
                    num1 = scan.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    num2 = scan.nextDouble();
                    System.out.println("A soma de " + num1 + " + " + num2 + " é " + calculadora.somar(num1,num2));
                    break;

                case 2:
                    System.out.print("Digite o primeiro número: ");
                    num1 = scan.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    num2 = scan.nextDouble();
                    System.out.println("A subtração de " + num1 + " - " + num2 + " é " + calculadora.subtracao(num1,num2));
                    break;

                case 3:
                    System.out.print("Digite o primeiro número: ");
                    num1 = scan.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    num2 = scan.nextDouble();
                    System.out.println("A multiplicação de " + num1 + " * " + num2 + " é " + calculadora.multiplicacao(num1,num2));
                    break;

                case 4:
                    System.out.print("Digite o primeiro número: ");
                    num1 = scan.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    num2 = scan.nextDouble();
                    calculadora.divisao(num1,num2);
                    break;

                case 5:
                    System.out.println("Adeus!");
                    roda = false;
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        }
        scan.close();

    }
}
