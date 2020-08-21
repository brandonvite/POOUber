/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        Car car = new Car();
        car.license = "AMQ123";
        car.driver = "Brandon Vite";
        car.passenger = 4;
        car.printDataCar();

        Car car2 = new Car();
        car2.license = "QWE123";
        car2.driver = "Andrea Herrera";
        car2.passenger = 5;
        car.printDataCar();
    }
}