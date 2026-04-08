package POO.Heranca.Atv1;

import POO.Heranca.Atv1.Entities.Employee;
import POO.Heranca.Atv1.Entities.OutsourcedEmployee;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor para n: ");
        int n = sc.nextInt();

        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter #"  + (i + 1) + " data: ");
            System.out.print("Outsourced (y/n): ");
            char YOrN = sc.next().toLowerCase().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            if (YOrN == 'y') {
                System.out.print("Additional charge: ");
                double addCharge = sc.nextDouble();

                employees[i] = new OutsourcedEmployee(name, hours, valuePerHour, addCharge);
            }
            else {
                employees[i] = new Employee(name, hours, valuePerHour);
            }
        }

        for (Employee x: employees) {
            x.printPayments();
        }


    }
}
