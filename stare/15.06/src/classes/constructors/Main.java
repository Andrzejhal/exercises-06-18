package classes.constructors;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Fiat", 90); //ctrl+p w nawiasie
        System.out.println(car1.speed);
        System.out.println(car1.model);

        Car car2 = new Car();
        System.out.println(car2.speed);
        System.out.println(car2.model);

    }
}
