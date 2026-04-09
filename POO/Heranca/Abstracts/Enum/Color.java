package POO.Heranca.Abstracts.Enum;

public enum Color {

    BLACK(1),
    BLUE(2),
    RED(3);

    private final Integer codigo;

    Color(Integer codigo) {
        this.codigo = codigo;
    }

    public int getColor() {
        return this.codigo;
    }
}
