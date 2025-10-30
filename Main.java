package com.Linus;

import java.util.*;

import com.Linus.entity.Member;

import com.Linus.service.MembershipService;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

       /* System.out.println("add, change, or search members");
        System.out.println(" List items, search items");
        System.out.println("Rent, return");
        System.out.println("Sum revenues");

        Scanner scanner = new Scanner(System.in);
        int val = scanner.nextInt();

        switch (val) {
            case 1:

                break;

        }

        */
            Scanner scanner = new Scanner(System.in);
            MembershipService newMember = new MembershipService();
            newMember.addMember();
    }
}