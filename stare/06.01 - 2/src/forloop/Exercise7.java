package forloop;

public class Exercise7 {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            String output = "" + i;
            if (i % 2 == 0) {
                output += ", podzielne przez 2";
            }
            if (i % 3 == 0) {
                output += ", podzielne przez 3";
            }
            if (i % 5 == 0) {
                output += ", podzielne przez 5";
            }
            System.out.println(output);
        }
    }
}
