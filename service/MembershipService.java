package com.Linus.service;



import com.Linus.database.MemberRegistry;
import com.Linus.entity.Member;

import java.util.*;

public class MembershipService {

    private final MemberRegistry memberRegistry;

    //constructors

    public MembershipService(MemberRegistry memberRegistry){
        this.memberRegistry = memberRegistry;
    }

    //Metoder

    public Member addMember(int id, String name, int status){
        return memberRegistry.createAndAddMember(id, name, status);



    /*Scanner scanner = new Scanner(System.in);

    public Member addMember(int id, String name, int status)
    {
        /*Member newMember = new Member();

        System.out.println("Member Id");
        newMember.setId(scanner.nextInt());
        System.out.println("Member Name");
        newMember.setName(scanner.next());
        System.out.println("Member Status");
        newMember.setStatus(scanner.nextInt());
        return newMember;

         */




    }

            }













