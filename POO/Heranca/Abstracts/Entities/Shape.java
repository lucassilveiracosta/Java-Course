package POO.Heranca.Abstracts.Entities;

import POO.Heranca.Abstracts.Enum.Color;

public abstract class Shape {

    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Double area() {
        return null;
    };
}
