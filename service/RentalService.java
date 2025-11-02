package com.Linus.service;

import com.Linus.database.Inventory;
import com.Linus.entity.Action;
import com.Linus.entity.Dvd;
import com.Linus.entity.Item;
import com.Linus.entity.Member;

public class RentalService {

    //Gör så att bara RentalService kan koppla till inventory.
    private final Inventory inventory;

    public RentalService(Inventory inventory) {
        this.inventory = inventory;
    }
    /*public Action addItem(String name, int price, String title, String description, int length, int explosions, int coolOneliners){
        return inventory.createAndAddItem(name, price, title, description, length, explosions, coolOneliners);
    }

     */
    public void addAction(String name, int price, String title, String description, int length, int explosions, int coolOneliners){
        inventory.createAndAddAction(name, price, title, description, length, explosions, coolOneliners);}


    }





