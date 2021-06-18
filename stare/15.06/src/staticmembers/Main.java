package staticmembers;

public class Main {
    public static void main(String[] args) {
        System.out.println(Cat.getCount());
        Cat cat1 = new Cat(5, 6);
        System.out.println(Cat.getCount());
        Cat cat2 = new Cat(3, 6.5);
        System.out.println(Cat.getCount());

    }
}
