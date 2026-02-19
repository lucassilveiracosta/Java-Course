package basic.conditionals.exercises;

import java.util.Scanner;

public class ex2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.printf("Digite um número inteiro\n> ");
        num = sc.nextInt();

        if(num % 2 == 0) { 
            System.out.println("\nSeu número é par");
        }
        else {
            System.out.println("\nSeu número é ímpar");
        }

        sc.close();
    }
}
