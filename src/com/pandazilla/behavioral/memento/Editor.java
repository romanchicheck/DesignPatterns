package com.pandazilla.behavioral.memento;

public class Editor {

    private String content = "";

    public void type(String text){
        content = content.concat(" ").concat(text);
    }

    public String getContent() {
        return content;
    }

    public EditorMemento save(){
        return new EditorMemento(content);
    }

    public void restore(EditorMemento memento){
        content = memento.getContent();
    }
}
