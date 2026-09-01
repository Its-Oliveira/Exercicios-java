package ExerciciosMaratonaJava.Intermediario.Exercicio18;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();

        System.out.print("Digite seu nome: ");
        funcionario.nome = scan.nextLine();
        System.out.print("Digite seu salário: ");
        funcionario.salario = scan.nextDouble();
        System.out.print("Digite sua idade: ");
        funcionario.idade = scan.nextInt();

        funcionario.imprimirSalarioAnual();
        System.out.println("Qual porcentagem você gostaria de aplicar em seu salário?");
        double porcent = scan.nextDouble()/100;
        funcionario.imprimirAumentoPercentual(porcent);

        scan.close();


    }
}
