package POO.Lista.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import POO.Lista.exercises.entities.Employee;

public class ex1 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list;
        list = new ArrayList<Employee>();

        System.out.print("How many employees will be registered: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            System.out.printf("\nEmployee #%d\n", i + 1);

            System.out.print("Id: ");
            int id = sc.nextInt();
            
            System.out.print("Name: ");
            String name = sc.next();
            
            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            Employee employee = new Employee(id, name, salary);

            list.add(employee);
        }

        /*for(Employee x: list) {
            System.out.println(x.getId());   TEST
        }*/

        System.out.print("\n\nEnter the employee ID that will have the salary increase: ");
        int idSalaryIncrease = sc.nextInt();

        System.out.print("Enter the percentage: ");
        double percentageSalaryIncrease = sc.nextDouble();


        for(Employee x: list) {
            if(x.getId() == idSalaryIncrease) {
                x.salaryRaise(x.getSalary(), percentageSalaryIncrease, x);
            }
        }

        System.out.println("\n");

        for(Employee x: list) {
            System.out.printf("%d | %s | $ %.2f\n", x.getId(), x.getName(), x.getSalary());
        }
        sc.close();
    }
}
