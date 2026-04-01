package POO.Enumss.Exercicio3.Entities;

import POO.Enumss.Exercicio3.Entities.OrderStatus.OrderStatus;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private LocalDateTime moment;
    private OrderStatus status;

    private Client client;

    private List<OrderItem> items = new ArrayList<>();

    public void addItem(OrderItem orderItem) {
        items.add(orderItem);
    }

    public void removeItem(OrderItem orderItem) {
        items.remove(orderItem);
    }

    public void printJsonFormatOrderItems() {
        for(OrderItem x: this.items) {
            System.out.println("{");
            System.out.println("  'Name': " + x.getProdutc().getName());
            System.out.println("  'Price': " + x.getProdutc().getPrice());
            System.out.println("  'Quantity': " + x.getQuantity());
            System.out.println("  'TotalPrice': " + x.getPrice());
            System.out.println("}\n");
        }
        System.out.println("Total Price: " + this.total());
    }

    public Double total() {
        double sumPrices = 0;
        for(OrderItem x: items) {
            sumPrices += x.getPrice();
        }

        return sumPrices;
    }

    public Order(LocalDateTime moment, OrderStatus status) {
        this.moment = moment;
        this.status = status;
    }

    public Order(Client client, OrderStatus status, LocalDateTime moment) {
        this.client = client;
        this.status = status;
        this.moment = moment;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
