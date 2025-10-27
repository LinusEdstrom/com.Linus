package com.Linus.entity;

public class Dvd extends Item {

    //attribut

    private String title;
    private String description;
    private int length;

    public Dvd (String name, int price, String title, String description, int length)
        {super(name,price);
        this.title =title;
        this.description = description;
        this.length = length;
        }
}
