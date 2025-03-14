package caretaker;

import originator.TextEditor;
import memento.EditorMemento;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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

    public void saveToFile(String filePath) throws IOException {
        // TODO: Implement save to file logic
        FileOutputStream fileOutputStream = new FileOutputStream(filePath);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(mementos);
        objectOutputStream.close();
    }

    @SuppressWarnings("unchecked")
    public void loadFromFile(String filePath) throws IOException, ClassNotFoundException {
        // TODO: Implement load from file logic
        FileInputStream fileInputStream = new FileInputStream(filePath);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        mementos = (List<EditorMemento>) objectInputStream.readObject();
        objectInputStream.close();
    }
}
