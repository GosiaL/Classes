package car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Ford", "Focus", 4000);
        Car car1 = new Car("BMW", "E36", 16000);
        Car car2 = new Car("Audi", "A4", 20000);

        car.show();
        car.show1();
        System.out.println(car);

        if(car.equals(car1)){
            System.out.println("Są takie same");
        } else {
            System.out.println("Nie są takie same");
        }
    }
}
