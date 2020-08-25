/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        UberX uberX = new UberX("AMQ123", new Account("Brandon Vite", "VIDB931013"), "Chevrolet", "Sonic");
        uberX.setPassenger(2);
        uberX.printDataCar();

        UberVan uberVan = new UberVan("FHEOWA", new Account("Jose", "JOWSET2"));
        uberVan.setPassenger(6);
        uberVan.printDataCar();
    }
}