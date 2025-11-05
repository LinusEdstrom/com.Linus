package com.Linus.service;

import com.Linus.database.Inventory;
import com.Linus.entity.*;

import java.util.ArrayList;
import java.util.List;

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
    public Action addAction(String name, int price, String title, String description, int length, int explosions, int coolOneliners){
        return inventory.createAndAddAction(name, price, title, description, length, explosions, coolOneliners);
    }
    public RomCom addRomCom(String name, int price, String title, String description, int length, int cheeziness, int hunks){
        return inventory.createAndAddRomCom(name, price, title, description, length, cheeziness, hunks);
    }

    public List<Item> listItems(){
        return new ArrayList<>(inventory.getInventoryList());
    }
    public List<Dvd> listDvds(){
        return inventory.dvdList();
    }
    public List<Action>  listAction(){
        return inventory.actionList();
    }
    public List<RomCom> listRomCom(){
        return inventory.romComList();
    }

}










