package com.Linus.entity;

public class RomCom extends Dvd {

    // attribute

    private int cheeziness;
    private int hunks;

    //constructor

    public RomCom() {}

    public RomCom(String name, int price, String title, String description, int lenght, int cheeziness, int hunks) {
      super(name, price, title, description, lenght);
      this.cheeziness = cheeziness;
      this.hunks = hunks;
    }

    public void setCheeziness(int cheeziness) {
        this.cheeziness = cheeziness;}
    public void setHunks(int hunks) {
        this.hunks = hunks;}

    public int getCheeziness(){return cheeziness;}
    public int getHunks(){return hunks;}


}
