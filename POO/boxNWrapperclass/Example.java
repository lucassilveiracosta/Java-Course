package POO.boxNWrapperclass;


public class Example {
    
    private String name;
    private Double price; // esses tipos de campos permitem que possa haver valores null, permitindo uma comunicação com DB(database)
    private Integer quantity;

    public Example(String name, Double price, Integer quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return this.name;
    }

    public Double getPrice() {
        return this.price;
    }

    public Integer getQuantity() {
        return this.quantity;
    }
}
