package ExerciciosMaratonaJava.avancado.exercicio32;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Candidato candidato1 = new Candidato();
        Candidato candidato2 = new Candidato();
        Candidato candidato3 = new Candidato();
        Candidato candidato4 = new Candidato();
        Candidato candidato5 = new Candidato();

        int totalVotos = 0;

        candidato1.nome = "Lula";
        candidato2.nome = "Renan Santos";
        candidato3.nome = "Caiado";
        candidato4.nome = "Flavio";
        candidato5.nome = "Cury";

        candidato1.numero = 13;
        candidato2.numero = 14;
        candidato3.numero = 55;
        candidato4.numero = 22;
        candidato5.numero = 70;

        boolean run = true;
        int op;
        while(run){
            System.out.println("---------------------------------");
            System.out.println("Digite em quem deseja votar: ");
            System.out.println("1 - " + candidato1.nome + ", " + candidato1.numero);
            System.out.println("2 - " + candidato2.nome + ", " + candidato2.numero);
            System.out.println("3 - " + candidato3.nome + ", " + candidato3.numero);
            System.out.println("4 - " + candidato4.nome + ", " + candidato4.numero);
            System.out.println("5 - " + candidato5.nome + ", " + candidato5.numero);
            System.out.println("0 - Sair");
            System.out.println("---------------------------------");
            op = sc.nextInt();
            switch (op){
                case 1:
                    candidato1.votos +=1;
                    totalVotos += 1;
                    break;

                case 2:
                    candidato2.votos +=1;
                    totalVotos += 1;
                    break;

                case 3:
                    candidato3.votos +=1;
                    totalVotos += 1;
                    break;

                case 4:
                    candidato4.votos +=1;
                    totalVotos += 1;
                    break;

                case 5:
                    candidato5.votos +=1;
                    totalVotos += 1;
                    break;

                case 0:
                    System.out.println("Adeus");
                    run = false;
                    break;

                default:
                    System.out.println("Valor inválido");
                    break;
            }
        }

        System.out.println("---------------------------------");
        candidato1.imprimirVotos();
        candidato2.imprimirVotos();
        candidato3.imprimirVotos();
        candidato4.imprimirVotos();
        candidato5.imprimirVotos();

        System.out.println("---------------------------------");
        System.out.println("Total de votos: " + totalVotos + " votos");

        System.out.println("---------------------------------");
        candidato1.calcularPorcentagem(totalVotos);
        candidato2.calcularPorcentagem(totalVotos);
        candidato3.calcularPorcentagem(totalVotos);
        candidato4.calcularPorcentagem(totalVotos);
        candidato5.calcularPorcentagem(totalVotos);
    }
}
