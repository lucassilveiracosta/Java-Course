package POO.Exception;

import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Reservation {
    private Integer roomNumber;
    private LocalDate checkin;
    private LocalDate checkout;

    public Reservation(Integer roomNumber, LocalDate checkin, LocalDate checkout) {
        this.roomNumber = roomNumber;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public LocalDate getCheckin() {
        return checkin;
    }

    public void setCheckin(LocalDate checkin) {
        this.checkin = checkin;
    }

    public LocalDate getCheckout() {
        return checkout;
    }

    public void setCheckout(LocalDate checkout) {
        this.checkout = checkout;
    }

    public Integer duration() {
        Duration duration = Duration.between(this.checkin.atStartOfDay(), this.checkout.atStartOfDay());
        return (int) duration.toDays();
    }

    private int duration(LocalDate checkin, LocalDate checkout) {
        Duration duration = Duration.between(checkin.atStartOfDay(), checkout.atStartOfDay());
        return (int) duration.toDays();
    }

    public void updateDates(LocalDate checkin, LocalDate checkout) {
        try {
            if (duration(checkin, checkout) > 0 && checkin.atStartOfDay().isAfter(LocalDate.now().atStartOfDay()) && checkout.isAfter(LocalDate.now())) {
                this.checkin = checkin;
                this.checkout = checkout;
            }
        }
        catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    static void main(String[] args) {
        LocalDate dateIn = LocalDate.of(2026, 6, 2);
        LocalDate dateOut = LocalDate.of(2026, 6, 5);
        Reservation reservation = new Reservation(14, dateIn, dateOut);

        System.out.println(reservation.duration());

        LocalDate dateIn1 = LocalDate.of(2026, 6, 2);
        LocalDate dateOut1 = LocalDate.of(2026, 7, 5);

        reservation.updateDates(dateIn1, dateOut1);
        System.out.println(reservation.duration());

    }
}

