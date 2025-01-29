package doublylinkedlist.texteditor;

/**
 * Represents a state of the text content in the text editor.
 */
public class TextState {
    private String content;

    // Constructor
    public TextState(String content) {
        this.content = content;
    }

    // Getter
    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return content;
    }
}