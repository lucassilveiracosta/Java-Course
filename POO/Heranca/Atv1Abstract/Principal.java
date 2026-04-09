package POO.Heranca.Atv1Abstract;

import POO.Heranca.Atv1Abstract.Entities.Pessoa;
import POO.Heranca.Atv1Abstract.Entities.PessoaFisica;
import POO.Heranca.Atv1Abstract.Entities.PessoaJuridica;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the tax payers: ");
        int n = sc.nextInt();

        Pessoa[] pessoas = new Pessoa[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Tax payer #" + (i + 1) + "data: ");
            System.out.print("Individual or company (i/c)? ");
            char option = sc.next().toLowerCase().charAt(0);

            System.out.print("Nome: ");
            String nome = sc.next();

            System.out.print("Renda anual: ");
            double rendaAnual = sc.nextDouble();

            switch (option) {
                case 'i':
                    System.out.print("Gastos com saude: ");
                    double gastoSaude = sc.nextDouble();

                    pessoas[i] = new PessoaFisica(nome, rendaAnual, gastoSaude);
                break;

                case 'c':
                    System.out.print("Numero de empregados: ");
                    int numEmpregados = sc.nextInt();

                    pessoas[i] = new PessoaJuridica(nome, rendaAnual, numEmpregados);
                break;

                default:
                    throw new Error("Esse caracter não corresponde as opções: " + option);
            }
        }

        for (Pessoa pessoa: pessoas) {
            pessoa.taxesPaid();
        }
        System.out.println();

        Pessoa.totalTaxes(pessoas);
    }
}
