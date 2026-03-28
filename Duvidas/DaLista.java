package Duvidas;

import java.time.LocalDateTime;

public class DaLista {

    public static void main(String[] args) {
        LocalDateTime data = LocalDateTime.of(2020, 1, 31, 0, 0);

        data = data.plusMonths(1)
                .plusDays(1)
                .minusYears(1);

        System.out.println(data);
    }
}
