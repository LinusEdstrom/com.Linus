package com.Linus.database;

import com.Linus.entity.Action;
import com.Linus.entity.Dvd;
import com.Linus.entity.Item;
import com.Linus.entity.Member;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

    private List<Item> inventoryList = new ArrayList<>();

        //constructors


        //Metoder

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


    }



