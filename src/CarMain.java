public class CarMain {
public static void main(String[] args) {
Car defaultCar = new Car();
System.out.println("Default Car - Make: " + defaultCar.getMake() + ", Model: " + defaultCar.getModel() + ", Year: " + defaultCar.getYear());
Car customCar = new Car("Toyota", "Camry", 2022);
System.out.println("Custom Car - Make: " + customCar.getMake() + ", Model: " + customCar.getModel() + ", Year: " + customCar.getYear());
}
}
