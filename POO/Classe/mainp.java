package POO.Classe;

import java.util.Scanner;
import POO.Classe.entities.Product;


public class mainp {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int exit = 0;
        int option;
        Product any;
        any = new Product(sc);

        any.name = sc.next();
        any.price = sc.nextDouble();
        any.quantity = sc.nextInt();

        while(exit != 1) {
            System.out.println("1. See product");
            System.out.println("2. Add product");
            System.out.println("3. Remove product");
            System.out.printf("4. Exit system\n> ");
            option = sc.nextInt();

            switch(option){
                case 1: 
                    any.showProduct();
                    break;
                
                case 2: 
                    any.addProduct();
                    break;
                
                case 3: 
                    any.removeProduct();
                    break;

                case 4: 
                    exit = 1;
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }

        }

        sc.close();
    }
}
