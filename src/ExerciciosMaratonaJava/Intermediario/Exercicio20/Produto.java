package ExerciciosMaratonaJava.Intermediario.Exercicio20;

public class Produto {
    public String nome;
    public int quantidade;
    public double preco;

    public void adicionarEstoque(int qtd) {
        if (qtd <= 0){
            System.out.println("Erro! Valor inválido");
            return;
        }
        this.quantidade += qtd;
    }

    public void retirarEstoque(int qtd) {
        if (qtd <= 0){
            System.out.println("Erro! Valor inválido");
            return;
        }
        if (this.quantidade - qtd >= 0) {
            this.quantidade -= qtd;
            return;
        }
        System.out.println("Não é possível retirar mais itens do que tem no estoque");

    }

    public double calcularValorEstoque() {
        return this.quantidade * this.preco;
    }
}
