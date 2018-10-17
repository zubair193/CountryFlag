package com.example.muhammadzubair.countryflag;

public class country {
    private String name;
    private int counrty_flag_Thumbnail;

    public country() {
    }

    public country(String name, int counrty_flag_Thumbnail) {
        this.name = name;
        this.counrty_flag_Thumbnail = counrty_flag_Thumbnail;
    }

    public String getName() {
        return name;
    }

    public int getCounrty_flag_Thumbnail() {
        return counrty_flag_Thumbnail;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCounrty_flag_Thumbnail(int counrty_flag_Thumbnail) {
        this.counrty_flag_Thumbnail = counrty_flag_Thumbnail;
    }
}
