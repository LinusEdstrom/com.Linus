package com.Linus.entity;

public class RomCom extends Dvd {

    // attribute

    private String cheeziness;
    private int hunks;

    //constructor

    public RomCom(String name, int price, String title, String description, int lenght, String cheeziness, int hunks) {
      super(name, price, title, description, lenght);
      this.cheeziness = cheeziness;
      this.hunks = hunks;
    }

}
