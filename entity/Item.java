package com.Linus.entity;

public abstract class Item {

    //attribute

    private String name;
    private int price;

    //constructors

    public Item(){}

    public Item(String name, int price){
        this.name = name;
        this.price = price;
    }

}
