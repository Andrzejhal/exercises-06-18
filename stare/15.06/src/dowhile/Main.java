package dowhile;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int x;
        do {
            x = random.nextInt(100);
        }while (x < 90);
        System.out.println(x);

    }
}
