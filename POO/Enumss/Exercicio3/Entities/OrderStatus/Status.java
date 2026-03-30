package POO.Enumss.Exercicio3.Entities.OrderStatus;

public enum Status {
    PENDING_PAYMENT(0),
    PROCESSING(1),
    SHIPPING(2),
    DELIVERED(3);

    private final int codigo;

    Status(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return this.codigo;
    }
}
