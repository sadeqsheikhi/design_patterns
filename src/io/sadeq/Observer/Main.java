package io.sadeq.Observer;

public class Main {
    public static void main(String[] args) {
        // Instagram page and subscribers
        Subscriber s1 = new Subscriber("sadeq");
        Subscriber s2 = new Subscriber("sadeq");
        Subscriber s3 = new Subscriber("sadeq");

        InstaPage sadeqIO = new InstaPage("SadeqIO");
        sadeqIO.addSub(s1);
        sadeqIO.addSub(s2);

        sadeqIO.createPost("Design Patterns");
    }
}
