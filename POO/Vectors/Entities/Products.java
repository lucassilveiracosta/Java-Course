package POO.Vectors.Entities;

public class Products {
    
    private String name;
    private double price;

    public Products(String name, double price) {

        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }
}
