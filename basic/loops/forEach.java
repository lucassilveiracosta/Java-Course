package basic.loops;

public class forEach {
    
    public static void main(String[] args) {
        
        String[] vect = new String[] { "Lucas" , "Kimmy" , "KimmyJr" };

        for(String obj: vect) { // para cada elemento do vetor, o obj se torna o elementoe vai andando de 1 em 1
            System.out.println(obj);
        }
    }
}
