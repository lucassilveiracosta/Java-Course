package POO.Datetime;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Calculos {
    public static void main(String[] args) {
        
        LocalDate d04 = LocalDate.parse("2007-02-01");

        LocalDate pastWeekLocalDate = d04.minusWeeks(1);
        System.out.println("Menos 7 dias: " + pastWeekLocalDate);

        LocalDate nextWeek = d04.plusDays(7);
        System.out.println("Mais 7 dias: " + nextWeek);

        System.out.println("_________________________________");

        LocalDateTime d05 = LocalDateTime.parse("2007-01-05T18:20:19");

        System.out.println("Mais 7 dias: " + d05.plusDays(7));
        System.out.println("Menos 7 dias: " + d05.minusDays(7));


        System.out.println("_________________________________");

        Instant d06 = Instant.parse("2007-01-05T18:20:19Z");

        System.out.println("Mais 7 dias: " + d06.plus(7, ChronoUnit.DAYS));
        System.out.println("Menos 7 dias: " + d06.minus(7, ChronoUnit.DAYS));

        System.out.println("___________________________________");

        LocalDate lucasBirDate = LocalDate.parse("2007-01-05");
        LocalDateTime kimmyBirDate = LocalDateTime.parse("2007-02-01T00:00:00");
        LocalDateTime today = LocalDateTime.now();


        Duration t2 = Duration.between(lucasBirDate.atStartOfDay(), today); //Outra opção para settar a hora
        Duration t1 = Duration.between(kimmyBirDate, today); //Só realiza operações com LocalDateTime
        System.out.println(t2.toDays());
        System.out.println(t1.toDays());
    }
}
