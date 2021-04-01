package io.sadeq.Builder;

public class Main {
    public static void main(String[] args) {
        // username = required
        User user = new UserBuilder("sadeq").setAge(23).build();
        System.out.println(user.age);
    }
}
