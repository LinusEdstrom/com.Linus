package com.Linus.database;

import com.Linus.entity.Member;

import java.util.*;

public class MemberRegistry {

    public MemberRegistry() {}

    // Använd flera datatyper.
    // Går använda metoden values för att enkelt få ut alla värden i memberList.
    private Map<Integer, Member> memberList = new HashMap<>();
    private int nextId = 1;


    //Metoder

        public Member createAndAddMember(String name, int statusLevel){
        int id = nextId++;
        Member member = new Member(id, name, statusLevel);
        // Lite oklart om man lägger id och member i memberList när member just fått värdet från int id ?
        memberList.put(id, member);
        return member;
    }
        // Hämtar alla medlemar till en lista för att arbeta med. perfekt för o göra metoder av.
        public List<Member> listMembers(){
        return new ArrayList<>(memberList.values());
    }

    }









