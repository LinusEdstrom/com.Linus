package com.Linus.database;

import com.Linus.entity.Member;


import java.util.*;

public class MemberRegistry {

    public MemberRegistry() {}

    private Set<Member> memberList = new HashSet<>();

    //Metoder

    public Member createAndAddMember(int id, String name, int status){
        Member member = new Member(id, name, status);
        return member;
    }

    }









