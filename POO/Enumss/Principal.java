package POO.Enumss;

import POO.Enumss.Order.Order;
import POO.Enumss.entitiesEnums.OrderStatus;

import java.util.Date;

public class Principal {

    public static void main(String[] args) {

        Order order = new Order(2345, new Date() , OrderStatus.PROCESSING);

        System.out.println(order.toString());

        OrderStatus os = OrderStatus.valueOf("PROCESSING"); // passando de string para um valor existente no enum

        Order order1 = new Order(9090, new Date(), os);

        System.out.println(order1.toString());
    }
}
