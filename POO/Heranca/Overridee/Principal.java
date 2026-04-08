package POO.Heranca.Overridee;

import POO.Heranca.Overridee.Entities.Account;
import POO.Heranca.Overridee.Entities.BusinessAccount;
import POO.Heranca.Overridee.Entities.SavingsAccount;

public class Principal {

    static void main(String[] args) {

        Account acc1 = new Account(1000, "Kimmy", 1000.0);
        Account acc2 = new BusinessAccount(1001, "Lucas", 1000.0, 500.0);
        Account acc3 = new SavingsAccount(1002, "Theo", 1000.0, 1.01);

        acc1.withdraw(200);
        acc2.withdraw(200);
        acc3.withdraw(200);

        System.out.println(acc1.getBalance());
        System.out.println(acc2.getBalance());
        System.out.println(acc3.getBalance());
    }
}
