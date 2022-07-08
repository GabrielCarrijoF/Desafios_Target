package ribeiraoPreto;

import java.util.Scanner;

public class Exercicio2 {

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

