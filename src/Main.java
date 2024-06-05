public class Main {
    public static void main(String[] args) {
        RentalAgency agency = new RentalAgency();

        Car car1 = new Car("ABC123", "Toyota");
        Car car2 = new Car("XYZ789", "Honda");

        agency.addCar(car1);
        agency.addCar(car2);

        Customer customer1 = new Customer("John Doe", "DL12345");
        agency.addCustomer(customer1);

        System.out.println("Renting Car ABD123: " + agency.rentCar("ABC123", "DL12345"));
        System.out.println("Returning Car ABC123" + agency.returnCar("ABC123"));
    }
}