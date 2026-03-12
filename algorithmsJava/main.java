package algorithmsJava;

import java.util.Locale;
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha uma opção\n> ");
        int opcao = sc.nextInt();

        switch(opcao){
            case 1 -> System.out.println("Escolheu 1");
            case 2 -> System.out.println("Escolheu 2");
            case 3 -> System.out.println("Escolheu 3");
            case 4 -> System.out.println("Escolheu 4");
            case 5 -> System.out.println("Escolheu 5");
            case 6 -> System.out.println("Escolheu 6");
            default -> System.out.println("Preguiça para pegar um numero maior q 6");
        }

    }
}
