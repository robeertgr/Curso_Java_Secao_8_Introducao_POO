package application;

import entities.Triangle;

import java.util.Scanner;

public class Problema_Sem_POO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();


        System.out.println("Insira as medidas do triângulo X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Insira as medidas do triângulo Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Area do triângulo X: %.4f\n", areaX);
        System.out.printf("Area do triângulo Y: %.4f\n", areaY);

        if (areaX > areaY){
            System.out.println("Maior área: X");
        } else {
            System.out.println("Maior área: Y");
        }

        sc.close();
    }
}
