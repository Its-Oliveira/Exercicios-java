package ExerciciosMaratonaJava.Intermediario.Exercicio25;

public class Main {
    public static void main(String[]args){
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Caio";
        pessoa.idade = 20;

        System.out.println("Nome: " + pessoa.nome + " | Idade: " + pessoa.idade);
        pessoa.alteraAtributo(pessoa);
        System.out.println("Nome: " + pessoa.nome + " | Idade: " + pessoa.idade);

    }
}
