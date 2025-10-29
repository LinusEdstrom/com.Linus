package com.Linus.entity;

public class Action extends Dvd {

    //attribute

    private int explosions;
    private int coolOneliners;

        public Action(String name, int price, String title, String description, int lenght, int explosions, int coolOneliners){
        super(name, price, title, description, lenght);
        this.explosions = explosions;
        this.coolOneliners = coolOneliners;
    }
}
