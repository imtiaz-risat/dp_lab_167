import org.junit.jupiter.api.Test;
import originator.TextEditor;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TextEditorTests {
    
    @Test
    public void setContent_ShouldUpdateContent() {
        TextEditor textEditor = new TextEditor();
        textEditor.setContent("Hello");
        assertEquals("Hello", textEditor.getContent());
    }

}
