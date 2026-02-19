package basic.conditionals;

import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int idade;

        System.out.printf("Quantos anos você tem?\n> ");
        idade = sc.nextInt();

        if(idade < 18) {
            System.out.println("Você é menor de idade");
        }
        else{
            System.out.println("Você é maior de idade");
        }
        sc.close();
    }
}
