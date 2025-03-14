package originator;

import java.util.List;
import java.util.ArrayList;

public class TextEditor {
    private String content;
    private int cursorPosition;
    private List<String> selections;

    public TextEditor() {
        this.content = "";
        this.cursorPosition = 0;
        this.selections = new ArrayList<>();
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setCursorPosition(int cursorPosition) {
        this.cursorPosition = cursorPosition;
    }

    public void addSelection(String selection) {
        this.selections.add(selection);
    }

    public void displayState() {
        System.out.println("Content: " + content);
        System.out.println("Cursor Position: " + cursorPosition);
        System.out.println("Selections: " + selections);
    }
}
