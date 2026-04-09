package POO.Heranca.Atv1Abstract.Entities;

public class PessoaFisica extends Pessoa {
    private Double gastosComSaude;

    public PessoaFisica(String nome, Double rendaAnual, Double gastosComSaude) {
        super(nome, rendaAnual);
        this.gastosComSaude = gastosComSaude;
    }

    public Double getGastosComSaude() {
        return gastosComSaude;
    }

    public void setGastosComSaude(Double gastosComSaude) {
        this.gastosComSaude = gastosComSaude;
    }

    @Override
    public Double imposto() {
        if(gastosComSaude > 0) {
            if (rendaAnual < 20000.00) {
                return (rendaAnual * 0.15) - (gastosComSaude * 0.5);
            } else {
                return (rendaAnual * 0.25) - (gastosComSaude * 0.5);
            }
        }
        else {
            if (rendaAnual < 20000.00) {
                return (rendaAnual * 0.15);
            } else {
                return (rendaAnual * 0.25);
            }
        }
    }

}
