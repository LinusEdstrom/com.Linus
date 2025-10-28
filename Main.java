package com.Linus;


import com.Linus.database.Inventory;
import com.Linus.entity.Item;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

       /* Scanner sc = new Scanner(System.in);
        boolean goMeny = true;

        while(goMeny){}
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        int val;

        switch(val)
            {
            case 1:
                System.out.println();
            }

        */
        Inventory inventory = new Inventory();



        for(Item item : inventory.getItemList()){
            System.out.println(item.name);
        }


    }
}
