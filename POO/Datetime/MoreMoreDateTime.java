package POO.Datetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.Locale;

public class MoreMoreDateTime {

    public static void main(String[] args) {
        LocalDate pedido = LocalDate.of(2025, 4, 5);
        LocalDate agora = LocalDate.now();

        Duration days = Duration.between(pedido.atStartOfDay(), agora.atStartOfDay());
        System.out.println("Feliz " + days.toDays() + " dias de namorooooooo!!!!");
    }
}
