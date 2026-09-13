package ExerciciosMaratonaJava.Intermediario.exercicio30;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Aluno aluno = new Aluno();
        Scanner sc = new Scanner(System.in);
        double nota;
        int tamanho = 0;

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        boolean validation = false;
        while (!validation){
            System.out.print("Digite a quantidade de notas que irá inserir: ");
            tamanho = sc.nextInt();
            validation = aluno.validarQtd(tamanho);
        }

        double [] notas = new double[tamanho];

        for (int i = 0; i < notas.length; i++) {
            validation = false;
            while(!validation){
                System.out.print("Digite sua nota " + (i+1) + ":");
                nota = sc.nextDouble();
                validation = aluno.validarNota(nota,i, notas);
            }
        }

        aluno.calcularMedia(nome,notas);

        sc.close();


    }
}
