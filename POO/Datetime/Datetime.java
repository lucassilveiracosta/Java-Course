package POO.Datetime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Datetime {
    public static void main(String[] args) {
        
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); 

        LocalDate d01 = LocalDate.now(); /// --> apenas a data
        LocalDateTime d02 = LocalDateTime.now(); // --> data com horário

        Instant d03 = Instant.now(); // data ajustada para o fuso horario de londres ('Z')

        LocalDate d04 = LocalDate.parse("2007-01-05"); //com texto
        LocalDateTime d05 = LocalDateTime.parse("2007-01-05T19:30:00"); //com texto
        Instant d06 = Instant.parse("2007-01-05T19:30:00Z");
        Instant d07 = Instant.parse("2007-01-05T19:30:00-03:00"); // Adiantando 3 horas

        LocalDate d08 = LocalDate.parse("16/09/2018", fmt1);
        LocalDateTime d09 = LocalDateTime.parse("16/09/2018 12:30", fmt2);
        LocalDate d10 = LocalDate.of(2022,7,20);
        LocalDateTime d11 = LocalDateTime.of(2001, 9, 11, 12, 30);

        System.out.println(d01);
        System.out.println(d02);
        System.out.println(d03);
        System.out.println(d04);
        System.out.println(d05);
        System.out.println(d06);
        System.out.println(d07);
        System.out.println(d08);
        System.out.println(d09);
        System.out.println(d10);
        System.out.println(d11);
    }
}
