package moreExcercicesOfMyHead.Buy.Entities;

public class Produto {
    private int id;
    private String nome;
    private String type;


    public int getId() {
        return id;
    }

    public Produto(int id, String nome, String type) {
        this.id = id;
        this.nome = nome;
        this.type = type;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
