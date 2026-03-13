package POO.boxNWrapperclass;

import POO.boxNWrapperclass.Example;

public class ClasseComWrapper {
    
    public static void main(String[] args) {
        
        String name = "Lucas";
        double price = 12.2;
        int quantity = 10;
       
        Example ex = new Example(name, price, quantity);

        System.out.println(ex.getName());
    }
}
