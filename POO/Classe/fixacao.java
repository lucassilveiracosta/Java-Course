package POO.Classe;

import java.util.Locale;
import java.util.Scanner;

import POO.Classe.entities.CurrencyConverter;

public class fixacao {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        CurrencyConverter money;
        money = new CurrencyConverter();

        System.out.printf("What is the dollar price? ");
        money.dolar = sc.nextDouble();
        System.out.printf("How many dollars will be bought? ");
        money.amount = sc.nextDouble();
        System.out.printf("Amount to be paid in Reais R$ %.2f", money.pay());

        sc.close();
    }
}
