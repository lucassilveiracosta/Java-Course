package POO.Heranca.Atv1Abstract.Entities;

public abstract class Pessoa {

    protected String nome;
    protected Double rendaAnual;

    public Pessoa(String nome, Double rendaAnual) {
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(Double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }

    public abstract Double imposto();
    public void taxesPaid() {
        System.out.printf("%s: $ %.2f\n", nome, this.imposto());
    }

    public static void totalTaxes(Pessoa[] pessoas) {
        double sum = 0.0;
        for (Pessoa x: pessoas) {
            sum += x.imposto();
        }
        System.out.printf("Taxas totais: %.2f", sum);
    }
}

