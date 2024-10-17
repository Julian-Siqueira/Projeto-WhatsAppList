package com.example.whatsapplist.Model;

public class User {

    private int photo;
    private String name;
    private String message;

    public User(int photo, String name, String message) {
        this.photo = photo;
        this.name = name;
        this.message = message;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
