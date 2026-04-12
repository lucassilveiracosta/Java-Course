package POO.Exception.Exercise;

import POO.Exception.Exercise.Model.Entities.Account;
import POO.Exception.Exercise.Model.Exceptions.AccountException;

import java.util.Locale;
import java.util.Scanner;

public class Principal {
    static void main(String[] args) {
        try {
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter account data: ");
            System.out.print("Number: ");
            int number = sc.nextInt();
            System.out.print("Holder: ");
            String holder = sc.next();
            sc.nextLine();
            System.out.print("Initial balance: ");
            double initialBalance = sc.nextDouble();
            sc.nextLine();
            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();

            Account account = new Account(number, holder, initialBalance, withdrawLimit);

            System.out.print("Enter the amount to withdraw: ");
            double withdraw = sc.nextDouble();
            account.withdraw(withdraw);
            System.out.println("Balance: " + account.getBalance());
        }
        catch (AccountException e) {
            System.out.println(e.getMessage());
        }
        catch (RuntimeException e) {
            System.out.println("Unexpected error");
        }
    }
}
