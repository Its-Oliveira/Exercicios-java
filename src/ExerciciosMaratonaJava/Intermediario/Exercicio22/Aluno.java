package ExerciciosMaratonaJava.Intermediario.Exercicio22;

public class Aluno {
    public String nome;
    public double[] notas = new double[3];
    public double media = 0;

    public boolean verificaNota(double nota, int posicao){
        if (nota >= 0 && nota <= 10){
            notas[posicao] = nota;
            return true;
        } else {
            System.out.println("Valor inválido");
            return false;
        }
    }

    public double calcularMedia(){
        media = 0;
         for (double nota : this.notas){
             this.media += nota;
         }
         media /= notas.length;
         return media;
    }

    public String verificarAprovacao(){
        if (media >= 6){
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    public void imprimirRelatorio(){
        System.out.println("--------------------------------");
        System.out.println("Nome do aluno: " + this.nome);
        System.out.println("--------------------------------");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i+1) + ": " + notas[i]);
        }
        System.out.println("--------------------------------");
        System.out.println("Média: " + calcularMedia());
        System.out.println("Status do aluno: " + verificarAprovacao());
        System.out.println("--------------------------------");
    }
}
