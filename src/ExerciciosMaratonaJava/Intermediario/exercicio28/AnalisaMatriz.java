package ExerciciosMaratonaJava.Intermediario.exercicio28;

public class AnalisaMatriz {


    public boolean verificarValor(int valor){
        if (valor <= 0){
            System.out.println("Erro! Matriz não pode ter tamanho negativo");
            return false;
        }
        return true;
    }

    public void imprimirMatriz(int matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int somaTodaMatriz(int matriz[][]){
        int soma = 0;
        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                soma += matriz[i][j];
            }
        }
        return soma;
    }

    public int maiorValor(int matriz[][]){
        int maior = matriz[0][0];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j] > maior){
                    maior = matriz[i][j];
                }
            }
        }
        return maior;
    }

    public int diagonalPrincipal(int matriz[][]){
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length ; j++) {
                if (i==j){
                    soma += matriz[i][j];
                }
            }
        }
        return soma;
    }

}
