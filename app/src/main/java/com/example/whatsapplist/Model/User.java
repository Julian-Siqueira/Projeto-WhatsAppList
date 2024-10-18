package com.example.whatsapplist.Model;

public class User {

    private int photo;
    private String name;
    private String message;
    private String hour;
    private String countMessage;

    public User(int photo, String name, String message, String hour, String countMessage) {
        this.photo = photo;
        this.name = name;
        this.message = message;
        this.hour = hour;
        this.countMessage = countMessage;
    }

    public User(int photo, String name, String message, String hour) {
        this.photo = photo;
        this.name = name;
        this.message = message;
        this.hour = hour;
        this.countMessage = "";
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

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getCountMessage() {
        return countMessage;
    }

    public void setCountMessage(String countMessage) {
            this.countMessage = countMessage;
    }
}
