package com.Linus.entity;

public class Action extends Dvd {

    //attribute

    private int explosions;
    private int coolOneliners;

        public Action(String name, int price, String title, String description, int length, int explosions, int coolOneliners){
        super(name, price, title, description, length);
        this.explosions = explosions;
        this.coolOneliners = coolOneliners;
    }


    public int getExplosions() {return explosions;}
    public void setExplosions(int explosions) {this.explosions = explosions;}
    public int getCoolOneliners() {return coolOneliners;}
    public void setCoolOneliners() {this.coolOneliners = coolOneliners;}
}
