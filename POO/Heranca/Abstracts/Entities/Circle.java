package POO.Heranca.Abstracts.Entities;

import POO.Heranca.Abstracts.Enum.Color;

public class Circle extends Shape{

    protected Double radius;

    private final Double pi = Math.PI;

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
        return pi * Math.pow(this.radius, 2);
    }
}
