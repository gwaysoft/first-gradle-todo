package com.gwaysoft.gradle01.todo.model;

public class TodoItem {
    private String name;
    private boolean isDone;

    public TodoItem(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TodoItem{" +
                "name='" + name + '\'' +
                ", isDone=" + isDone +
                '}';
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

