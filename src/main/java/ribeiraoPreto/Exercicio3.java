package ribeiraoPreto;

//Descubra a lógica e complete o próximo elemento:

//    a) 1, 3, 5, 7, ___
//    b) 2, 4, 8, 16, 32, 64, ____
//    c) 0, 1, 4, 9, 16, 25, 36, ____
//    d) 4, 16, 36, 64, ____
//    e) 1, 1, 2, 3, 5, 8, ____
//    f) 2,10, 12, 16, 17, 18, 19, ____

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual logica deseja olhar ?");
        String opcao = scanner.next();

        switch (opcao) {

            case "a":
                //    a) 1, 3, 5, 7, ___
                int a = 1;
                System.out.printf("a) ");

                while (a < 20) {

                    System.out.printf(a + ", ");
                    a += 2;
                }

            case "b":
                //    b) 2, 4, 8, 16, 32, 64, ____
                int b = 2;
                System.out.printf("b) ");

                while (b < 100) {

                    System.out.printf(b + ", ");
                    b += b;
                }

            case "c":
                //    c)0, 1, 4, 9, 16, 25, 36, ____
                int c = 0;
                int valorImpar = 1;
                System.out.printf("c) ");

                while (c < 100) {
                    System.out.printf(c + ", ");
                    c = (c + valorImpar);
                    valorImpar += 2;
                }

            case "d":
                //    d) 4, 16, 36, 64, ____
                int d = 2;
                int armazenaValor = 0;
                System.out.printf("d) ");

                while (armazenaValor <= 100) {
                    System.out.printf(armazenaValor + ", ");
                    armazenaValor = d * d;
                    d = d + 2;
                }

            case "e":
                //    e) 1, 1, 2, 3, 5, 8, ____
                int e = 1, value1 = 1, value2 = 1;

                System.out.printf("e) ");
                System.out.print(" " + value1 + "--" + value2);

                while (e < 10) {

                    int calcNumbers = value1 + value2;
                    System.out.print("--" + calcNumbers);

                    value1 = value2;
                    value2 = calcNumbers;

                    e++;

                }

            case "f":
                //    f) 2,10, 12, 16, 17, 18, 19, ____
                System.out.println("2,10, 12, 16, 17, 18, 19, ____");

                //Escrever o numero por extenso para que assim possa ser feito a verificação
                System.out.println("Qual proximo numero da sequencia ?");
                int f = scanner.nextInt();

                while (f != 200 ) {

                    System.out.print("Numero informado não pertence a sequencia");

                    System.out.println("\nTente Novamente");
                    f = scanner.nextInt();
                }

                System.out.println("Isso ai proximo numero é: Duzentos");

                System.out.println("2,10, 12, 16, 17, 18, 19, 200");


                scanner.close();
        }
    }
}
