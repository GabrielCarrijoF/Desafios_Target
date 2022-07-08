package saoPaulo;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual mensagem que deseja inverter ?");
        String palavra = scanner.next();

        String inverte = " ";

        for (int i = palavra.length() - 1; i >= 0; i--) {

            inverte = inverte + palavra.charAt(i);
        }

        System.out.println("---------------------");
        System.out.println("Resultado: " + inverte);
        System.out.println("---------------------");

        scanner.close();
    }
}

