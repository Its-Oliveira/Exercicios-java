package ExerciciosMaratonaJava.Intermediario.exercicio29;

public class Calculadora {

    public double somar(double ... numeros){
        double soma = 0;
        for(double num : numeros){
            soma += num;
        }
        return soma;
    }

    public double maior(double... numeros){
        double maior = numeros[0];
        for(double num : numeros){
            if(num > maior){
                maior = num;
            }
        }
        return maior;
    }

    public double menor(double... numeros){
        double menor = numeros[0];
        for(double num : numeros){
            if(num < menor){
                menor = num;
            }
        }
        return menor;
    }

    public double media(double... numeros){
        double media = 0;
        for(double num : numeros){
            media += num;
        }
        media /= numeros.length;
        return media;
    }

    public boolean validation(int tamanho){
        if (tamanho <= 0){
            System.out.println("Tamanho inválido");
            return false;
        }
        return true;


    }
}
