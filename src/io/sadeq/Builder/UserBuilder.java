package io.sadeq.Builder;

public class UserBuilder {
    public String username;
    public String number;
    public int age;
    public String socialID;

    public UserBuilder(String username) {
        this.username = username;
    }

    public UserBuilder setUsername(String username) {
        this.username = username;
        return this;
    }

    public UserBuilder setNumber(String number) {
        this.number = number;
        return this;
    }

    public UserBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public UserBuilder setSocialID(String socialID) {
        this.socialID = socialID;
        return this;
    }

    public User build() {
        return new User(this.username, this.number, this.age, this.socialID);
    }
}
