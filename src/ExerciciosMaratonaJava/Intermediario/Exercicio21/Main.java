package ExerciciosMaratonaJava.Intermediario.Exercicio21;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        Carro carro = new Carro();

        System.out.print("Digite o modelo do carro: ");
        carro.modelo = scan.nextLine();
        System.out.print("Digite o combustível disponivel: ");
        carro.combustivelDisponivel = scan.nextDouble();
        System.out.print("Digite o consumo do carro: ");
        carro.consumo = scan.nextDouble();

        System.out.print("Qual distancia o carro irá percorrer: ");
        double distancia = scan.nextDouble();
        carro.verificarViagem(distancia);

        scan.close();
    }
}
