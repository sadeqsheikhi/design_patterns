package io.sadeq.Memento;

import java.util.ArrayList;
import java.util.List;

public class History {
    private List<EditorState> contents = new ArrayList<>();

    public void push(EditorState state) {
        this.contents.add(state);
    }

    public EditorState pop() {
        int lastIndex = this.contents.size() -1;
        EditorState res = this.contents.get(lastIndex);
        this.contents.remove(res);
        return res;
    }

}
