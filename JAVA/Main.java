/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");

        Car car = new Car("AMQ123", new Account("Brandon Vite", "VIDB931013"));
        car.printDataCar();

        Car car2 = new Car("QWE123", new Account("Andrea Herrera", "VIDB931015"));
        car2.printDataCar();

        User user = new Account("Brandon Vite", "VIDG234245");
        user.printDataCar();

        Driver driver = new Account("Juan Vite", "JVIT96432");
        driver.printDataCar();
    }
}