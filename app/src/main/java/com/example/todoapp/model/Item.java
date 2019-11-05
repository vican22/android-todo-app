package com.example.todoapp.model;

public class Item {
    private String text;
    private boolean done;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Item(String text, boolean done) {
        this.text = text;
        this.done = done;
    }
}
