package POO.Classe.entities;

import java.util.Scanner;

public class Product {
    
    public String name;
    public double price;
    public int quantity;
    private Scanner sc;

    public Product(Scanner scanner) {
        this.sc = scanner;
    }


    public void showProduct() {
        System.out.println("Name: " + name);
        System.out.printf("Price: " + price);
        System.out.println("\nQuantitiy: " + quantity);
    }

    public void addProduct() {
        System.out.printf("Enter the product name\n> ");
        String saux = sc.next();

        int qaux = 0;
        if((saux.toLowerCase()).equals(name.toLowerCase())) {
            System.out.printf("\nHow many products do yout want to add?\n> ");
            qaux = sc.nextInt();

            quantity += qaux;

            if(qaux != 0) {
                showProduct();
            } 
        }
        else {
            System.out.println("\nDoesn't exists any products with this name.");
        }
    }

    public void removeProduct() {
        System.out.printf("Enter the product name\n> ");
        String saux = sc.next();

        int qaux = 0;
        if((saux.toLowerCase()).equals(name.toLowerCase())) {
            System.out.printf("\nHow many products do yout want to remove?\n> ");
            qaux = sc.nextInt();

            quantity -= qaux;

            if(qaux != 0) {
                showProduct();
            } 
        }
        else {
            System.out.println("\nDoesn't exists any products with this name.");
        }
    }
}
