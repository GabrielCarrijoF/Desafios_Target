import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

//  Dado um vetor que guarda o valor de faturamento diário de uma distribuidora, faça um programa, na linguagem que desejar, que calcule e retorne:
//  1 O menor valor de faturamento ocorrido em um dia do mês;
//	2 O maior valor de faturamento ocorrido em um dia do mês;
//	3 Número de dias no mês em que o valor de faturamento diário foi superior à média mensal.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Qual mês que deseja guardar as informações: ");
        String mes = scanner.next();

        System.out.println("Quantos dias tem o mês informado: ");
        int dias = scanner.nextInt();

        double vetor[] = new double[dias];

        for (int i = 0; i < dias; i++) {
            System.out.printf("Informe valor do %2d dia de faturamento do mês " + mes + " :", (i + 1), dias);
            vetor[i] = scanner. nextDouble();
        }


        double totalDeFaturamento = 0, menorValorDeFaturamento = vetor[0], maiorValorDeFaturamento = vetor[0];

        for (int i = 0; i < dias; i++) {

            totalDeFaturamento = totalDeFaturamento + vetor[i];

            if (vetor[i] == 0) {
                dias--;
            }

            if (vetor[i] < menorValorDeFaturamento) {
                menorValorDeFaturamento = vetor[i];
            }

            if (vetor[i] > maiorValorDeFaturamento) {
                maiorValorDeFaturamento = vetor[i];
            }
        }

        double media = totalDeFaturamento / dias;
        int superiorMedia = 0;

        for (int i = 0; i < dias; i++) {

            if (media > vetor[i]) {
                superiorMedia++;
            }
        }

        System.out.println("------------------------------------------------------------------");
        System.out.println("Valor de faturamento diário foi superior à média mensal: " + superiorMedia);
        System.out.println("\nO menor valor de faturamento ocorrido em um dia do mês: " + menorValorDeFaturamento);
        System.out.println("\nO maior valor de faturamento ocorrido em um dia do mês: " + maiorValorDeFaturamento);
        System.out.println("------------------------------------------------------------------");

    }
}
