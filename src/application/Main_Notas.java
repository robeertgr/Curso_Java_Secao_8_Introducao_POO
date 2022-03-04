package application;

import entities.Notas;

import java.util.Locale;
import java.util.Scanner;

public class Main_Notas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Notas notas = new Notas();

        System.out.print("Dados do aluno\nNome: ");
        notas.nome = sc.nextLine();
        System.out.print("Nota 1: ");
        notas.nota1 = sc.nextDouble();
        System.out.print("Nota 2: ");
        notas.nota2 = sc.nextDouble();
        System.out.print("Nota 3: ");
        notas.nota3 = sc.nextDouble();

        System.out.printf("Nota final: %.2f\n", notas.aprovacao());

        if (notas.aprovacao() < 60.0){
            System.out.println("Reprovado");
            System.out.printf("Faltou %.2f pontos \n", notas.notasFaltando());
        } else {
            System.out.println("Aprovado");
        }

        sc.close();
    }
}
