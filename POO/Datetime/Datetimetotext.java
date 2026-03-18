package POO.Datetime;

import java.sql.Date;
import java.time.DateTimeException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Datetimetotext {
    public static void main(String[] args) {
        
        LocalDate d04 = LocalDate.parse("2007-01-05"); //com texto
        LocalDateTime d05 = LocalDateTime.parse("2007-01-05T19:30:00"); //com texto
        Instant d06 = Instant.parse("2007-01-05T19:30:00Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_INSTANT; // Função ja pronta

        System.out.println("d04 = " + d04.format(fmt1));
        System.out.println("d04 = " + fmt1.format(d04));
        System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        

        System.out.println("\nd05 = " + d05.format(fmt1));
        System.out.println("d05 = " + d05.format(fmt2));
        System.out.println("d06 = " + fmt3.format(d06));// formatando com TimeZone
        System.out.println("d06 = " + fmt4.format(d06));
        System.out.println("d06 = " + d06.toString());

    }
}
