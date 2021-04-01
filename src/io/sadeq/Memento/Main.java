package io.sadeq.Memento;

public class Main {
    public static void main(String[] args) {

        Editor notepad = new Editor();
        History hist = new History();

        notepad.setContent("a");
        hist.push(notepad.createState());

        notepad.setContent("b");
        hist.push(notepad.createState());

        notepad.setContent("c");
        notepad.restore(hist.pop());
        notepad.restore(hist.pop());

        System.out.println(notepad.getContent());
    }
}
