package caretaker;

import originator.TextEditor;
import memento.EditorMemento;
import java.util.ArrayList;
import java.util.List;

public class History {
    private TextEditor textEditor;
    private List<EditorMemento> mementos;

    public History(TextEditor textEditor) {
        this.textEditor = textEditor;
        this.mementos = new ArrayList<>();
    }

    public void backup() {
        EditorMemento memento = textEditor.createMemento();
        mementos.add(memento);
    }

    public void undo() {
        if (!mementos.isEmpty()) {
            EditorMemento memento = mementos.remove(mementos.size() - 1);
            textEditor.restoreFromMemento(memento);
        }
    }
}
