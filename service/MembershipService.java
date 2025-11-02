package com.Linus.service;



import com.Linus.database.MemberRegistry;
import com.Linus.entity.Member;

import java.util.*;

public class MembershipService {

    // MemberRegistry går bara nå härifrån och går inte ärva från någon annanstans.
    // Går göra om MemberService till ett memberRegistry objekt.
    private final MemberRegistry memberRegistry;

    //constructors

    public MembershipService(MemberRegistry memberRegistry){
        this.memberRegistry = memberRegistry;
    }

    //Metoder

        public Member addMember(String name, int statusLevel){
        return memberRegistry.createAndAddMember(name, statusLevel);
        }
        public List<Member> listAllMembers(){
        return memberRegistry.listMembers();
        }
        public boolean lookForMember(String name){
        List<Member> allMembers = listAllMembers();
        List<String> allMemberNames = new ArrayList<>();
        for(Member member : allMembers){allMemberNames.add(member.getName());}
        return allMemberNames.contains(name);
        }

        }







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








