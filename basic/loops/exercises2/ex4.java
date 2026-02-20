package basic.loops.exercises2;

import java.util.Locale;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a, b;
        int qntd;

        System.out.printf("Digite a quantidade\n> ");
        qntd = sc.nextInt();


        System.out.printf("Digite na seta números para dividir, no formato (a/b)\n");
        for(int i = 0; i < qntd; i++){
            System.out.printf("Digite um valor para [a]\n> ");
            a = sc.nextDouble();
            System.out.printf("Digite um valor para [b]\n> ");
            b = sc.nextDouble();

            if(b == 0) {
                System.out.println("Divisão impossível (b = 0)\n\n");
            }
            else{
                System.out.printf("Divisão: %.1f\n\n", a / b);
            }
        }
        sc.close();
    }
}
