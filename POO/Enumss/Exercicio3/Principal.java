package POO.Enumss.Exercicio3;

import POO.Enumss.Exercicio3.Entities.Client;
import POO.Enumss.Exercicio3.Entities.Order;
import POO.Enumss.Exercicio3.Entities.OrderItem;
import POO.Enumss.Exercicio3.Entities.Product;
import POO.Enumss.entitiesEnums.OrderStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
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

        sc.nextLine();

        System.out.print("Email: ");
        String email = sc.next();

        System.out.print("Birth date (DD/MM/YYYY): ");
        String birthDateString = sc.next();
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate birthDateLocalDate = LocalDate.parse(birthDateString, fmt1);

        Client client = new Client(name, email, birthDateLocalDate);

        System.out.println();

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        String statusString = sc.next().toUpperCase();
        OrderStatus statusTransformed = OrderStatus.valueOf(statusString);

        System.out.print("How many times to this order? ");
        int manyOrders = sc.nextInt();

        Product[] products = new Product[manyOrders];

        Order order = new Order(client, POO.Enumss.Exercicio3.Entities.OrderStatus.OrderStatus.PROCESSING, LocalDateTime.now());


        for (int i = 0; i < manyOrders; i++) {
            System.out.println("Enter #" + ( i + 1 )+ " item data: ");
            System.out.print("Product name: ");
            String productName = sc.next();

            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();

            products[i] = new Product(productName, productPrice);

            System.out.print("Quantity: ");
            int productQuantity = sc.nextInt();

            OrderItem orderItem = new OrderItem(productQuantity, products[i].getPrice() * productQuantity, products[i]);

            order.addItem(orderItem);
        }

        System.out.println("\n\nSummary: ");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println("Order moment: " + order.getMoment().format(fmt2));
        System.out.println("Order status: " + order.getStatus());
        System.out.println("Client: " + order.getClient().getName() + " (" + order.getClient().getBirthDate() + ")  - " + order.getClient().getEmail());
        System.out.println("Order items: ");
        order.printJsonFormatOrderItems();

    }
}
