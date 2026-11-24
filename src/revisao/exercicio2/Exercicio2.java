package revisao.exercicio2;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade de números que esse array terá: ");
        while(!sc.hasNextInt()){
            System.out.println("Erro! Você deve informar um número inteiro.");
            System.out.print("Digite a quantidade de números que esse array terá: ");
            sc.next();
        }
        int tamanho = sc.nextInt();
        double [] array = new double[tamanho];
        for(int i = 0; i < tamanho; i++) {
            System.out.print("Digite o " + (i+1) + " numero do array: ");
            array[i] = sc.nextDouble();
        }

        double soma = 0;
        int pares = 0;
        int impares = 0;
        for(double i: array){
            soma += i;
            if(i%2==0){
                pares +=1;
            } else {
                impares +=1;
            }
        }
        double media = soma/array.length;

        System.out.println("Soma: " + soma + "\nMédia: " + media + "\nNumeros pares: " + pares + "\nNumeros impares: " + impares);
    }
}
