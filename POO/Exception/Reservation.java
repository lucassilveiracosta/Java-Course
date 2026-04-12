package POO.Exception;

import POO.Exception.exceptions.ReservationException;
import com.sun.source.tree.ParenthesizedTree;

import java.text.ParseException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Formatter;
import java.util.Scanner;

public class Reservation {
    private Integer roomNumber;
    private LocalDate checkin;
    private LocalDate checkout;

    public Reservation(Integer roomNumber, LocalDate checkin, LocalDate checkout) throws ReservationException{
        if(checkin.isAfter(checkout)){
            throw new ReservationException("The check-in date must be before check-out date");
        }
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

    public void updateDates(LocalDate checkin, LocalDate checkout) throws ReservationException {
        if(checkin.isBefore(LocalDate.now()) || checkout.isBefore(LocalDate.now())){
            throw new ReservationException("You cannot update to a day before today");
        }

        if(checkin.isAfter(checkout)) {
            throw new ReservationException("The check-in date must be before check-out date");
        }

        this.checkin = checkin;
        this.checkout = checkout;
    }

    public String toString(DateTimeFormatter fmt) {
        return "Room: "
            + roomNumber
            + "\nCheck-In: "
            + checkin.format(fmt)
            + "\nCheck-Out: "
            + checkout.format(fmt)
            + "\nDays: "
            + duration();
    }

    static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Room number: ");
            int roomNumber = sc.nextInt();
            DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            System.out.print("Enter check-in date (dd/mm/yyyy): ");
            LocalDate checkIn = LocalDate.parse(sc.next(), fmt);
            System.out.print("Enter check-out date (dd/mm/yyyy): ");
            LocalDate checkOut = LocalDate.parse(sc.next(), fmt);
            Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
            System.out.println(reservation.toString(fmt));

            System.out.println();
            System.out.println();
            System.out.println("Enter update data: ");
            System.out.print("Enter check-in date (dd/mm/yyyy): ");
            checkIn = LocalDate.parse(sc.next(), fmt);
            System.out.print("Enter check-out date (dd/mm/yyyy): ");
            checkOut = LocalDate.parse(sc.next(), fmt);
            reservation.updateDates(checkIn, checkOut);
            System.out.println(reservation.toString(fmt));

        }
        catch (ReservationException e) {
            System.out.println(e.getMessage());
        }
        catch (DateTimeParseException e) {
            System.out.println("Date in invalid format");
        }

    }
}

