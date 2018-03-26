package com.pandazilla.behavioral.memento;

public class EditorMemento {

    private String content;

    public EditorMemento(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}