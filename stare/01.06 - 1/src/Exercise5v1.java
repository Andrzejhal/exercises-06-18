public class Exercise5v1 {
    public static void main(String[] args) {
        int x = 5;
        int y = 5;
        int z = 8;

        if (x > y) {
            if (x > z) {
                System.out.println(x);
            } else {
                System.out.println(z);
            }
        } else {
            if (y > z) {
                System.out.println(y);
            } else {
                System.out.println(z);
            }
        }

    }