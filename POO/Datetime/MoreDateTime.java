package POO.Datetime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;


public class MoreDateTime {
    public static void main(String[] args) {
        
        /*for(String s : ZoneId.getAvailableZoneIds()) { // Retorna todos as zonas temporais
            System.out.println(s);
        }*/


        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));

        System.out.println(r1); // Retorna dia 2022-07-19 pq volta 3 horas do Z
        System.out.println(r2); // Retorna dia 2022-07-20 pois estamos em Portugal
        System.out.println(r3);
        System.out.println(r4);


        System.out.println("_________________________________");
        LocalDate d04 = LocalDate.parse("2022-07-18");

        System.out.println("d04 dia = " + d04.getDayOfMonth());
        System.out.println("d04 mês = " + d04.getMonthValue());
        System.out.println("d04 ano = " + d04.getYear());

        System.out.println("___________________________________");

        LocalDateTime d05 = LocalDateTime.parse("2007-01-05T18:20:22");

        System.out.println("d05 dia = " + d05.getDayOfMonth());
        System.out.println("d05 mês = " + d05.getMonth());
        System.out.println("d05 ano = " + d05.getYear());
        System.out.println("d05 hora = " + d05.getHour());
        System.out.println("d05 minuto = " + d05.getMinute());
        System.out.println("d05 segundo = " + d05.getSecond());
        
        
    }
}
