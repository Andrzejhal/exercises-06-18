package pl.sdacademy.drink;

public class Main {
    public static void main(String[] args) {
        Drink drink1 = new Drink(1000, "Woda", true);
        System.out.println("Nazwa: " + drink1.getName());
        System.out.println("Objętość: " + drink1.getVolume());
        System.out.println("Czy gazowany: " + drink1.getSparkling());
        System.out.println(drink1);
    }
}
