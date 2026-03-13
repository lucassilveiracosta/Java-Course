package POO.Lista;

import java.util.ArrayList;
import java.util.List;

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

        for(String obj: list) {
            System.out.println(obj);
        }


    }
}
