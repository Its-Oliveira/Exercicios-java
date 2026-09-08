package ExerciciosMaratonaJava.Intermediario.Exercicio25;

public class Pessoa {
    public String nome;
    public int idade;

    public void alteraAtributo(Pessoa pessoa){
        pessoa.nome = "ND";
        pessoa.idade = 69;
        System.out.println("Nome: " + pessoa.nome + " | Idade: " + pessoa.idade);
    }
}
