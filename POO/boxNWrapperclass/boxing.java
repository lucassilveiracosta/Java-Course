package POO.boxNWrapperclass;


public class boxing {
    
    public static void main(String[] args) {
        
        int x = 20;
        Object obj = x; //BOXING(cria um valor na heap memory)
        System.out.println(obj); // manipulando com objeto


        int y = (int) obj; //UNBOXING(traz o valor da heap memory)
        System.out.println(y); // manipulando com objeto


        //Utilizando Wrapper Class

        int xis = 30;
        Integer objeto = xis; // ao inves de usar tipos primitivos e ficar evitando casting, recomenda-se o uso de wrapper class
        // wrapper class é a classe do tipo primitivo(Ex.: Integer -> int)
        System.out.println(objeto); // manipulando com wrapper class

        int ipsilon =  objeto;
        System.out.println(ipsilon);


        

    }
}
