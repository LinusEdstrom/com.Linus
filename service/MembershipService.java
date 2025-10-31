package com.Linus.service;

import com.Linus.entity.Member;

import java.util.*;

public class MembershipService extends Member {

    public MembershipService(){}

    Scanner scanner = new Scanner(System.in);

    public Member addMember(int id, String name, int status)
    {
        Member newMember = new Member();

        System.out.println("Member Id");
        newMember.setId(scanner.nextInt());
        System.out.println("Member Name");
        newMember.setName(scanner.next());
        System.out.println("Member Status");
        newMember.setStatus(scanner.nextInt());
        return newMember;

    }

            }













