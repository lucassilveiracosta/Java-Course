package moreExcercicesOfMyHead.Buy.Entities;

public class Compra {
    private int id;
    private Produto produto;
    private Cliente cliente;

    public Compra(int id, Produto produto, Cliente cliente) {
        if(produto != null || cliente != null) {
            this.id = id;
            this.produto = produto;
            this.cliente = cliente;
        }
        else {
            throw new RuntimeException("Produto ou Cliente nulos.");
        }
    }

    public int getId() {
        return id;
    }
    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
