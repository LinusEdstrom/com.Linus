package com.Linus.entity;

public class Horror extends Dvd {

    //attribute

    private int screamScenes;
    private int allowedFromAge;

    public Horror(String name, int price, String title, String description, int lenght, int explosions, int coolOneliners){
        super(name, price, title, description, lenght);
            this.screamScenes = screamScenes;
            this.allowedFromAge = allowedFromAge;

    }


}
