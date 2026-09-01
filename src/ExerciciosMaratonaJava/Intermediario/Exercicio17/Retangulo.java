package ExerciciosMaratonaJava.Intermediario.Exercicio17;

public class Retangulo {
    double altura;
    double largura;

    public double area(){
        return this.altura * this.largura;
    }

    public double perimetro(){
        return (this.altura * 2) + (this.largura * 2);
    }

    public void imprime(){
        System.out.println("Perimetro: " + this.perimetro());
        System.out.println("Área: " + this.area());
    }
}
