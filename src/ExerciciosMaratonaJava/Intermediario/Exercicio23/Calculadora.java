package ExerciciosMaratonaJava.Intermediario.Exercicio23;

public class Calculadora {

    public double somar(double num1, double num2) {
        return num1 + num2;
    }

    public double subtracao(double num1, double num2) {
        return num1 - num2;
    }

    public double multiplicacao(double num1, double num2) {
        return num1 * num2;
    }

    public void divisao(double num1, double num2) {
        if (num2 == 0){
            System.out.println("Erro! Não é possível dividir por 0");
            return;
        }
        System.out.println("A divisão de " + num1 + " / " + num2 + " é " + (num1 / num2));
    }
}
