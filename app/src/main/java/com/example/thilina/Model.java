package com.example.thilina;

public class Model {

    private String date;

    private String breakfast;
    private String lunch;
    private String dinner;


    public Model() {
    }

    public Model(String date, String breakfast, String lunch, String dinner) {

        this.date = date;
        this.breakfast = breakfast;
        this.lunch = lunch;
       this. dinner = dinner;
    }



    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getBreakfast() {
        return breakfast;
    }

    public void setBreakfast(String breakfast) {
        this.breakfast = breakfast;
    }

    public String getLunch() {
        return lunch;
    }

    public void setLunch(String lunch) {
        this.lunch = lunch;
    }

    public String getDinner() {
        return dinner;
    }

    public void setDinner(String dinner) {
        this.dinner = dinner;
    }
}
