package POO.Classe.exercises;

import java.util.Locale;
import java.util.Scanner;
import POO.Classe.exercises.entities.Employee;

public class ex2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee user;
        user = new Employee();
        
        System.out.printf("Name: ");
        user.name = sc.next();
        System.out.printf("Salary: ");
        user.salary = sc.nextDouble();
        System.out.printf("Tax: ");
        user.tax = sc.nextDouble();

        System.out.printf("\nEmployee: %s, $ %.2f\n", user.name, user.netSalary());
        System.out.printf("\nWhich percentage to increase the salary(type normally without the symbol ): ");
        double percentage = sc.nextDouble() / 100;
        System.out.printf("\nUpdated data: $ %.2f", user.increaseSalary(percentage));


        sc.close();
    }
}
