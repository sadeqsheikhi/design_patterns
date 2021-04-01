package io.sadeq.Observer;

import java.util.ArrayList;
import java.util.List;

public class InstaPage {
    private String name;
    private List<Subscriber> subs = new ArrayList<>();

    public InstaPage(String name) {
        this.name = name;
    }

    public void addSub(Subscriber sub) {
        this.subs.add(sub);
    }

    public void removeSub(Subscriber sub) {
        this.subs.remove(sub);
    }

    public void notifySubs(String msg) {
        for (Subscriber sub:
                this.subs) {
            sub.update(msg);
        }
    }


    public void createPost(String title) {
        // new post in database
        this.notifySubs(title);
    }



}
