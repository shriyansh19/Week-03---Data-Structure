package stringbuffer.concatenate;

import static stringbuffer.concatenate.ConcatenateStrings.concatenateStrings;

public class Main {
    public static void main(String[] args) {
        String[] strings = {"Hello", " ", "World", "!"};
        System.out.println("Concatenated String: " + concatenateStrings(strings));
    }
}
