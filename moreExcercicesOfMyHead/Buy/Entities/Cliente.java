package moreExcercicesOfMyHead.Buy.Entities;

public class Cliente {
    private String nome;
    private String cpf;
    private String email;
    private String endereco;

    public Cliente(String cpf, String nome, String email, String endereco) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
    }

    public Cliente(String cpf, String email, String nome) {
        this.cpf = cpf;
        this.email = email;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
