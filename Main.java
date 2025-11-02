package com.Linus;

import com.Linus.entity.Member;
import com.Linus.service.MembershipService;
import com.Linus.database.MemberRegistry;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;

public class Main {
    static void main(String[] args) {

        MemberRegistry memberRegistry = new MemberRegistry();
        MembershipService membershipService = new MembershipService(memberRegistry);
        fillMemberList(membershipService);

        Scanner scanner = new Scanner(System.in);
        boolean toMeny = true;

        while(toMeny) {
            System.out.println("Menu choices");

            int choice = scanner.nextInt();


            switch (choice) {
                case 1: newDude(scanner, membershipService); break;
                case 2: listAllMembers(membershipService); break;
                case 3: searchMember(scanner, membershipService); break;
                case 4: toMeny = false;  break;
            }

        }

}

        //Metoder för newDude, listAllMembers, searchMember och changeMember
        //Försöker göra så att bara Main har kontakt med användaren för att koppla vidare till MembershipService.

    private static void newDude(Scanner scanner, MembershipService membershipService) {
        System.out.println("member Name");
        String name = scanner.next();
        System.out.println("member Status");
        int status = scanner.nextInt();
        Member member = membershipService.addMember(name, status);
    }
    private static void listAllMembers(MembershipService membershipService) {
        for(Member allMembers : membershipService.listAllMembers()) {
            System.out.println(allMembers.getName()); }

    }
        private static void searchMember(Scanner scanner, MembershipService membershipService) {
        System.out.println("member Name");
        String name = scanner.next();
        boolean exist =membershipService.lookForMember(name);
        if(exist) {System.out.println("Member exists");
        }else{System.out.println("Member does not exist");}
    }
        private static void fillMemberList(MembershipService membershipService) {
            membershipService.addMember("Gunnar", 2);
            membershipService.addMember("Lisa", 1);
            membershipService.addMember("Thor", 3);
            membershipService.addMember("KentJesus", 1);
            membershipService.addMember("Majken", 2);
        }


    }
