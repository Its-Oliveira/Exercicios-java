package ExerciciosMaratonaJava.Intermediario.exercicio26;

public class Produto {
    public String nome;
    public int quantidade;
    public double preco;

    public void analisarProdutos(Produto produto1, Produto produto2){
        Produto maiorQuant;
        Produto maiorPreco;
        if (produto1.quantidade > produto2.quantidade){
            maiorQuant = produto1;
        } else {
            maiorQuant = produto2;
        }

        if (produto1.preco > produto2.preco){
            maiorPreco = produto1;
        } else {
            maiorPreco = produto2;
        }
        System.out.println("-------------------------------------");
        System.out.println("Produto com maior quantidade em estoque:\nNome: " + maiorQuant.nome + "\nQuantidade: " + maiorQuant.quantidade);
        System.out.println("-------------------------------------");
        System.out.println("Produto com maior preço: \nNome: " + maiorPreco.nome + "\nPreço: " + maiorPreco.preco);

    }

}
