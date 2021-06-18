package classes.accessmodifiers.somepackage;

public class A {
    private int x;// private tylko w tej klasie
    int y;        // domyślny tylko w tym pakecie
    public int z; // wszędzie

    public static void main(String[] args) {
        A a = new A();
        a.x = 1;
        a.y = 1;
        a.z = 1;
    }
}
