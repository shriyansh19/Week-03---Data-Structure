package stringbuilder.reverse;
import static stringbuilder.reverse.ReverseString.reverseString;

public class Main {
    public static void main(String[] args) {
        String input = "hello";
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reverseString(input));
    }
}
