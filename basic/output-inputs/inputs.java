import java.util.Locale;
import java.util.Scanner;

public class inputs {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite seu nome");
        String nome = sc.next();

        System.out.println("\nDigite a sua idade");
        int idade = sc.nextInt();

        System.out.println("\nDigite o seu peso");
        double peso = sc.nextDouble();


        System.out.printf("O seu nome é %s\n", nome);
        System.out.printf("A sua idade é %d anos\n", idade);
        System.out.printf("O seu peso é %.1f kg\n", peso);
        
        sc.close();
    }
}
