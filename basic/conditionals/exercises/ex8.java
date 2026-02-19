package basic.conditionals.exercises;

import java.util.Locale;
import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double salario, pay;

        System.out.printf("Digite o seu salário\n> ");
        salario = sc.nextDouble();

        if(salario >= 0 && salario <= 2000){
            System.out.println("Isento de Imposto\n");
            pay = 0;
        }
        else if(salario > 2000 && salario <= 3000){
            pay = (salario - 2000) * 0.08;
        }
        else if(salario > 3000 && salario <= 4500){
            pay = (salario - 3000) * 0.18 + 1000 * 0.08; 
        }
        else if(salario > 4500){
            pay = (salario - 4500) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
        }
        else{
            pay = -1;
        }

        if(pay >= 0){
            System.out.printf("Valor a pagar: R$ %.2f", pay);
        }
        else{
            System.out.println("Digite um valor maior ou igual a 0");
        }

        sc.close();
    }
}
