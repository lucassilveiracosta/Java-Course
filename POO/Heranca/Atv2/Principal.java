package POO.Heranca.Atv2;

import POO.Heranca.Atv2.Entities.ImportedProduct;
import POO.Heranca.Atv2.Entities.Product;
import POO.Heranca.Atv2.Entities.UsedProduct;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Principal {

    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        Product[] products = new Product[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Product #" + (i + 1) + " data: ");
            System.out.print("Common, used or imported (c/u/i)? ");
            char option = sc.next().toLowerCase().charAt(0);

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            switch (option) {
                case 'u':
                    System.out.print("Manufacture date (DD/MM/YYYY): ");
                    String dateString = sc.next();
                    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate date = LocalDate.parse(dateString, fmt);

                    products[i] = new UsedProduct(name, price, date);
                break;

                case 'i':
                    System.out.print("Customs fee: ");
                    double customsFee = sc.nextDouble();

                    products[i] = new ImportedProduct(name, price, customsFee);
                break;

                case 'c':
                    products[i] = new Product(name, price);
                break;

                default:
                    System.out.println("Esse digito não existe!");
                break;
            }
        }

        System.out.println("\nPrice tags: ");
        for (int i = 0; i < n; i++) {
            System.out.print(products[i].priceTag());
        }
    }
}
