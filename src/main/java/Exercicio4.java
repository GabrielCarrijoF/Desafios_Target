import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

//    Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado:
//
//    SP – R$67.836,43
//    RJ – R$36.678,66
//    MG – R$29.229,88
//    ES – R$27.165,48
//    Outros – R$19.849,53
//
//    Escreva um programa na linguagem que desejar onde calcule o percentual de representação que cada estado teve dentro do valor total mensal da distribuidora.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        double vetor[] = new double[5], total = 0, vetorPorc[] = new double[5];

        System.out.println("Informe os valores de faturamento mensal da distribuidora: ");
        System.out.println("Inserção sera por estado, na ordem a baixo respectivamente");
        System.out.println("------------------");
        System.out.println("        SP        ");
        System.out.println("        RJ        ");
        System.out.println("        MG        ");
        System.out.println("        ES        ");
        System.out.println("      Outros      ");
        System.out.println("------------------");

        // Apenas lembrando segui padrao informado: R$67.836,43 para informar os valores
        for (int i = 0; i < 5; i++) {
            System.out.printf("R$ ");
            vetor[i] = scanner.nextDouble();

            total += vetor[i];
        }

        for (int i = 0; i < 5; i++) {
            vetorPorc[i] = (vetor[i] / total) * 100;
        }

        System.out.printf("\n         Resultados Sugundo Valores Informados          ");

        System.out.println("\n\nTotal do faturamento Mensal: " + numberFormat.format(total));
        System.out.println("O percentual de faturamento de SP é: " + numberFormat.format(vetorPorc[0]) + "%");
        System.out.println("O percentual de faturamento de RJ é: " + numberFormat.format(vetorPorc[1]) + "%");
        System.out.println("O percentual de faturamento de MG é: " + numberFormat.format(vetorPorc[2]) + "%");
        System.out.println("O percentual de faturamento de ES é: " + numberFormat.format(vetorPorc[3]) + "%");
        System.out.println("O percentual de faturamento de Outros é: " + numberFormat.format(vetorPorc[4]) + "%");


        scanner.close();
    }
}
