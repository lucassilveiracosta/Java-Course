package POO.Constructor.exercises;

import java.util.Locale;
import java.util.Scanner;

import POO.Constructor.entities.Bank;

public class ex1 {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Bank user;
        user = new Bank(0, null, 0);

        System.out.printf("Enter account number: ");
        user.setAccount(sc.nextInt());
        System.out.printf("Enter account holder: ");
        user.setName(sc.next());
        sc.nextLine();
        System.out.printf("Is there an initial deposit (y/n)? ");
        char confirm = sc.next().charAt(0);
        
        if(confirm == 'y') {
            System.out.printf("Enter initial deposit: ");
            user.depositMoney(sc.nextDouble());
        }

        user.printData(user.getAccount(), user.getName(), user.getMoney());

        System.out.printf("\n\nEnter a deposit value: ");
        user.depositMoney(sc.nextDouble());
        System.out.println("Updated data");
        user.printData(user.getAccount(), user.getName(), user.getMoney());

        System.out.printf("\n\nEnter a withdraw value: ");
        user.withdrawMoney(sc.nextDouble());
        System.out.println("Updated data");
        user.printData(user.getAccount(), user.getName(), user.getMoney());

        
        sc.close();
    }
}
