package text;

public class Exercise1 {
    public static void main(String[] args) {
       // String text = "jakiś text";

       //System.out.println("Długość tekstu: " + "abcde".length());
       //System.out.println(text.length());

       //System.out.println("n\Pierwszy znak:");
       //System.out.println(text.charAt());

        // do zrobienia

        char myCharVariable = 'a';
        System.out.println("Wartość zmiennej myCharVariable: " + myCharVariable);

        System.out.println("Długość tekstu abcde: " + "abcde".length());
        String text = "abxyz";
        int textlength = text.length();
        System.out.println("Długość tekstu przypisanego do zmiennej text: " + text.length());

        char firstCharacter = text.charAt(0);
        System.out.println("Pierwszy znak przypisany do zmiennej text: " + firstCharacter);

        System.out.println("abxyz".charAt(4));

        int lastCharacterIndex = text.length() - 1;
        System.out.println("Indeks ostatniego znaku tekstu przypisanego do zmiennej text: " + lastCharacterIndex);
        System.out.println("Ostani znak tekstu przypisanego do zmiennej text: " + text.charAt(lastCharacterIndex));

    }
}
