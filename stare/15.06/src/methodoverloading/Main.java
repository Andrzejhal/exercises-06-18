package methodoverloading;

public class Main {
    public static void main(String[] args) {
        System.out.println(add(3, 5));
        System.out.println(add("abc", "def"));
    }

    private static int add(int a, int b) {
        return a + b;

    }

    private static String add(String a, String b) {
        return a + b;

    }

}

