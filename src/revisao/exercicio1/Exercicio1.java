package revisao.exercicio1;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite sua idade: ");
        while(!sc.hasNextInt()){
            System.out.println("Erro! Sua idade deve ser um número inteiro.");
            System.out.print("Digite sua idade novamente: ");
            sc.next();
        }
        int idade = sc.nextInt();
        while(idade < 0 ){
            System.out.println("Erro! A sua idade não pode ser negativa");
            System.out.print("Digite sua idade novamente: ");
            while(!sc.hasNextInt()){
                System.out.println("Erro! Sua idade deve ser um número inteiro.");
                System.out.print("Digite sua idade novamente: ");
                sc.next();
            }
            idade = sc.nextInt();
        }
        System.out.print("Digite seu salário: ");
        double salario = sc.nextDouble();
        while(salario < 0){
            System.out.println("Erro! Seu salario não pode ser negativo");
            System.out.print("Digite seu salario novamente: ");
            salario = sc.nextDouble();
        }
        String maioridade;

        if(idade >= 18){
            maioridade = "Maior de idade";
        } else {
            maioridade = "Menor de idade";
        }

        String faixa;
        double salarioAnual = salario * 12;
        if(salarioAnual <= 30000){
            faixa = "Baixo";
        } else if (salarioAnual <= 60000 ){
            faixa = "Médio";
        } else {
            faixa = "Alto";
        }


        boolean run = true;

        while(run){
            System.out.println("--------------------------------------------------");
            System.out.println("O que deseja fazer?");
            System.out.println("--------------------------------------------------");
            System.out.println("1 - Mostrar dados");
            System.out.println("2 - Calcular salário anual");
            System.out.println("3 - Sair");
            System.out.println("--------------------------------------------------");
            int op = sc.nextInt();

            switch(op){
                case 1:
                    System.out.println("Nome: " + nome);
                    System.out.println("Idade: " + idade);
                    System.out.println(maioridade);
                    System.out.println("Salário: R$ " + salario);
                    break;

                case 2:

                    System.out.println("Salario anual: R$ " + salarioAnual );
                    System.out.println("Faixa Salarial: Salário " + faixa);
                    break;

                case 3:
                    System.out.println("Encerrando...");
                    run = false;
                    break;

                default:
                    System.out.println("Valor inválido");

                }

        }



    }
}
