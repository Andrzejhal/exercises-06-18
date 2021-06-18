package breakcontinue;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            if (i % 3 == 0) {
                continue;
            }
            if (i == 20) {
                break;
            }
            System.out.println(i);
        }
    }
}
