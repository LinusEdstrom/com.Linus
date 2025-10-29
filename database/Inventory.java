package com.Linus.database;

import com.Linus.entity.Action;
import com.Linus.entity.Dvd;
import com.Linus.entity.DvdPlayer;
import com.Linus.entity.Item;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

    List<Item> itemList = new ArrayList<Item>();

    Item dvdPlayer = new DvdPlayer();





    public List<Item> getItemList() {
        return itemList;
    }
    public void setItemList(List<Item> itemList) {}


    }
}
