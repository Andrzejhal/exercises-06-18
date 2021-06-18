package pl.sdacademy.javadocs;

/**
 * Reprezentacja pojęcia samochodu. Instancje tej klasy będą
 * konkretnymi wystąpieniami samochodu w aplikacji.
 */
public class Car {
    /**
     * Prędkość samochodu.
     */
    private int speed;

    /**
     * Tworzy samochód o zadanej prędkości.
     * @param speed prędkość tworzonego samochodu
     */
    public Car(int speed) {
        this.speed = speed;
    }

    /**
     * Pobiera prędkość samochodu.
     * @return prędkość samochodu
     */
    public int getSpeed() {
        return speed;
    }
}
