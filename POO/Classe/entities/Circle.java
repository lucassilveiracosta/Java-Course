package POO.Classe.entities;

public class Circle {
    
    public double radius;
    
    public double circumference(double pi) {
        return 2 * pi * radius;
    }

    public double volumeSphere(double pi) {
        return (4 * pi * Math.pow(radius, 3)) / 3;
    }
}
