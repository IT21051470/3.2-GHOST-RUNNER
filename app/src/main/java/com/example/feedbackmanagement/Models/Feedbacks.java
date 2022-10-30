package com.example.feedbackmanagement.Models;

public class Feedbacks {

    String id;
    String name;
    String email;
    String suggession;
    String rate;

    public Feedbacks() {
    }

    public Feedbacks(String id, String name, String email, String suggession, String rate) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.suggession = suggession;
        this.rate = rate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSuggession() {
        return suggession;
    }

    public void setSuggession(String suggession) {
        this.suggession = suggession;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }
}
