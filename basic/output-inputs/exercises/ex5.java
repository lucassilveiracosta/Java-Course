import java.util.Locale;
import java.util.Scanner;

public class ex5 {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int cdg1, qntd1, cdg2, qntd2;
        double preco1, preco2;

        System.out.printf("Digite o código do produto 1\n> ");
        cdg1 = sc.nextInt();
        System.out.printf("Digite o quantidade do produto 1\n> ");
        qntd1 = sc.nextInt();
        System.out.printf("Digite o preço do produto 1\n> ");
        preco1 = sc.nextDouble();

        
        
        System.out.printf("\n\nDigite o código do produto 2\n> ");
        cdg2 = sc.nextInt();
        System.out.printf("Digite o quantidade do produto 2\n> ");
        qntd2 = sc.nextInt();
        System.out.printf("Digite o preço do produto 2\n> ");
        preco2 = sc.nextDouble();


        double pr_final1 = qntd1 * preco1;
        double pr_final2 = qntd2 * preco2;
        
        System.out.printf("[%d] - R$ %.2f\n", cdg1, pr_final1);
        System.out.printf("[%d] - R$ %.2f\n", cdg2, pr_final2);
        System.out.printf("Total a pagar: R$ %.2f", pr_final1 + pr_final2);
        sc.close();
    }
}
