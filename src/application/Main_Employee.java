package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Main_Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Employee employee = new Employee();

        System.out.println("Dados do funcionário:");
        System.out.print("Nome: ");
        employee.name = sc.nextLine();
        System.out.print("Salário bruto: ");
        employee.grossSalary = sc.nextDouble();
        System.out.print("Imposto: ");
        employee.tax = sc.nextDouble();

        System.out.println("\n" + employee);

        System.out.print("\nQual a porcentagem que deseja adicionar no salário? ");
        double imposto = sc.nextDouble();
        employee.increaseSalary(imposto);

        System.out.println("\nDados atualizados: " + employee);

        sc.close();
    }
}
