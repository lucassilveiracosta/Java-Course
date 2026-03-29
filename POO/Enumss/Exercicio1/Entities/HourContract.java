package POO.Enumss.Exercicio1.Entities;


import java.time.LocalDate;
import java.util.Date;


public class HourContract {

    private LocalDate date;
    private Double valuePerHour;
    private Integer hour;

    public HourContract(LocalDate date, Double valuePerHour, Integer hour) {
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hour = hour;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }

    public Double totalValue() {
        return valuePerHour * hour;
    }
}
