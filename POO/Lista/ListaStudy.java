package POO.Lista;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListaStudy {
    public static void main(String[] args) {
        
        List<String> list; // Ainda temos que instaciar!!
        //     |-> Não pode ser tipo primitivo(int, double, char)

        list = new ArrayList<>(); // Essa implemetação é otmizada, pega caracteristicas do vetor e da lista, daí ArrayList

        list.add("Lucas");
        list.add("Kimmy I");
        list.add("Kimmy II");
        list.add("Kimmy III");
        list.add("Kimmy IV");
        list.add("Theo");
        list.add("Paula");
        list.add("Manjindher");
        list.add("Gustavo");
        list.add("Darleide");
        list.add("Pipoca");

        list.add(2, "KimmyTrue");// Coloca na posição 2 e empurra os demais para cima

        list.remove("Kimmy III"); // Remove o elemento se for "Kimmy III"
        

        System.out.println(list.size()); // Pega o tamanho da lista pelo metodo .size()

        for(String obj: list) { // For each
            System.out.println(obj);
        }

        System.out.println("________________________________________\n");

        list.removeIf(x -> x.charAt(0) == 'L'); // função lambda que remove elementos que começam com 'K'

        for(String obj: list) { // For each
            System.out.println(obj);
        }

        System.out.println("________________________________________\n");

        System.out.println("Index of KimmyTrue: " + list.indexOf("KimmyTrue")); // se não retornar elemento, é printado -1

        System.out.println("________________________________________\n");

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'K').collect(Collectors.toList());

        for(String obj: result) { // For each
            System.out.println(obj);
        }

        System.out.println("________________________________________\n");

        String name = list.stream().filter(x -> x.charAt(0) == 'M').findFirst().orElse(null);
        System.out.println(name);
    }
}
