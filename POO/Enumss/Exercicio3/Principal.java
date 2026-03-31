package POO.Enumss.Exercicio3;

import POO.Enumss.Exercicio3.Entities.OrderItem;
import POO.Enumss.Exercicio3.Entities.Product;
import POO.Enumss.entitiesEnums.OrderStatus;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Principal {

    static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter client Data: ");

        System.out.print("Name: ");
        String name = sc.next();

        System.out.print("Email: ");
        String Email = sc.next();

        System.out.print("Birth date (DD/MM/YYYY): ");
        String birthDateString = sc.next();
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate birthDateLocalDate = LocalDate.parse(birthDateString, fmt1);

        System.out.println();

        System.out.println("Enter order data: ");
        String statusString = sc.next();
        OrderStatus statusTransformed = OrderStatus.valueOf(statusString);

        System.out.print("How many times to this order? ");
        int manyOrders = sc.nextInt();

        Product[] products = new Product[manyOrders];

        for (int i = 0; i < manyOrders; i++) {
            System.out.println("Enter #" + i + 1 + " item data: ");
            System.out.print("Product name: ");
            String productName = sc.next();

            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();

            products[i] = new Product(productName, productPrice);

            System.out.print("Quantity: ");
            int productQuantity = sc.nextInt();

            OrderItem orderItem = new OrderItem(productQuantity, products[i].getPrice() * productQuantity, products[i]);
            
        }
    }
}
