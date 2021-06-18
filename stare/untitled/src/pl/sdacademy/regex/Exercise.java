package pl.sdacademy.regex;

public class Exercise {
    public static void main(String[] args) {
        System.out.println("123".matches("\\d*"));
        System.out.println("abc".matches("[a-z]*"));
        System.out.println("51a".matches("\\d+a*"));
        System.out.println("a".matches("5?1?a+")); // ? opconalne wystąpienie wartości
        System.out.println("a 123kXYZ".matches("[a-zA-Z\\d\\s]*"));
        System.out.println("are457jhgjl".matches(".*\\d.*"));
        System.out.println("16.06.2021".matches("\\d\\d\\.\\d\\d\\.\\d\\d\\d\\d")); // . - to dowolny znak
        System.out.println("16.06.2021".matches("(\\d{2}\\.){2}\\d{4}")); // . - to dowolny znak
    }
}
