package ExerciciosMaratonaJava.Intermediario.Exercicio19;

public class ContaBancaria {
    String titular;
    double saldo;

    public void depositar(double deposito) {
        if (deposito > 0){
            this.saldo += deposito;
        } else {
            System.out.println("Erro! Valor inválido.");
        }
    }

    public void sacar(double valor) {
        if (saldo - valor < 0) {
            System.out.println("Erro! Não é possível deixar saldo negativo.");
        } else if (valor > 0){
            this.saldo -= valor;
        } else {
            System.out.println("Erro! Valor inválido");
        }
    }

    public void exibirSaldo() {
        System.out.println("Seu saldo é de R$ " + this.saldo);
    }
}
