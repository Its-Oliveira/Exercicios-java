package ExerciciosMaratonaJava.Intermediario.Exercicio21;

public class Carro {
    public String modelo;
    public double combustivelDisponivel;
    public double consumo;

    public void verificarViagem(double distancia) {
        if (distancia <= 0 || consumo <= 0){
            System.out.println("__________________________________________________________________________________");
            System.out.println("Erro! Valor inválido");
            System.out.println("__________________________________________________________________________________");
            return;
        }
        if (distancia / consumo <= combustivelDisponivel) {
            System.out.println("__________________________________________________________________________________");
            System.out.println("Viagem possível");
            System.out.println("__________________________________________________________________________________");

            System.out.println("Distancia percorrida: " + distancia + " KM \nConsumo do carro: " + consumo + " KM/L \nCombustivel antes da viagem: " + combustivelDisponivel + " L \nConsumo necessário: " + distancia/consumo + " L");
            combustivelDisponivel -= (distancia/consumo);
            System.out.println("Combustível após a viagem: " + combustivelDisponivel + " L");
            System.out.println("__________________________________________________________________________________");
        } else {
            System.out.println("__________________________________________________________________________________");
            System.out.println("Combustivel insuficiente! \nTotal necessário: " + distancia/consumo + " L");
            System.out.println("__________________________________________________________________________________");
        }
    }
}
