package ExerciciosMaratonaJava.Intermediario.exercicio30;

public class Aluno {
    public void calcularMedia(String nome, double... notas){
        double media = 0;
        for(double nota : notas){
            media += nota;
        }
        media /= notas.length;
        System.out.println("-------------------------------------------");
        System.out.println("Nome do aluno: " + nome + "\nMédia do aluno: " + media);
        if(media >= 6){
            System.out.println("Situação: Aprovado");
        } else {
            System.out.println("Situação: Reprovado");
        }
    }

    public boolean validarNota(double nota, int posicao, double [] notas){
        if(nota >= 0 && nota <= 10){
            notas[posicao] = nota;
            return true;
        } else {
            System.out.println("Valor inválido");
            return false;
        }
    }

    public boolean validarQtd(int qtd){
        if( qtd <= 0){
            System.out.println("Quantidade inválida");
            return false;
        } else {
            return true;
        }
    }
}
