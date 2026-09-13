package ExerciciosMaratonaJava.avancado.exercicio32;

public class Candidato {
    public int numero;
    public String nome;
    public int votos;

    public void imprimirVotos(){
        System.out.println("Numero de votos do canditado " + this.nome + ": " + this.votos);
    }

    public void calcularPorcentagem(int votosTotais){
        double porcentagem = (double) this.votos / votosTotais * 100;
        System.out.println("Porcentagem de votos do candidato " + this.nome + ": " + porcentagem);


    }

}
