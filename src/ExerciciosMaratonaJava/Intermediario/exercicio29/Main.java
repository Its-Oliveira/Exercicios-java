package ExerciciosMaratonaJava.Intermediario.exercicio29;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Calculadora calculadora = new Calculadora();
        Scanner sc = new Scanner(System.in);
        boolean validationArrayLength = false;
        int tamanho = 0;

        while (!validationArrayLength){
            System.out.printf("Digite o tamanho do array: ");
            tamanho = sc.nextInt();
            validationArrayLength = calculadora.validation(tamanho);
        }

        double [] numeros = new double[tamanho];
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Digite o " + (i+1) + "° numero: ");
            numeros[i] = sc.nextDouble();
        }

        System.out.println("A soma dos números é " + calculadora.somar(numeros));
        System.out.println("O maior número é " + calculadora.maior(numeros));
        System.out.println("O menor número é " + calculadora.menor(numeros));
        System.out.println("A média dos números é " + calculadora.media(numeros));

        sc.close();
    }
}
