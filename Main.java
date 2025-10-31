package com.Linus;

import com.Linus.entity.Member;
import com.Linus.service.MembershipService;
import com.Linus.database.MemberRegistry;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        MemberRegistry memberRegistry = new MemberRegistry();
        MembershipService membershipService = new MembershipService(memberRegistry);

        Scanner scanner = new Scanner(System.in);
        boolean toMeny = true;

        while(toMeny) {
            System.out.println("Menu choices");

            int choice = scanner.nextInt();


            switch (choice) {
                case 1: newDude(scanner, membershipService);
                case 2: toMeny = false;  break;
            }



        }

        // Metoder





}

    private static void newDude(Scanner scanner, MembershipService membershipService) {
        System.out.println("member Id");
        int id = scanner.nextInt();
        System.out.println("member Name");
        String name = scanner.next();
        System.out.println("member Status");
        int status = scanner.nextInt();
        Member member = membershipService.addMember(id, name, status);
    }
    }
