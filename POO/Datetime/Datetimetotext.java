package POO.Datetime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Datetimetotext {
    public static void main(String[] args) {
        
        LocalDate d04 = LocalDate.parse("2007-01-05"); //com texto
        LocalDateTime d05 = LocalDateTime.parse("2007-01-05T19:30:00"); //com texto
        Instant d06 = Instant.parse("2007-01-05T19:30:00Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("d04 = " + d04.format(fmt1));
        System.out.println("d04 = " + fmt1.format(d04));
        System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println("\nd05 = " + d05.format(fmt1));
        System.out.println("d05 = " + d05.format(fmt2));

    }
}
