package ExerciciosMaratonaJava.Intermediario.exercicio27;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        AnalisadorNotas analisador = new AnalisadorNotas();
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[3];

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota " + (i+1) + ": ");
            notas[i] = sc.nextDouble();
        }

        System.out.println("Média: " + analisador.calcularMedia(notas));
        System.out.println("Maior nota: " + analisador.maiorNota(notas));
        System.out.println("Menor nota: " + analisador.menorNota(notas));

        sc.close();
    }
}
