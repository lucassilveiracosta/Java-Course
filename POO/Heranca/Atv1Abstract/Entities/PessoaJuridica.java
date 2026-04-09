package POO.Heranca.Atv1Abstract.Entities;

public class PessoaJuridica extends Pessoa{

    private Integer numDeFuncionarios;

    public PessoaJuridica(String nome, Double rendaAnual, Integer numDeFuncionarios) {
        super(nome, rendaAnual);
        this.numDeFuncionarios = numDeFuncionarios;
    }

    public Integer getNumDeFuncionarios() {
        return numDeFuncionarios;
    }

    public void setNumDeFuncionarios(Integer numDeFuncionarios) {
        this.numDeFuncionarios = numDeFuncionarios;
    }

    @Override
    public Double imposto() {
        if(numDeFuncionarios > 10) {
            return rendaAnual * 0.14;
        }
        else {
            return rendaAnual * 0.16;
        }
    }
}
