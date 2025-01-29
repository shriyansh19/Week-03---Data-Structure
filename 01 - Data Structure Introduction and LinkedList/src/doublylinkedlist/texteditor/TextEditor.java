package doublylinkedlist.texteditor;

/**
 * Provides a high-level interface for managing the text editor with undo/redo functionality.
 */
public class TextEditor {
    private TextHistory history;

    // Constructor
    public TextEditor(int maxHistorySize) {
        history = new TextHistory(maxHistorySize);
    }

    // Add a new text state
    public void type(String text) {
        TextState newState = new TextState(text);
        history.addState(newState);
    }

    // Undo the last action
    public void undo() {
        TextState previousState = history.undo();
        if (previousState != null) {
            System.out.println("Undo: " + previousState.getContent());
        }
    }

    // Redo the last undone action
    public void redo() {
        TextState nextState = history.redo();
        if (nextState != null) {
            System.out.println("Redo: " + nextState.getContent());
        }
    }

    // Display the current state of the text
    public void displayCurrentState() {
        TextState currentState = history.getCurrentState();
        if (currentState != null) {
            System.out.println("Current State: " + currentState.getContent());
        } else {
            System.out.println("No text available.");
        }
    }
}