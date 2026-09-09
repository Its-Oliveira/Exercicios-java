package ExerciciosMaratonaJava.Intermediario.exercicio28;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        AnalisaMatriz analiseMatriz = new AnalisaMatriz();
        Scanner sc = new Scanner(System.in);

        int linhas = 0;
        int colunas = 0;
        boolean validation = false;

        while (!validation){
            System.out.print("Digite a quantidade de linhas da matriz: ");
            linhas = sc.nextInt();
            validation = analiseMatriz.verificarValor(linhas);
        }

        validation = false;
        while(!validation){
            System.out.print("Digite a quantidade de colunas da matriz: ");
            colunas = sc.nextInt();
            validation = analiseMatriz.verificarValor(colunas);
        }

        int[][] matriz = new int[linhas][colunas];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length ; j++) {
                matriz[i][j] = 1;
            }
        }

        analiseMatriz.imprimirMatriz(matriz);
        System.out.println("--------------------------------------------------");
        System.out.println("Soma de todos os elementos: " + analiseMatriz.somaTodaMatriz(matriz));
        System.out.println("Maior valor da matriz: " + analiseMatriz.maiorValor(matriz));
        System.out.println("Soma da diagonal principal da matriz: " + analiseMatriz.diagonalPrincipal(matriz));

        sc.close();
    }
}
