package varargs;

public class Main {
    public static void main(String[] args) {
        System.out.println(add());
        System.out.println(add(5));
        System.out.println(add(2, 6));
        System.out.println(add(2, 6, 5, 234 4653, 654, 234, 345, 3546, 64, 45, 43));

        int[] intArray = {4, 3, 1};
        System.out.println(add(intArray));
    }

    private static int add(int... args) {
        int resoult = 0;
        for (int arg : args) {
            resoult += arg;

        }
        return resoult ;
    }
}
