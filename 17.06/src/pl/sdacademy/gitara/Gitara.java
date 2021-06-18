package pl.sdacademy.gitara;

public class Gitara {
    private boolean elektryczna;
    private boolean nastrojona;
    private int struny;
    private String name;


    public Gitara(boolean elektryczna, boolean nastrojona, int struny, String name) {
        this.elektryczna = elektryczna;
        this.nastrojona = nastrojona;
        this.struny = struny;
        this.name = name;

    }

    public boolean getElektryczna() {
        return elektryczna;
    }
    public boolean getNastrojona() {
        return nastrojona;
    }
    public int getStruny() {
        return struny;
    }
    public String getName() {
        return name;
    }

    public String toString() {
        return "Gitara " + (elektryczna ? "elektryczna" : "")
                + ", Liczba strun: " + struny + ". Czy elektryczna: " + elektryczna + ". " +name;
    }
}
