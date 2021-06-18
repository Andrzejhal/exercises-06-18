package pl.sdacademy.drink;

public class Drink {
    private int volume;
    private String name;
    private boolean sparkling;

    public Drink(int volume, String name, boolean sparkling) {
        this.volume = volume;
        this.name = name;
        this.sparkling = sparkling;
    }

    public int getVolume() {
        return volume;
    }

    public String getName() {
        return name;
    }

    public boolean getSparkling(){
        return sparkling;
    }

    public String toString() {
        return "Napój o nazwie: " + name + ", o objętości: " + volume + "ml" + ", czy gazowany: " + sparkling;
    }
}
