package basic.conditionals.exercises;

import java.util.Locale;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cdg, qntd;
        double total;

        System.out.println("Código |  Produto  |   Preço");
        System.out.println("  1    |  HotDog   |  R$ 4.00");
        System.out.println("  2    |  X-salada |  R$ 4.50");
        System.out.println("  3    |  X-bacon  |  R$ 5.00");
        System.out.println("  4    |  Toast    |  R$ 2.00");
        System.out.println("  5    |  Refri    |  R$ 1.50");

        System.out.printf("\n Digite o código do seu produto\n> ");
        cdg = sc.nextInt();
        System.out.printf("\n Digite a quantidade\n> ");
        qntd = sc.nextInt();


        if(cdg == 1){
            total = 4 * qntd;
        }
        else if(cdg == 2){
            total = 4.5 * qntd;
        }
        else if(cdg == 3){
            total = 5 * qntd;
        }
        else if(cdg == 4){
            total = 2 * qntd;
        }
        else if(cdg == 5){
            total = 1.5 * qntd;
        }
        else{
            total = 0;
        }

        System.out.printf("\nTotal a pagar: R$ %.2f", total);

        sc.close();
    }   
}
