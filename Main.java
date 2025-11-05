package com.Linus;

import com.Linus.database.Inventory;
import com.Linus.entity.*;
import com.Linus.service.MembershipService;
import com.Linus.database.MemberRegistry;
import com.Linus.service.RentalService;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;

public class Main {
    static void main(String[] args) {

        MemberRegistry memberRegistry = new MemberRegistry();
        MembershipService membershipService = new MembershipService(memberRegistry);
        Inventory inventory = new Inventory();
        RentalService rentalService = new RentalService(inventory);
        fillMemberList(membershipService);
        fillActionList(rentalService);
        fillRomComList(rentalService);

        Scanner scanner = new Scanner(System.in);
        boolean toMeny = true;

        while (toMeny) {
            System.out.println("Menu choices");
            System.out.println("");
            System.out.println("1. Create member");
            System.out.println("2. List all members");
            System.out.println("3. Search member");
            System.out.println("");
            System.out.println("4. List all items");
            System.out.println("5. List all dvds");
            System.out.println("");
            System.out.println("6. Add new action movie");
            System.out.println("");
            System.out.println("7. Exit menu");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    newDude(scanner, membershipService);
                    break;
                case 2:
                    listAllMembers(membershipService);
                    break;
                case 3:
                    searchMember(scanner, membershipService);
                    break;
                case 4:
                    listAllItems(rentalService);
                    break;
                case 5:
                    listAllDvds(rentalService);
                    break;
                case 6:
                    addNewAction(scanner, rentalService);
                    break;
                case 7:
                    addNewRomCom(scanner, rentalService);
                    break;
                case 8:
                    listAllAction(rentalService);
                    break;
                case 9:
                    listAllRomCom(rentalService);
                    break;
                case 10:
                    rentDvd(rentalService)
                case 12:
                    toMeny = false;
                    break;

            }

        }

    }

    //Metoder för newDude, listAllMembers, searchMember och changeMember
    //Försöker göra så att bara Main har kontakt med användaren för att koppla vidare till MembershipService.

    private static void rentDvd(RentalService rentalService) {}


    private static void newDude(Scanner scanner, MembershipService membershipService) {
        System.out.println("member Name");
        String name = scanner.next();
        System.out.println("member Status");
        int status = scanner.nextInt();
        Member member = membershipService.addMember(name, status);
    }

    private static void listAllMembers(MembershipService membershipService) {
        for (Member allMembers : membershipService.listAllMembers()) {
            System.out.println(allMembers.getName());
        }

    }

    private static void searchMember(Scanner scanner, MembershipService membershipService) {
        System.out.println("member Name");
        String name = scanner.next();
        boolean exist = membershipService.lookForMember(name);
        if (exist) {
            System.out.println("Member exists");
        } else {
            System.out.println("Member does not exist");
        }
    }

    private static void fillMemberList(MembershipService membershipService) {
        membershipService.addMember("Gunnar", 2);
        membershipService.addMember("Lisa", 1);
        membershipService.addMember("Thor", 3);
        membershipService.addMember("KentJesus", 1);
        membershipService.addMember("Majken", 2);
    }

    private static void fillActionList(RentalService rentalService) {
        rentalService.addAction("Dvd", 38, "WarZone", "Awesome", 120, 18, 13);
        rentalService.addAction("Dvd", 38, "BloodAndMoney", "So and so", 105, 4, 6);
        rentalService.addAction("Dvd", 38, "BackInOmaha", "Epic", 140, 28, 22);
    }
    private static void fillRomComList(RentalService rentalService) {
        rentalService.addRomCom("Dvd", 38, "mr.Gingerbread", "So freakin cute", 162, 42, 1);
        rentalService.addRomCom("Dvd", 38, "Paris in spring", "Lovely", 205, 68, 3);
        rentalService.addRomCom("Dvd", 38, "Two boys in red", "Less is more", 184, 32, 2);
    }

    /*private static void addNewItem(Scanner scanner, RentalService rentalService) {
        System.out.println("Item name");
        String name = scanner.next();
        System.out.println("Item price");
        int price = scanner.nextInt();
        System.out.println("Item title");
        String title = scanner.next();
        System.out.println("Item description");
        String description = scanner.next();
        System.out.println("Item length");
        int length = scanner.nextInt();
        Dvd dvd = rentalService.addItem(name, price, title, description, length);
    }

     */
        private static void addNewAction(Scanner scanner, RentalService rentalService) {
            Action action = new Action();
            System.out.println("Item name");
            action.setName(scanner.next());
            System.out.println("Item price");
            action.setPrice(scanner.nextInt());
            System.out.println("Item title");
            action.setTitle(scanner.next());
            System.out.println("Item description");
            action.setDescription(scanner.next());
            System.out.println("Item length");
            action.setLength(scanner.nextInt());
            System.out.println("Item explosions");
            action.setExplosions(scanner.nextInt());
            System.out.println("Item coolOneliners");
            action.setCoolOneliners(scanner.nextInt());
            rentalService.addAction(action.getName(), action.getPrice(), action.getTitle(), action.getDescription(), action.getLength(), action.getExplosions(), action.getCoolOneliners());
    }
    private static void addNewRomCom(Scanner scanner, RentalService rentalService) {
        RomCom romCom = new RomCom();
        System.out.println("Item name");
        romCom.setName(scanner.next());
        System.out.println("Item price");
        romCom.setPrice(scanner.nextInt());
        System.out.println("Item title");
        romCom.setTitle(scanner.next());
        System.out.println("Item description");
        romCom.setDescription(scanner.next());
        System.out.println("Item length");
        romCom.setLength(scanner.nextInt());
        System.out.println("Item cheeziness");
        romCom.setCheeziness(scanner.nextInt());
        System.out.println("Item hunks");
        romCom.setHunks(scanner.nextInt());
        rentalService.addAction(romCom.getName(), romCom.getPrice(), romCom.getTitle(), romCom.getDescription(), romCom.getLength(), romCom.getCheeziness(), romCom.getHunks());
    }
            //Får bara fram Superklassen Items attribut här, vill ha tag i sub/sub title.
    private static void listAllItems(RentalService rentalService) {
        rentalService.listItems();
        for (Item listItems : rentalService.listItems())
            System.out.println(listItems.getName());
        }

        // Listor

        private static void listAllDvds(RentalService rentalService){
            rentalService.listDvds();
            for (Dvd dvds : rentalService.listDvds())
                System.out.println(dvds.getTitle());
        }
        private static void listAllAction(RentalService rentalService){
            rentalService.listAction();
            for(Action action : rentalService.listAction())
                System.out.println(action.getTitle());
        }
        private static void listAllRomCom(RentalService rentalService){
            rentalService.listRomCom();
            for(RomCom romCom : rentalService.listRomCom())
                System.out.println(romCom.getTitle());
        }


}
