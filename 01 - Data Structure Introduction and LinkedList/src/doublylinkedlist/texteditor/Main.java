package doublylinkedlist.texteditor;

/**
 * Main class to demonstrate the Undo/Redo functionality in a text editor.
 */
public class Main {
    public static void main(String[] args) {
        // Create a text editor with a maximum history size of 5
        TextEditor editor = new TextEditor(5);

        // Simulate typing and actions
        editor.type("Hello");
        editor.type("Hello World");
        editor.type("Hello World!");

        // Display current state
        editor.displayCurrentState(); // Output: Current State: Hello World!

        // Undo the last action
        editor.undo(); // Output: Undo: Hello World
        editor.displayCurrentState(); // Output: Current State: Hello World

        // Redo the undone action
        editor.redo(); // Output: Redo: Hello World!
        editor.displayCurrentState(); // Output: Current State: Hello World!

        // Add more states
        editor.type("Hello World!!");
        editor.type("Hello World!!!");

        // Display current state
        editor.displayCurrentState(); // Output: Current State: Hello World!!!

        // Undo multiple times
        editor.undo(); // Output: Undo: Hello World!!
        editor.undo(); // Output: Undo: Hello World!
        editor.displayCurrentState(); // Output: Current State: Hello World!

        // Redo multiple times
        editor.redo(); // Output: Redo: Hello World!!
        editor.redo(); // Output: Redo: Hello World!!!
        editor.displayCurrentState(); // Output: Current State: Hello World!!!

        // Try to redo when there's nothing to redo
        editor.redo(); // Output: Nothing to redo.
    }
}