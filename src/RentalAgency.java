import java.util.ArrayList;
import java.util.List;

public class RentalAgency {
    private List<Car> cars;
    private List<Customer> customers;

    public RentalAgency() {
        cars = new ArrayList<>();
        customers = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public boolean rentCar(String licensePlate, String driverLicense) {
        Car car = findCarByLicensePlate(licensePlate);
        if (car != null && !car.isRented()) {
            car.rentCar();
            return true;
        }
        return false;
    }

    public boolean returnCar(String licensePlate) {
        Car car = findCarByLicensePlate(licensePlate);
        if (car != null && car.isRented()) {
            car.returnCar();
            return true;
        }
        return false;
    }

    private Car findCarByLicensePlate(String licensePlate) {
        for (Car car : cars) {
            if (car.getLicensePlate().equals(licensePlate)) {
                return car;
            }
        }
        return null;
    }
}
