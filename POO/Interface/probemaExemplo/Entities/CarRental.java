package POO.Interface.probemaExemplo.Entities;

import java.time.LocalDateTime;

public class CarRental {

    private LocalDateTime start;
    private LocalDateTime finish;
    private Vehicle vehicle;
    private CarRental carRental;

    public CarRental(LocalDateTime start, LocalDateTime finish, Vehicle vehicle, CarRental carRental) {
        this.start = start;
        this.finish = finish;
        this.vehicle = vehicle;
        this.carRental = carRental;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getFinish() {
        return finish;
    }

    public void setFinish(LocalDateTime finish) {
        this.finish = finish;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public CarRental getCarRental() {
        return carRental;
    }

    public void setCarRental(CarRental carRental) {
        this.carRental = carRental;
    }
}
