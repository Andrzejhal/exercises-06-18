package classes.fields;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.speed = 123;
        car1.model = "Ford";
        System.out.println(car1.speed);
        System.out.println(car1.model);

        Car car2 = new Car();
        car2.speed = 123;
        car2.model = "Ford";
        System.out.println(car1 == car2);

        Car car3 = car1;
        System.out.println(car1 == car3);
    }
}
