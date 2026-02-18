package exercises;

import java.util.Locale;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int work_id, hours;
        double salPerHour;

        System.out.printf("Type your work id\n> ");
        work_id = sc.nextInt();
        System.out.printf("Type how many hours you have worked\n> ");
        hours = sc.nextInt();
        System.out.printf("Type your salary per hour\n> ");
        salPerHour = sc.nextDouble();

        double money = salPerHour * hours;

        System.out.printf("\n\nEmployee id - [%d]\n", work_id);
        System.out.printf("You raised U$ %.2f", money);

        sc.close();
    }
}
