package methods;

public class Main {
    public static void main(String[] args) {
        System.out.println(add(2, 3));
        int a = add(15, 20);
        System.out.println(a);

    greet("Andrzej");
    }

    // f(x,y) = x + y           x - parametr
    // f(2,3) = 2 + 3 = 5       2 - argument, konkretna wartość, którą parametr przyjmuje
    public static int add(int x, int y) {
        return x + y;
    }

    public static void greet(String name) {
        System.out.println("Witaj " + name + "!");
    }
}

