import java.util.Scanner;

public class Exercicio2 {

//    Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores
//    (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número,
//    ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.

//    IMPORTANTE:
//    Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int valor1 = 0, valor2 = 1, count = 2, verificaIgual = 0;

        System.out.println("Quantas vezes deseja repetir a sequencia ?");
        int quantidadeDaSequencia = scanner.nextInt();

        while (quantidadeDaSequencia == 0 || quantidadeDaSequencia == 1) {

            System.out.println("Numero informado invalido!! Digite outro valor: ");
            quantidadeDaSequencia = scanner.nextInt();
        }

        System.out.print("\n" + valor1 + "--" + valor2);

        while (count < quantidadeDaSequencia) {

            int calcNumbers = valor1 + valor2;
            System.out.print("--" + calcNumbers);

            valor1 = valor2;
            valor2 = calcNumbers;

            count++;

            if (calcNumbers == quantidadeDaSequencia) {
                verificaIgual = quantidadeDaSequencia;
            }

        }

        if (verificaIgual != 0) {
            System.out.println("\n\nNúmero informado pertence a sequencia");
        } else {
            System.out.println("\n\nNúmero informado não pertence a sequencia");
        }

        scanner.close();
    }
}
