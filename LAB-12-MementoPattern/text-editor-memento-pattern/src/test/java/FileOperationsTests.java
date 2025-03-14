import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import caretaker.History;
import originator.TextEditor;

public class FileOperationsTests {

    @Test
    public void SaveAndLoadState_ShouldPreserveEditorState() throws IOException, ClassNotFoundException {
        TextEditor editor = new TextEditor();
        History history = new History(editor);

        editor.setContent("Hello");
        history.backup();

        String filePath = "editor_state.txt";
        history.saveToFile(filePath);
        history.loadFromFile(filePath);
        assertEquals("Hello", editor.getContent());
    }
}
