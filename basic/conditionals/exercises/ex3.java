package basic.conditionals.exercises;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num1, num2, aux;

        System.out.printf("Digite números inteiros na flecha\n> ");
        num1 = sc.nextInt();
        System.out.printf("\n> ");
        num2 = sc.nextInt();

        if(num1 < num2) {
            aux = num1;
            num1 = num2;        // Garantir que num1 seja maior que num2
            num2 = aux;
        }

        if(num1 % num2 == 0) {
            System.out.println("\n São multiplos");
        }
        else {
            System.out.println("\n Não são multiplos");
        }

        sc.close();
    }
}
