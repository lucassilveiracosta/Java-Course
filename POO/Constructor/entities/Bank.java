package POO.Constructor.entities;

public class Bank {
    
    private int account;
    private String name;
    private double money;

    public Bank(int account, String name, double money) { //Constructor
        this.account = account;
        this.name = name;
        this.money = money;
    }

    public int getAccount() {
        return this.account;
    }

    public int setAccount(int account) {
        return this.account = account;
    }

    public String getName() {
        return this.name;
    }

    public String setName(String name) {
        return this.name = name;
    }

    public double getMoney() {
        return this.money;
    }

    public void printData(int account, String name, double money) {
        System.out.printf("Account: %d, Holder: %s, Balance: $ %.2f", account, name, money);
    }


    public double depositMoney(double deposit) {  // depositar
        return money += deposit;
    }

    public double withdrawMoney(double withdraw) { //sacar
        return money -= (withdraw + 5);
    }
    
}
