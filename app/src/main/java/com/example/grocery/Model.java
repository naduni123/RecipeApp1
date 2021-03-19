package com.example.grocery;

public class Model {

    private String item;
    private String days;

    public Model() {
    }

    public Model(String item,String days) {
        this.item = item;
        this.days = days;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }
}
