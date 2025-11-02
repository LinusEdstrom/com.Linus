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
        public String getTitle() {return title;}
        public void setTitle(String title) {this.title = title;}
        public String getDescription() {return description;}
        public void setDescription(String description) {this.description = description;}
        public int getLength() {return length;}
        public void setLength(int length) {this.length = length;}
}
