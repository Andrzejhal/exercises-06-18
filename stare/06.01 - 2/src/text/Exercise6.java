package text;

public class Exercise6 {
    public static void main(String[] args) {
        String text = "jakiś text";
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a') {
                count++;
            }
        }
        System.out.println("Liczba wystąpień zanku 'a' w tekscie \"" + text + "\":");
        System.out.println(count);

    }
}
