package com.Linus.database;

import com.Linus.entity.*;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

    private List<Item> inventoryList = new ArrayList<>();

        //constructors


        //Metoder

        public List<Item> listItems(){return new ArrayList<>(inventoryList);
    }

        public Dvd createAndAddItem(String name, int price, String title, String description, int length){
        Dvd dvd = new Dvd(name, price,title,description,length);
        inventoryList.add(dvd);
        return dvd;
    }
        public Action createAndAddAction(String name, int price, String title, String description, int length, int explosions, int coolOneliners){
        Action action = new Action(name, price,title,description,length,  explosions, coolOneliners);
        inventoryList.add(action);
        return action;
    }
        public RomCom createAndAddRomCom(String name, int price, String title, String description, int length, int cheeziness, int hunks){
            RomCom romCom = new RomCom(name, price, title, description, length, cheeziness, hunks);
            inventoryList.add(romCom);
            return romCom;
        }

        public List<Item> getInventoryList() {
        return inventoryList;
    }
        public List<Dvd> dvdList() {
            List<Dvd> dvdList = new ArrayList<>();
            for (Item item : inventoryList) {
                if (item instanceof Dvd dvd) {
                    dvdList.add(dvd);   }
            }
            return dvdList;
        }
        public List<Action> actionList() {
            List<Action> actionList = new ArrayList<>();
            for (Item item : inventoryList) {
                if (item instanceof Action action) {
                    actionList.add(action);}
                }
            return actionList;
            }

        public List<RomCom> romComList() {
            List<RomCom> romComList = new ArrayList<>();
            for (Item item : inventoryList) {
                if (item instanceof RomCom romCom) {
                    romComList.add(romCom); }
                }
            return romComList;
            }
}








