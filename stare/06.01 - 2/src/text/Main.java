package text;

public class Main {
    public static void main(String[] args) {
        char myCharVariable = 'a';
        System.out.println("Wartość zmiennej myCharVariable: " + myCharVariable);

        myCharVariable = 97;
        System.out.println(myCharVariable);
        System.out.println('a' == 97);

        System.out.println("Długość tekstu abcde: " + "abcde".length());
        String text = "xyz";
        int textlength = text.length();
        System.out.println("Długość tekstu przypisanego do zmiennej text: " + text.length());

        System.out.println("Klawiatura".charAt(2));

        char firstCharacter = text.charAt(0);
        System.out.println("Pierwszy znak przypisany do zmiennej text: " + firstCharacter);

        int lastCharacterIndex = text.length() - 1;
        System.out.println("Indeks ostatniego znaku tekstu przypisanego do zmiennej text: " + lastCharacterIndex);
        System.out.println("Ostani znak tekstu przypisanego do zmiennej text: " + text.charAt(lastCharacterIndex));

        // 12345
        // 01234
    }
}
