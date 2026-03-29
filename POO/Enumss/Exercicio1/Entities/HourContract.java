package POO.Enumss.Exercicio1.Entities;

import java.util.Date;

public class HourContract {

    private Date date;
    private Double valuePerHour;
    private Integer hour;

    public Double totalValue() {
        return valuePerHour * hour;
    }
}
