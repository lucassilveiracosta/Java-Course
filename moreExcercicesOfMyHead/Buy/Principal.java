package moreExcercicesOfMyHead.Buy;

import moreExcercicesOfMyHead.Buy.Entities.Cliente;
import moreExcercicesOfMyHead.Buy.Entities.Compra;
import moreExcercicesOfMyHead.Buy.Entities.Produto;

import java.time.LocalDateTime;
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
            System.out.print("Digite o tipo do produto: "); //Produtos criados com id autoincrementado
            String tipoProduto = sc.next();

            produtos[i] = new Produto(i, produtoNome, tipoProduto);
        }

        System.out.print("Qual o seu nome: ");
        String nomeCliente = sc.next();
        System.out.print("Qual o seu CPF: ");
        String cpfCliente = sc.next();
        System.out.print("Qual o seu Email: ");
        String emailCliente = sc.next();
        System.out.print("Deseja adicionar endereço? ( s - sim | n - não ): ");
        char opcao = sc.next().charAt(0);
        String enderecoCliente = null;
        if(opcao == 's' || opcao == 'S') {
            System.out.print("Qual o seu endereço: ");
            enderecoCliente = sc.next();
        }

        Cliente cliente = new Cliente(null, null, null, null);
        if(enderecoCliente != null) {
            cliente = new Cliente(nomeCliente, cpfCliente, emailCliente, enderecoCliente);
        }
        else {
            cliente = new Cliente(nomeCliente, cpfCliente, emailCliente);
        }
        System.out.println("Qual produto você deseja comprar? ");
        for(int i = 0; i < nProdutos; i++) {
            System.out.printf("Produto %d: %s\n",i , produtos[i].getNome());
        }
        sc.nextLine();
        System.out.print("\nDigite aqui: ");

        int idProdutoComprar = sc.nextInt();
        Compra compra = new Compra(produtos[idProdutoComprar], cliente, LocalDateTime.now());

        System.out.println("Registro da compra:");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Endereço: " + cliente.getEndereco());
        System.out.println("Nome do Produto " + produtos[idProdutoComprar].getNome());
        System.out.println("Tipo do Produto " + produtos[idProdutoComprar].getType());
        System.out.println("Data da compra: " + compra.getCreatedAt());

        sc.close();
    }
}
