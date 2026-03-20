package moreExcercicesOfMyHead.Buy;

import com.sun.nio.sctp.AbstractNotificationHandler;
import moreExcercicesOfMyHead.Buy.Entities.Cliente;
import moreExcercicesOfMyHead.Buy.Entities.Produto;

import java.lang.reflect.GenericDeclaration;
import java.util.Locale;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos produtos deseja cadastrar? ");
        int nProdutos = sc.nextInt();

        Produto[] produtos = new Produto[nProdutos];

        for(int i = 0; i < nProdutos; i++) {
            System.out.print("Digite o nome do produto: ");
            String produtoNome = sc.next();
            System.out.println("Digite o tipo do produto: "); //Produtos criados com id autoincrementado
            String tipoProduto = sc.next();

            produtos[i] = new Produto(i, produtoNome, tipoProduto);
        }

        System.out.print("Qual o seu nome: ");
        String nomeCliente = sc.next();
        System.out.print("Qual o seu CPF: ");
        String cpfCliente = sc.next();
        System.out.print("Qual o seu Email: ");
        String emailCliente = sc.next();
        System.out.println("Deseja adicionar endereço?");
        char opcao = sc.next().charAt(0);
        String enderecoCliente = null;
        if(opcao == 's' || opcao == 'S') {
            System.out.print("Qual o seu endereço: ");
            enderecoCliente = sc.next();
        }

        if(enderecoCliente != null) {
            Cliente cliente = new Cliente(nomeCliente, cpfCliente, emailCliente, enderecoCliente);
        }
        else {
            Cliente cliente = new Cliente(nomeCliente, cpfCliente, emailCliente);
        }
    }
}
