package application;

import entities.Circunferencia_Volume;

import java.util.Locale;
import java.util.Scanner;

public class Main_Circunferencia_Volume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Informe o raio: ");
        double raio = sc.nextDouble();

        double c = Circunferencia_Volume.circunferencia(raio);
        double v = Circunferencia_Volume.volume(raio);

        System.out.printf("Circunferencia: %.2f\n", c);
        System.out.printf("Volume: %.2f\n", v);
        System.out.printf("PI: %.2f", Circunferencia_Volume.PI);

        sc.close();
    }
}
