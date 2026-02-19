package basic.conditionals;

import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int idade;

        System.out.printf("How old are you?\n> ");
        idade = sc.nextInt();

        if(idade < 18) {   // Operador SE(Cláusula)
            System.out.println("You are underage");
        }
        else{              // Operador SE NÃO
            System.out.println("You are of a legal age");
        }
        sc.close();
    }
}
