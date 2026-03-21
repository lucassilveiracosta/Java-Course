package moreExcercicesOfMyHead.Buy.Entities;

import java.time.LocalDateTime;

public class Compra {
    private Produto produto;
    private Cliente cliente;
    private final LocalDateTime createdAt;

    public Compra(Produto produto, Cliente cliente, LocalDateTime createdAt) {
        if(produto != null || cliente != null) {
            if(cliente.getEndereco() != null) {
                this.produto = produto;
                this.cliente = cliente;
                this.createdAt = createdAt;
            }
            else {
                throw new RuntimeException("Para a compra é necessário um endereço");
            }
        }
        else {
            throw new RuntimeException("Produto ou Cliente nulos.");
        }
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
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
