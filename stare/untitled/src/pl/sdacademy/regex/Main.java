package pl.sdacademy.regex;

public class Main {
    public static void main(String[] args) {
        System.out.println("1".matches("\\d"));
        System.out.println("123".matches("\\d\\d\\d"));

        System.out.println();

        System.out.println("a".matches("\\w"));
        System.out.println("A".matches("\\w"));
        System.out.println("3".matches("\\w"));
        System.out.println("_".matches("\\w"));

        System.out.println();

        System.out.println("a".matches("."));
        System.out.println("3".matches("."));
        System.out.println("#".matches("."));
        System.out.println("ó".matches("."));

        System.out.println();

        System.out.println("a".matches("a"));
        System.out.println("3".matches("3"));
        System.out.println(" ".matches(" "));
        System.out.println(".".matches("\\."));

        System.out.println();

        System.out.println("123".matches("\\d*"));
        System.out.println("1".matches("\\d*"));
        System.out.println("".matches("\\d*"));

        System.out.println();

        System.out.println("aaa".matches("a+"));
        System.out.println("a".matches("a+"));
        System.out.println("".matches("a+"));

        System.out.println();

        System.out.println("at35G".matches("\\w{5}"));
        System.out.println("33Ab1".matches("\\w{5}"));
        System.out.println("888".matches("8{3,5}"));
        System.out.println("8888".matches("8{3,5}"));
        System.out.println("88888".matches("8{3,5}"));

        System.out.println();

        System.out.println("".matches("k?"));
        System.out.println("k".matches("k?"));
        System.out.println("kk".matches("k?"));

        System.out.println();

        System.out.println("b".matches("[abc]"));
        System.out.println("aabcacb".matches("[abc]*"));
        System.out.println("ceeefd".matches("[c-f]*"));
        System.out.println("".matches("[4-7d-fX-Z]"));

        System.out.println();

        System.out.println("AbcAbcAbc".matches("(Abc)+"));

        System.out.println();

        System.out.println("5xxxABABf".matches("\\dx*(AB)+f?"));
        System.out.println("2AB".matches("\\dx*(AB)+f?"));
    }
}
