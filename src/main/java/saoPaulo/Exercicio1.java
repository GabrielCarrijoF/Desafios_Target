package saoPaulo;

public class Exercicio1 {

    public static void main(String[] args) {

        int indice = 13, soma = 0, k = 0;

        while (k < indice) {
            k = k + 1;
            soma = soma + k;
        }
        System.out.println("Valor da variável soma será igual a: " + soma);
    }
}