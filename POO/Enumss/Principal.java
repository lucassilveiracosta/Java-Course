package POO.Enumss;

import POO.Enumss.Order.Order;
import POO.Enumss.entitiesEnums.OrderStatus;

import java.util.Date;

public class Principal {

    public static void main(String[] args) {

        Order order = new Order(2345, new Date() , OrderStatus.PROCESSING);

        System.out.println(order.toString());
    }
}
