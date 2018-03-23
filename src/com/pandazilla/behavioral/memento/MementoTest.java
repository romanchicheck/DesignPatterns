package com.pandazilla.behavioral.memento;

public class MementoTest {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.type("Some text");
        editor.type("Wrong text");
        EditorMemento saved = editor.save();
        editor.type("New text");
        System.out.println("Content: " + editor.getContent());
        editor.restore(saved);
        System.out.println("Content: " + editor.getContent());
    }
}
