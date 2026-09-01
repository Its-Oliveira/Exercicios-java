package ExerciciosMaratonaJava.Intermediario.Exercicio18;

public class Funcionario {
    String nome;
    double salario;
    int idade;

    public double calcularSalarioAnual(){
        return this.salario * 12;
    }

    public double aplicarAumentoPercentual(double porcent){
        return salario + (salario * porcent);
    }

    public void imprimirSalarioAnual(){
        System.out.println("O salário anual do funcionário é de R$ " + calcularSalarioAnual());
    }

    public void imprimirAumentoPercentual(double porcentagem){
        System.out.println("O salário do funcionário com aumento percentual é de " + aplicarAumentoPercentual(porcentagem));
    }
}
