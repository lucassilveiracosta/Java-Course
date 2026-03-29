package POO.Enumss.Exercicio1;

import POO.Enumss.Exercicio1.Entities.Enums.WorkerLevel;
import POO.Enumss.Exercicio1.Entities.HourContract;
import POO.Enumss.Exercicio1.Entities.Worker;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter department's name: ");
        String depName = sc.next();

        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String name = sc.next();
        System.out.print("Level: ");
        String level = sc.next();
        WorkerLevel.valueOf(level);
        System.out.print("Base salary: ");
        double bSalary = sc.nextInt();

        Worker worker = new Worker(name, WorkerLevel.valueOf(level), bSalary, depName);

        System.out.print("How many contracts to this worker: ");
        int n = sc.nextInt();

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter contract #%d data: \n", i);
            System.out.print("Date (DD/MM/YYYY): ");
            String date = sc.next();
            LocalDate dataTrans = LocalDate.parse(date, fmt1);
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int duration = sc.nextInt();

            HourContract contract = new HourContract(dataTrans, valuePerHour, duration);

            worker.addContract(contract);
        }

        System.out.print("Enter the month and the year to calculate the income (MM/yyyy): ");
        String stringDateIncome = sc.next();
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("MM/yyyy");
        YearMonth dateIncome = YearMonth.parse(stringDateIncome, fmt2);
        System.out.print("Name: ");
        String nameIncome = sc.next();
        System.out.print("Department: ");
        String departmentIncome = sc.next();

        int monthIncome = dateIncome.getMonthValue();
        int yearIncome = dateIncome.getYear();

        double total = worker.income(yearIncome, monthIncome);

        System.out.println("Income for " + dateIncome.format(fmt2) + ": " + total);



    sc.close();
    }
}
