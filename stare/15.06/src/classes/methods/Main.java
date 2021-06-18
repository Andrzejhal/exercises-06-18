package classes.methods;

import classes.constructors.Car;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Ford", 123);
        System.out.println("Model samochodu: " + car1.getModel());
        System.out.println("Model samochodu: " + car1.getSpeed());

       // car1. (50);
        System.out.println("Prędkość samochodu: " + car1.());

        car1. ();
        System.out.println("Model samochodu: " + car1.());

        Car car2 = new Car("Citroen C3", 30);
        System.out.println("Prędkość samochodu: " + car2.);
        car2.accelerate();
        System.out.println("Prędkość samochodu: " + car2.g);
    }
}
