package ExerciciosMaratonaJava.Intermediario.Exercicio22;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.print("Digite seu nome: ");
        aluno.nome = scan.nextLine();

        for (int i = 0; i < 3; i++) {
            boolean validation = false;
            while (validation == false){
                System.out.print("Digite sua nota " + (i + 1) + ": ");
                double nota = scan.nextDouble();
                validation = aluno.verificaNota(nota,i);
            }

        }
        aluno.imprimirRelatorio();

        scan.close();
    }
}
