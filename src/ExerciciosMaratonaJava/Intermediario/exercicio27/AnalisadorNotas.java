package ExerciciosMaratonaJava.Intermediario.exercicio27;

public class AnalisadorNotas {

    public double calcularMedia(double[] notas){
        double media = 0;
        for(double nota : notas){
            media += nota;
        }
        return media /= notas.length;
    }

    public double maiorNota(double[] notas){
        double maior = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > maior){
                maior = notas[i];
            }
        }
        return maior;
    }

    public double menorNota(double[] notas){
        double menor = 10;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < menor){
                menor = notas[i];
            }
        }
        return menor;
    }

}
