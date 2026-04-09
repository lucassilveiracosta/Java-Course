package POO.Heranca.Abstracts.Entities;

import POO.Heranca.Abstracts.Enum.Color;

public class Circle extends Shape{

    protected Double radius;


    public Circle(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double area() {
        return Math.PI * radius * radius;
    }
}
