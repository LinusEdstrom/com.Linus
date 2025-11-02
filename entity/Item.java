package com.Linus.entity;

public abstract class Item {

    //attribute

    private String name;
    private int price;

    //constructors
    //Ska inte vara nå items av items den är ju abtrakt, syntax error bip bop.

    public Item(){}

    public Item(String name, int price){
        this.name = name;
        this.price = price;
    }

    public String getName(){return name;}
    public int getPrice(){return price;}
    public void setName(String name){this.name = name;}
    public void setPrice(int price){this.price = price;}



}
