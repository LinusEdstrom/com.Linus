package com.Linus.entity;

public class Horror extends Dvd {

    //attribute

    private int allowedFromAge;
    private int screamScenes;

    public Horror(String name, int price, String title, String description, int lenght, int allowedFromAge, screamScenes) {
        super(name, price, title, description, lenght);
        this.allowedFromAge = allowedFromAge;
        this.screamScenes = screamScenes;
        
    }
}
