package basic.conditionals.exercises;

import java.util.Locale;
import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double num;

        System.out.printf("Digite um número\n> ");
        num = sc.nextDouble();

        if(num >= 0 && num <= 25) {
            System.out.println("Esse número pertence a esse intervalo [0 , 25]");
        }
        else if(num > 25 && num <= 50) {
            System.out.println("Esse número pertence a esse intervalo ]25 , 50]");
        }
        else if(num > 50 && num <= 75) {
            System.out.println("Esse número pertence a esse intervalo ]50 ,  75]");
        }
        else if(num > 75 && num <= 100) {
            System.out.println("Esse número pertence a esse intervalo ]75 , 100]");
        }
        else {
            System.out.println("Esse número não esta entre [0, 100]");
        }

        sc.close();
    }
}