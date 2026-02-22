package POO.Classe.entities;

public class CurrencyConverter {
    
    public double dolar;
    public double amount;
    public double tax = 1.06;

    public double pay() {
        return dolar * amount * tax;
    }
}
