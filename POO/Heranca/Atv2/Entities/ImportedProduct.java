package POO.Heranca.Atv2.Entities;

public class ImportedProduct extends Product{

    private Double customsFee;

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    public Double totalPrice() {
        return this.getPrice() + this.getCustomsFee();
    }

    @Override
    public String priceTag() {
        return this.getName() + " $ " + this.getPrice() + " (Customs fee: $ " + this.getCustomsFee() + ")\n";
    }
}
