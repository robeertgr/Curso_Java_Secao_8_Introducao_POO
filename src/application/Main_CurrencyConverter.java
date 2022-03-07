/*
    Faça um programa para ler a cotação do dólar e depois um valor em dólares a ser comprado por
    uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda
    que a pessoa terá que pagar uma taxa de 6% de IOF sobre o valor do dólar. Criar uma classe CurrencyConverter
    para ser responsável pelos cálculos.
*/

package application;

import util.CurrencyCoverter;

import java.util.Locale;
import java.util.Scanner;

public class Main_CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Qual o valor do dólar? ");
        double dollarPrice = sc.nextDouble();
        System.out.print("Quantos dólares deseja comprar? ");
        double amount = sc.nextDouble();

        double converter = CurrencyCoverter.converter(dollarPrice, amount);

        System.out.printf("Valor a ser pago em reais: %.2f", converter);

        sc.close();
    }
}
