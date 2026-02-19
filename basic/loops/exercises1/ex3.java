package basic.loops.exercises1;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao = 1;
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        System.out.printf("Digite na seta o numero do combustivel utilizado pelo cliente\n");
        while(opcao != 4){
            System.out.printf("> ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    alcool++;
                break;
                case 2:
                    gasolina++;
                break;
                case 3: 
                    diesel++;
                break;
                case 4: 
                    System.out.println("FIM");
                break;
            
                default:
                    System.out.println("Esse valor não existe!");    
                break;
            }
        }

        System.out.printf("\nÁlcool: %d", alcool);
        System.out.printf("\nGasolina: %d", gasolina);
        System.out.printf("\nDiesel: %d", diesel);

        sc.close();
    }
}
