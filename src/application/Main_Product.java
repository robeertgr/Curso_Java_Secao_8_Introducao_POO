package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main_Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Product product = new Product();

        System.out.println("Insira os dados do produto: ");
        System.out.print("Nome: ");
        product.name = sc.nextLine();
        System.out.print("Preço: ");
        product.price = sc.nextDouble();
        System.out.print("Quantidade em estoque: ");
        product.quantity = sc.nextInt();

        System.out.println("\nDados do produto: " + product);

        System.out.print("\nInsira a quantidade de produtos a serem adicionados no estoque: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);  // faz a atualização dentro do object product

        System.out.println("\nDados atualizados: " + product);

        System.out.print("\nInsira a quantidade de produtos a serem removidos do estoque: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.print("\nDados atualizados: " + product);



        sc.close();
    }
}
